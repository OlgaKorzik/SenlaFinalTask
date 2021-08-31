package eu.senla;

import com.codeborne.selenide.Configuration;
import eu.senla.page.LoginPage;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class BaseClass {
    @BeforeAll
    public void setUp(){
        Configuration.startMaximized = true;
        LoginPage loginPage = new LoginPage();
        loginPage.openPage();
    }
    @AfterAll
    public void tearDown(){
        closeWebDriver();
    }
}
