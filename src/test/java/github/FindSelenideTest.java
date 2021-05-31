package github;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.ex.DialogTextMismatch;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.visible;

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
