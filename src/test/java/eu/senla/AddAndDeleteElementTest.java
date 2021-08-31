package eu.senla;

import eu.senla.util.PageMethods;
import io.qameta.allure.*;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static com.codeborne.selenide.Condition.exist;
import static eu.senla.util.IConstants.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class AddAndDeleteElementTest extends BaseClass{
    PageMethods pageMethods = new PageMethods();
    @BeforeEach
    public void login(){
      pageMethods.loginAdmin();
    }

    @Feature("Admin")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Add user test")
    @DisplayName("Check to add new user with existing employee")
    @Test
    public void addUserWithEmployeeTest(){
        pageMethods.addUser(EMPLOYEE_NAME);
        pageMethods.findUser(USERNAME).should(exist);
    }
    @Feature("Admin")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Add user test")
    @DisplayName("Check to add new user")
    @Test
    public void addNewUserTest(){
        pageMethods.addUser(NONEXISTENT_EMPLOYEE_NAME);
        String actualMessage = pageMethods.getMessage();
        String expectedMessage = "Employee does not exist";
        assertEquals(expectedMessage,actualMessage,"Don't have message");
    }
    @Feature("Admin")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Delete user test")
    @DisplayName("Check to delete new user")
    @Test
    public void deleteUserTest(){
        pageMethods.deleteUserFromTable(USERNAME);
        pageMethods.findUser(USERNAME).shouldNot(exist);
    }
    @Feature("Admin")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Add job test")
    @DisplayName("Check to add new job with filling in all fields")
    @Test
    public void addNewFullJobTest(){
        pageMethods.addNewFullJob();
        pageMethods.findJob(JOB_TITLE).should(exist);
    }
    @Feature("Admin")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Delete job test")
    @DisplayName("Check to delete new job")
    @Test
    public void deleteNewFullJobTest(){
        pageMethods.deleteJobFromTable(JOB_TITLE);
        pageMethods.findJob(JOB_TITLE).shouldNot(exist);
    }
    @Feature("Admin")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Parameterized job add test")
    @DisplayName("Check to add new job ")
    @ParameterizedTest
    @ValueSource(strings = {"QA Engineer","Java developer","Assistant aqa"})
    public void addJobTest(String title){
        pageMethods.addNewJob(title);
        pageMethods.findJob(title).should(exist);
    }
    @Feature("Admin")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Parameterized job delete test")
    @DisplayName("Check to delete new job ")
    @ParameterizedTest
    @ValueSource(strings = {"QA Engineer","Java developer","Assistant aqa"})
    public void deleteJobTest(String title){
        pageMethods.deleteJobFromTable(title);
        pageMethods.findJob(title).shouldNot(exist);
    }


    @AfterEach
    public void logout(){
        pageMethods.logout();
    }
}
