package eu.senla.page.admin;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;

public class AddJobTitlePage {
    SelenideElement jobTitle = $(By.id("jobTitle_jobTitle"));
    SelenideElement description = $(By.id("jobTitle_jobDescription"));
    SelenideElement specification = $(By.id("jobTitle_jobSpec"));
    SelenideElement note = $(By.id("jobTitle_note"));
    SelenideElement buttonSave = $(By.id("btnSave"));


    @Step("Set value for job")
    public void setValueJobTitle(String str){
        jobTitle.setValue(str);
    }
    @Step("Set value for description")
    public void setDescription(String str){
        description.setValue(str);
    }
//    @Step("Set value for specification")
//    public void setSpecification(String str){
//        specification.sendKeys(System.getProperty("user.dir")+str);
//    }
    @Step("Set value for note")
    public void setNote(String str){
        note.setValue(str);
    }
    @Step("Click save button")
    public void clickSave(){
        buttonSave.click();
    }
}
