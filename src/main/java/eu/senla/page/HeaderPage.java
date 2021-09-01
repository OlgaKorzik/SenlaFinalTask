package eu.senla.page;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class HeaderPage {
    public SelenideElement menuWelcome = $(By.id("welcome"));
    public SelenideElement menuLogout =$(By.xpath("//a[contains(text(),'Logout')]"));

    public SelenideElement menuAdmin = $(By.id("menu_admin_viewAdminModule"));
    public SelenideElement menuUserManager = $(By.id("menu_admin_UserManagement"));
    public SelenideElement menuUser = $(By.id("menu_admin_viewSystemUsers"));
    public SelenideElement menuAdminJob = $(By.id("menu_admin_Job"));
    public SelenideElement menuJobTitle = $(By.id("menu_admin_viewJobTitleList"));

    public SelenideElement menuPIM = $(By.id("menu_pim_viewPimModule"));
    public SelenideElement employeeList =$(By.id("menu_pim_viewEmployeeList"));


    public SelenideElement menuRecruitment = $(By.id("menu_recruitment_viewRecruitmentModule"));
    public SelenideElement recruitmentCandidates =$(By.id("menu_recruitment_viewCandidates"));

    public SelenideElement menuLeave = $(By.id("menu_leave_viewLeaveModule"));
    public SelenideElement menuLeaveAssign = $(By.id("menu_leave_assignLeave"));

    public SelenideElement menuDashboard = $(By.id("menu_dashboard_index"));


    @Step("Logout")
    public void logout(){
        menuWelcome.click();
        menuLogout.click();
    }

}
