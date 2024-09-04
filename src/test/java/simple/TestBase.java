package simple;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Map;



public class TestBase {

    @BeforeEach
    void addListener(){
        //Добавляем лисенер чтобы показывалась в аллюре шаги
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }

    @AfterEach
    void addAttachments(){
        Attach.screenshotAs("last screnshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        //Attach.video();
    }

    @BeforeAll
    static void beforeAll(){
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920*1080";
        Configuration.browser = "chrome";
        Configuration.browserVersion = "126.0";
        Configuration.remote = "https://user1:1234@selenoid.autotests.cloud/wd/hub";

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("selenoid:options", Map.<String, Object>of(
            "enableVNC", true,
            "enableVideo", true
        ));

        Configuration.browserCapabilities = capabilities;
    }
}
