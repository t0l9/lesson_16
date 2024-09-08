package tests.simple;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.logevents.SelenideLogger.step;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Tag("tests/simple")
public class PositiveTests extends TestBase{

    private final String name = "Anatoliy";

    @Test
    void test1(){
        assertTrue(true);
    }

    @Test
    @Tag("remote")
    void test2(){
        assertTrue(true);

        step("Open form", () -> {
            open("/text-box");

        });
        step("Set name {name}", () -> {
            $("#userName").setValue(name);

        });

        step("Set email", () -> {
            $("#userEmail").setValue("t0l4ik@mail.ru");
        });

        step("set adress", () -> {
            $("#currentAddress").setValue("saina 10");

        });

        step("set adress 2", () -> {
            $("#permanentAddress").setValue("saina 10");

        });

        //$(".btn.btn-primary").click();
        //$("#output").shouldBe(Condition.appear);

    }

    @Test
    @Tag("remote")
    void test3(){
        assertTrue(true);
        //sleep(10000);
    }

    @Test
    @Tag("remote")
    void test4(){
        assertTrue(true);
    }

    @Test
    @Tag("remote")
    void test5(){
        assertTrue(true);
    }

    @Test
    @Tag("remote")
    void test6(){
        assertTrue(true);
    }

    @Test
    @Tag("remote")
    void test7(){
        assertTrue(true);
    }
}
