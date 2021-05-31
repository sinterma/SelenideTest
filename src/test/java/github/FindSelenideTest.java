package github;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.ex.DialogTextMismatch;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class FindSelenideTest {


    @Test
    void shouldFindSelenideOnGitHub() {




        //открыть страницу gitHub
        open("https://github.com");

        //ввести в поле поиска selenide и нажать enter
        $("[name=q]").setValue("Selenide").pressEnter();

        //кликнуть на раздел wiki проекта
        $$(".menu-item").get(8).click();

        //проверить, что на странице есть SoftAssertions и перейти на неё
        $(byText("SoftAssertions")).shouldBe(Condition.visible);
        $("[title='SoftAssertions']").click();

        //проверить текст
        $(byText("Using JUnit5 extend test class:")).shouldBe(Condition.visible);


    }
    }
