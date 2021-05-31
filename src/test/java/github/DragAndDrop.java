package github;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class DragAndDrop {

    @Test
    void DragAndDroptest() {

        //открыть страницу сайта

        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("[id=column-a]").dragAndDropTo("[id=column-b]");
        $("[id=column-a]").shouldHave(text("B"));

    }
}
