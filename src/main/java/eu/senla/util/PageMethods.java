package eu.senla.util;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import eu.senla.page.HeaderPage;
import eu.senla.page.LoginPage;
import eu.senla.page.admin.AddJobTitlePage;
import eu.senla.page.admin.AddUserPage;
import eu.senla.page.admin.AdminUsersPage;
import eu.senla.page.admin.JobTitlesPage;
import eu.senla.page.leave.LeaveAssignPage;
import eu.senla.page.leave.LeaveListPage;
import eu.senla.page.pim.EmpLoyeeListPage;
import eu.senla.page.pim.NinaPatelDetailsPage;
import eu.senla.page.recruitment.AddCandidatePage;
import eu.senla.page.recruitment.CandidatesPage;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.*;
import static eu.senla.util.IConstants.*;


public class PageMethods {
    LoginPage loginPage = new LoginPage();
    HeaderPage headerPage = new HeaderPage();
    AdminUsersPage adminUsersPage =new AdminUsersPage();
    AddUserPage addUserPage = new AddUserPage();
    JobTitlesPage jobTitlesPage = new JobTitlesPage();
    AddJobTitlePage addJobTitlePage = new AddJobTitlePage();
    CandidatesPage candidatesPage = new CandidatesPage();
    AddCandidatePage addCandidatePage = new AddCandidatePage();
    LeaveAssignPage leaveAssignPage = new LeaveAssignPage();
    LeaveListPage leaveListPage = new LeaveListPage();
    EmpLoyeeListPage empLoyeeListPage = new EmpLoyeeListPage();
    NinaPatelDetailsPage nina = new NinaPatelDetailsPage();
/*----------step from login page----------*/
    @Step("login account administrator")
    public void loginAdmin (){
        loginPage.setLogin(LOGIN_ADMIN);
        loginPage.setPassword(PASSWORD_ADMIN);
        loginPage.clickInput();
           }
    @Step("login account unregistered")
    public void loginUnregistered(){
        loginPage.setLogin(LOGIN_UNREGISTERED);
        loginPage.setPassword(PASSWORD_UNREGISTERED);
        loginPage.clickInput();
    }
    @Step("Logout")
    public void logout(){
        headerPage.logout();
    }
    @Step("Open users page")
    public void openUsersPage(){
        headerPage.menuAdmin.click();
        headerPage.menuUserManager.click();
        headerPage.menuUser.click();
    }
    /*-------step from Admin pages-------*/
    @Step("Add new user")
    public void addUser(String str){
        openUsersPage();
        adminUsersPage.clickAdd();
        addUserPage.getUserRole().should(exist);
        addUserPage.getUserRole().shouldBe(Condition.text("ESS"));
        addUserPage.getEmployeeName().should(exist).setValue(str);
        addUserPage.getUserName().should(exist).setValue(USERNAME);
        addUserPage.getStatus().should(exist);
        addUserPage.getStatus().shouldBe(Condition.text("Enabled"));
        addUserPage.getPassword().should(exist).setValue(USER_PASSWORD);
        addUserPage.getConfirmPassword().should(exist).setValue(USER_PASSWORD);
        addUserPage.clickBtnSave();
    }
    @Step("Get error message")
    public String getMessage(){
        return addUserPage.getMessage();
    }
    @Step("Find user from table")
    public SelenideElement findUser(String str){
      return   adminUsersPage.findElement(str);
    }
    @Step("Delete user from table")
    public void deleteUserFromTable(String str){
        openUsersPage();
        adminUsersPage.findElementAndClickBox(str);
        adminUsersPage.clickDelete();
        adminUsersPage.confirmationDelete();
    }
    @Step("Open job page")
    public void openJobPage(){
        headerPage.menuAdmin.click();
        headerPage.menuAdminJob.click();
        headerPage.menuJobTitle.click();
    }
    @Step("Add new job with filling in all fields")
    public void addNewFullJob(){
        openJobPage();
        jobTitlesPage.clickAdd();
        addJobTitlePage.setValueJobTitle(JOB_TITLE);
        addJobTitlePage.setDescription(DESCRIPTION);
        //addJobTitlePage.setSpecification(LINK_SPECIFICATION);
        addJobTitlePage.setNote(NOTE);
        addJobTitlePage.clickSave();
    }
    @Step("Add 3 new job from parametrized test")
    public void addNewJob(String str){
        openJobPage();
        jobTitlesPage.clickAdd();
        addJobTitlePage.setValueJobTitle(str);
        addJobTitlePage.clickSave();
    }

    @Step("Find job from table")
    public SelenideElement findJob(String str){
        return  jobTitlesPage.findElement(str);
    }
    @Step("Delete job from table")
    public void deleteJobFromTable(String str){
        openJobPage();
        jobTitlesPage.findElementAndClickBox(str);
        jobTitlesPage.clickDelete();
        jobTitlesPage.confirmationDelete();
    }
    /*------step from Recruitment pages--------*/
    @Step("Open candidates page")
    public void openCandidatesPage(){
        headerPage.menuRecruitment.click();
        headerPage.recruitmentCandidates.click();
       }
    @Step("Add candidate from table")
    public void addNewCandidate(){
        openCandidatesPage();
        candidatesPage.clickAdd();
        addCandidatePage.setValueForCandidate();
        addCandidatePage.clickSave();
        addCandidatePage.clickBack();
    }

    @Step("Find job from table")
    public SelenideElement findCandidate(String str){
        return  candidatesPage.findElement(str);
    }
    @Step("Delete candidate from table")
    public void deleteCandidateFromTable(String str){
        openCandidatesPage();
        candidatesPage.findElementAndClickBox(str);
        candidatesPage.clickDelete();
        candidatesPage.confirmationDelete();
    }
    /*-----------step from Leave pages----------*/
    @Step("Open page assign leave")
    public void openAssignLeave(){
        headerPage.menuLeave.click();
        headerPage.menuLeaveAssign.click();
    }
    @Step("Set assign leave")
    public void setAssignLeave(){
        openAssignLeave();
     leaveAssignPage.getEmployeeName().should(exist).setValue(EMPLOYEE_NAME);
     leaveAssignPage.clickLeaveType().should(exist).click();
     leaveAssignPage.setValueLeaveType().should(exist).click();
     leaveAssignPage.getFromData().should(exist).setValue(FROM_DATA);
     leaveAssignPage.getToData().should(exist).setValue(TO_DATA);
     leaveAssignPage.getCommentLeave().should(exist).setValue(COMMENT);
     if(leaveAssignPage.getDetailsLink().contains("Balance not sufficient")){
         leaveAssignPage.clickButtonAssign();
         leaveAssignPage.confirmationAssignLeave();
     }
    }

    @Step("Find assign leave")
    public SelenideElement findAssignLeaveFromTable(String str){
        headerPage.menuLeaveList.click();
        leaveListPage.clickButton();
        return leaveListPage.findElement(str);
    }
    /*------------step from PIM pages----------*/
    @Step("Open Employee List page and selection of employees")
    public void openEmployeeList(){
        headerPage.menuPIM.click();
        headerPage.employeeList.click();
        empLoyeeListPage.clickSubUnit();
        empLoyeeListPage.clickValueSubUnit();
        empLoyeeListPage.clickSearchButton();
    }
    @Step("Find employee on the table")
    public void findEmployee(){
        openEmployeeList();
        SelenideElement element = empLoyeeListPage.findFourthColumnElement(FIRST_NAME_PIM);
  if(element.getText().contains(LAST_NAME_PIM)){
      element.click();
  }
    }
    @Step("Checking items in a form")
    public void shouldElementForm(){
        findEmployee();
        nina.firstName.shouldHave(value(FIRST_NAME_PIM));
        nina.middleName.should(visible);
        nina.lastName.shouldHave(value(LAST_NAME_PIM));
        nina.employeeId.shouldHave(value("0074"));
        nina.driverNumber.should(exist);
        nina.numberSSN.should(exist);
        nina.personalID.should(exist);
        nina.personalDate.should(exist);
        nina.numberSIN.should(exist);
        nina.genderFemale.should(selected);
        nina.national.should(exist);
        nina.nationalValueAmerican.shouldBe(selected);
        nina.status.shouldHave(value("Single"));
        nina.dataBirth.shouldHave(value("1985-08-16"));
        nina.nickName.should(exist);
        nina.militarySer.should(exist);
        nina.smokerBox.should(disabled);
        nina.buttonSave.should(exist);
    }
}
