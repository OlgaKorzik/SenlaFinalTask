package eu.senla.page;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static eu.senla.util.IConstants.*;

public class LoginPage {
    SelenideElement loginInput = $(By.id("txtUsername"));
    SelenideElement password = $(By.id("txtPassword"));
    SelenideElement loginInputButton = $(By.id("btnLogin"));
    SelenideElement messageSpan = $(By.id("spanMessage"));

   @Step("Open login page")
   public void openPage(){
       open(URL);
   }

    @Step("Set value from login")
    public void setLogin(String log){
       loginInput.setValue(log);
    }
    @Step("Set value from password")
    public void setPassword(String pass){
        password.setValue(pass);
    }
    @Step("Click input button")
    public void clickInput(){
       loginInputButton.click();
    }
    @Step("get message from login page")
    public String getMessage(){
        return messageSpan.getText();
    }
}
