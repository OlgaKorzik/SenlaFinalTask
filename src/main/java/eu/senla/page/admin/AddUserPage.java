package eu.senla.page.admin;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.*;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class AddUserPage {
    SelenideElement userRole = $(By.id("systemUser_userType"));
    SelenideElement employeeName = $(By.id("systemUser_employeeName_empName"));
    SelenideElement userName = $(By.id("systemUser_userName"));
    SelenideElement status = $(By.id("systemUser_status"));
    SelenideElement statusEnabled = $(By.xpath("//option[contains(text(),'Enabled')]"));
    SelenideElement password = $(By.id("systemUser_password"));
    SelenideElement confirmPassword = $(By.id("systemUser_confirmPassword"));
    SelenideElement buttonSave = $(By.id("btnSave"));
    SelenideElement message =$(By.xpath("//span[contains(text(),'Employee does not exist')]"));


    @Step("Get message")
    public String getMessage(){
        return message.getText();
    }
    @Step("Click for button Save")
    public void clickBtnSave(){
        buttonSave.click();
    }
    @Step("Set value from role")
    public void setUserRole(){
        userRole.should(exist);
        userRole.shouldBe(Condition.text("ESS"));
    }
    @Step("Set value from employee name")
    public void setEmployeeName(String str){
        employeeName.should(exist);
        employeeName.setValue(str);
    }
    @Step("Set value from user name")
    public void setUserName(String str){
        userName.should(exist);
        userName.setValue(str);
    }
    @Step("Set value from status")
    public void setStatus(){
        status.should(exist);
        status.shouldBe(Condition.text("Enabled"));
    }
    @Step("Set value from password")
    public void setPassword(String str){
        password.should(exist);
        password.setValue(str);
    }
    @Step("Set value from confirm password")
    public void setConfirmPassword(String str){
        confirmPassword.should(exist);
        confirmPassword.setValue(str);
    }

}
