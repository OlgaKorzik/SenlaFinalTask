package eu.senla.page.admin;

import com.codeborne.selenide.*;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;

public class AddUserPage {
    SelenideElement userRole = $(By.id("systemUser_userType"));
    SelenideElement employeeName = $(By.id("systemUser_employeeName_empName"));
    SelenideElement userName = $(By.id("systemUser_userName"));
    SelenideElement status = $(By.id("systemUser_status"));
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
    public SelenideElement getUserRole(){
        return userRole;
    }
    @Step("Set value from employee name")
    public SelenideElement getEmployeeName(){
       return employeeName;
    }
    @Step("Set value from user name")
    public SelenideElement getUserName(){
        return userName;
    }
    @Step("Set value from status")
    public SelenideElement getStatus(){
        return status;
    }
    @Step("Set value from password")
    public SelenideElement getPassword(){
        return password;
    }
    @Step("Set value from confirm password")
    public SelenideElement getConfirmPassword(){
        return confirmPassword;
    }

}
