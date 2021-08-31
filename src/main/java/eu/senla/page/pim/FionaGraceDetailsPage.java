package eu.senla.page.pim;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class FionaGraceDetailsPage {
    SelenideElement firstName = $(By.id("personal_txtEmpFirstName"));
    SelenideElement middleName = $(By.id("personal_txtEmpMiddleName"));
    SelenideElement lastName =$(By.id("personal_txtEmpLastName"));
    SelenideElement employeeId = $(By.id("personal_txtEmployeeId"));
    SelenideElement personalID = $(By.id("personal_txtOtherID"));
    SelenideElement driverNumber = $(By.id("personal_txtLicenNo"));
    SelenideElement numberSSN = $(By.id("personal_txtNICNo"));
    SelenideElement personalDate = $(By.id("personal_txtLicExpDate"));
    SelenideElement numberSIN = $(By.id("personal_txtSINNo"));
    SelenideElement genderFemale = $(By.id("personal_optGender_2"));
    SelenideElement genderMale = $(By.id("personal_optGender_1"));
    SelenideElement national =$(By.id("personal_cmbNation"));
    SelenideElement nationalValue = $(By.xpath("//option[contains(text(),'Armenian')]"));
    SelenideElement status = $(By.id("personal_cmbMarital"));
    SelenideElement statusValue = $(By.xpath("//option[contains(text(),'Married')]"));
    SelenideElement dataBirth = $(By.id("personal_DOB"));
    SelenideElement nickName = $(By.id("personal_txtEmpNickName"));
    SelenideElement militarySer = $(By.id("personal_txtMilitarySer"));
    SelenideElement smokerBox = $(By.id("personal_chkSmokeFlag"));
    SelenideElement buttonSave = $(By.id("btnSave"));



}
