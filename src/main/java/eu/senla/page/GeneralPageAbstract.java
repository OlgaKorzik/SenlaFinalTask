package eu.senla.page;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;

public abstract class GeneralPageAbstract {
    SelenideElement buttonAdd =$(By.id("btnAdd"));
    SelenideElement buttonDelete = $(By.id("btnDelete"));

    @Step("Click add button")
    public void clickAdd(){
        buttonAdd.click();
    }
    @Step("Click delete button")
    public void clickDelete(){
        buttonDelete.click();
    }
    @Step("Find element from table and click box")
    public void findElementAndClickBox(String str){
        $(By.xpath("//a[contains(text(),\'" + str+"\')]/ancestor::tr/td[1]/input[@type='checkbox']")).click();
    }
    @Step("Find element from table")
    public SelenideElement findElement(String str){
     return $(By.xpath("//a[contains(text(),\'" + str+"\')]"));
    }
    @Step("Confirmation of item deletion")
    public void confirmationDelete(){
        switchTo().window(0);
        $(By.id("dialogDeleteBtn")).click();
    }
}
