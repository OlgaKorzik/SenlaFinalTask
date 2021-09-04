package eu.senla;

import eu.senla.util.PageMethods;
import io.qameta.allure.*;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import static com.codeborne.selenide.Condition.exist;
import static eu.senla.util.IConstants.*;
import static org.junit.jupiter.api.Assertions.*;

@RunWith(JUnitPlatform.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
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
    @Order(1)
    public void addUserWithEmployeeTest(){
        pageMethods.addUser(EMPLOYEE_NAME);
        pageMethods.findUser(USERNAME).should(exist);
    }
    @Feature("Admin")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Add user test")
    @DisplayName("Check to add new user")
    @Test
    @Order(2)
    public void addNewUserTest(){
        pageMethods.addUser(NONEXISTENT_EMPLOYEE_NAME);
        String actualMessage = pageMethods.getMessage();
        String expectedMessage = "Employee does not exist";
        assertEquals(expectedMessage,actualMessage,"Don't have message");
    }
    @Feature("Admin")
    @Severity(SeverityLevel.MINOR)
    @Description("Delete user test")
    @DisplayName("Check to delete new user")
    @Test
    @Order(3)
    public void deleteUserTest(){
        pageMethods.deleteUserFromTable(USERNAME);
        pageMethods.findUser(USERNAME).shouldNot(exist);
    }
    @Feature("Admin")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Add job test")
    @DisplayName("Check to add new job with filling in all fields")
    @Test
    @Order(4)
    public void addNewFullJobTest(){
        pageMethods.addNewFullJob();
        pageMethods.findJob(JOB_TITLE).should(exist);
    }
    @Feature("Admin")
    @Severity(SeverityLevel.MINOR)
    @Description("Delete job test")
    @DisplayName("Check to delete new job")
    @Test
    @Order(5)
    public void deleteNewFullJobTest(){
        pageMethods.deleteJobFromTable(JOB_TITLE);
        pageMethods.findJob(JOB_TITLE).shouldNot(exist);
    }
    @Feature("Admin")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Parameterized job add test")
    @DisplayName("Check to add new job")
    @ParameterizedTest
    @Order(6)
    @ValueSource(strings = {"QA testJob","Java developer","Assistant aqa"})
    public void addJobTest(String title){
        pageMethods.addNewJob(title);
        pageMethods.findJob(title).should(exist);
    }
    @Feature("Admin")
    @Severity(SeverityLevel.MINOR)
    @Description("Parameterized job delete test")
    @DisplayName("Check to delete new job")
    @ParameterizedTest
    @Order(7)
    @ValueSource(strings = {"QA testJob","Java developer","Assistant aqa"})
    public void deleteJobTest(String title){
        pageMethods.deleteJobFromTable(title);
        pageMethods.findJob(title).shouldNot(exist);
    }
    @Feature("Recruitment")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Add candidates test")
    @DisplayName("Check to add new candidates")
    @Test
    @Order(8)
    public void addCandidatesTest(){
       pageMethods.addNewCandidate();
       pageMethods.findCandidate(FIRST_NAME+" "+MIDDLE_NAME+" "+LAST_NAME).should(exist);
    }
    @Feature("Recruitment")
    @Severity(SeverityLevel.MINOR)
    @Description("Delete candidates test")
    @DisplayName("Check to delete candidates")
    @Test
    @Order(9)
    public void deleteCandidateTest(){
        pageMethods.deleteCandidateFromTable(FIRST_NAME+" "+MIDDLE_NAME+" "+LAST_NAME);
        pageMethods.findCandidate(FIRST_NAME+" "+MIDDLE_NAME+" "+LAST_NAME).shouldNot(exist);
    }
    @Feature("Leave")
    @Severity(SeverityLevel.MINOR)
    @Description("Assign leave test")
    @DisplayName("Check to assign leave without sufficient leave balance")
    @Test
    @Order(10)
    public void assignLeaveTest(){
        pageMethods.setAssignLeave();
        pageMethods.findAssignLeaveFromTable(EMPLOYEE_NAME).should(exist);
         }


    @AfterEach
    public void logout(){
        pageMethods.logout();
    }
}
