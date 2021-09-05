package eu.senla.page.recruitment;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;
import static eu.senla.util.IConstants.*;

public class AddCandidatePage {

    SelenideElement firstName = $(By.id("addCandidate_firstName"));
    SelenideElement middleName = $(By.id("addCandidate_middleName"));
    SelenideElement lastName = $(By.id("addCandidate_lastName"));
    SelenideElement email = $(By.id("addCandidate_email"));
    SelenideElement contact = $(By.id("addCandidate_contactNo"));
    SelenideElement jobVacancy = $(By.id("addCandidate_vacancy"));
    SelenideElement valueJobVacancy =$(By.xpath("//option[contains(text(),'Software Engineer')]"));
    SelenideElement resume = $(By.id("addCandidate_resume"));
    SelenideElement keyWords = $(By.id("addCandidate_keyWords"));
    SelenideElement comment =$(By.id("addCandidate_comment"));
    SelenideElement appliedDate = $(By.id("addCandidate_appliedDate"));
    SelenideElement consentToKeepData = $(By.id("addCandidate_consentToKeepData"));
    SelenideElement buttonSave = $(By.id("btnSave"));
    SelenideElement buttonBack = $(By.id("btnBack"));

    @Step("Set value for new candidate")
    public void setValueForCandidate(){
        firstName.setValue(FIRST_NAME);
        middleName.setValue(MIDDLE_NAME);
        lastName.setValue(LAST_NAME);
        email.setValue(EMAIL);
        contact.setValue(CONTACT);
        jobVacancy.click();
        valueJobVacancy.click();
        keyWords.setValue(KEY_WORD);
        comment.setValue(COMMENT);
        appliedDate.setValue(DATE);
        consentToKeepData.click();
    }
    @Step("Click save button")
    public void clickSave(){
        buttonSave.click();
    }
    @Step("Click back button")
    public void clickBack(){
        buttonBack.click();
    }
}
