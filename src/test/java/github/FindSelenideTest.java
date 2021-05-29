package github;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.screenshot;

public class FindSelenideTest {


    @Test
    void shouldFindSelenideOnGitHub() {

        //открыть страницу gitHub
        Selenide.open("https://github.com");

        //ввести в поле поиска selenide и нажать enter
        Selenide.$("[name=q]").setValue("Selenide").pressEnter();

        //кликнуть на раздел wiki проекта
        Selenide.$$(".menu-item").get(8).click();

        //проверить, что на странице есть SoftAssertions и перейти на неё
        Selenide.$(Selectors.byText("SoftAssertions")).shouldBe(Condition.visible);
        Selenide.$("[title='SoftAssertions']").click();

        //проверить текст
        Selenide.$(Selectors.byText("Using JUnit5 extend test class:")).shouldBe(Condition.visible);


    }
}
