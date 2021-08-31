package eu.senla.util;

import com.codeborne.selenide.SelenideElement;
import eu.senla.page.HeaderPage;
import eu.senla.page.LoginPage;
import eu.senla.page.admin.AddJobTitlePage;
import eu.senla.page.admin.AddUserPage;
import eu.senla.page.admin.AdminUsersPage;
import eu.senla.page.admin.JobTitlesPage;
import io.qameta.allure.Step;

import static eu.senla.util.IConstants.*;


public class PageMethods {
    LoginPage loginPage = new LoginPage();
    HeaderPage headerPage = new HeaderPage();
    AdminUsersPage adminUsersPage =new AdminUsersPage();
    AddUserPage addUserPage = new AddUserPage();
    JobTitlesPage jobTitlesPage = new JobTitlesPage();
    AddJobTitlePage addJobTitlePage = new AddJobTitlePage();

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
    @Step("Add new user")
    public void addUser(String str){
        openUsersPage();
        adminUsersPage.clickAdd();
        addUserPage.setUserRole();
        addUserPage.setEmployeeName(str);
        addUserPage.setUserName(USERNAME);
        addUserPage.setStatus();
        addUserPage.setPassword(USER_PASSWORD);
        addUserPage.setConfirmPassword(USER_PASSWORD);
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
        addJobTitlePage.setSpecification(LINK_SPECIFICATION);
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

}
