package github;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.actions;

public class DragAndDrop {

    @Test
    void DragAndDroptest() {

        //открыть страницу сайта
        Selenide.open("https://the-internet.herokuapp.com/drag_and_drop");
        Selenide.$("[id=column-a]").dragAndDropTo("[id=column-b]");
        Selenide.$("[id=column-a]").shouldHave(Condition.text("B"));

        Selenide.sleep(10000);
    }
}
