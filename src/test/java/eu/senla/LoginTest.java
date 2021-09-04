package eu.senla;

import eu.senla.page.LoginPage;
import eu.senla.util.PageMethods;
import io.qameta.allure.*;
import org.junit.jupiter.api.*;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import static com.codeborne.selenide.WebDriverRunner.url;
import static eu.senla.util.IConstants.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(JUnitPlatform.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class LoginTest extends BaseClass{
PageMethods pageMethods = new PageMethods();
LoginPage loginPage = new LoginPage();
@BeforeEach
public void openPage(){
    loginPage.openPage();
}
    @Feature("Login")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Login test")
    @DisplayName("Check to login from admin on the page")
    @Test
    public void loginAdminTest(){
        pageMethods.loginAdmin();
        String pageUrl = url();
        assertEquals(URL_PAGE,pageUrl,"User doesn't logged out");
    }

    @Feature("Login")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Login test")
    @DisplayName("Check to login unregistered user on the page")
    @Test
    public void loginUnregisterdTest(){
        pageMethods.loginUnregistered();
        String actualMessage = loginPage.getMessage();
        String expectedMessage = "Invalid credentials";
        assertEquals(expectedMessage,actualMessage,"Don't have message");
    }
    @Feature("Login")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Login test")
    @DisplayName("Check to don't set value password")
    @Test
    public void setValueLoginTest(){
        loginPage.setLogin(LOGIN_ADMIN);
        loginPage.clickInput();
        String actualMessage = loginPage.getMessage();
        String expectedMessage = "Password cannot be empty";
        assertEquals(expectedMessage,actualMessage,"Don't have message");
    }
    @Feature("Login")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Login test")
    @DisplayName("Check to don't set value login")
    @Test
    public void setValuePasswordTest(){
        loginPage.setPassword(PASSWORD_ADMIN);
        loginPage.clickInput();
        String actualMessage = loginPage.getMessage();
        String expectedMessage = "Username cannot be empty";
        assertEquals(expectedMessage,actualMessage,"Don't have message");
    }

}
