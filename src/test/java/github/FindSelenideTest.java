package github;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class FindSelenideTest {

    @Test
    void shouldFindSelenideOnGitHub() {

        //открыть страницу gitHub
        open("https://github.com/selenide/selenide");

        //кликнуть на раздел wiki проекта
        $(byText("Wiki")).click();

        //проверить, что на странице есть SoftAssertions и перейти на неё

        $(byText("Soft assertions")).shouldBe(visible).click();

        //проверить текст
        $(byText("Using JUnit5 extend test class:")).shouldBe(visible);

    }
    }
