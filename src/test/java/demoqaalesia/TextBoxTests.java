package demoqaalesia;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {

    @BeforeAll
    static void setUp() {

        Configuration.baseUrl = "https://demoqa.com";
        Configuration.holdBrowserOpen = true;

    }

    @Test
    void fillFormTestAlesia() {
        String name = "Egor";

        open("/text-box");
        $("#userName").setValue(name);
        $("#userEmail").setValue("abramov@egor.com");
        $("#currentAddress").setValue("Via v Jgodje 13");
        $("#permanentAddress").setValue("Cesta v Jgodje 13");
        $("#submit").click();

        $("#output > div #name").shouldHave(text(name));
        $("#output > div #email").shouldHave(text("abramov@egor.com"));
        $("#output > div #currentAddress").shouldHave(text("Via v Jgodje 13"));
        $("#output > div #permanentAddress").shouldHave(text("Cesta v Jgodje 13"));

    }

}
