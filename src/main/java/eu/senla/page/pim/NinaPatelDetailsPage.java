package eu.senla.page.pim;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class NinaPatelDetailsPage {
    public SelenideElement firstName = $(By.id("personal_txtEmpFirstName"));
    public SelenideElement middleName = $(By.id("personal_txtEmpMiddleName"));
    public SelenideElement lastName =$(By.id("personal_txtEmpLastName"));
    public SelenideElement employeeId = $(By.id("personal_txtEmployeeId"));
    public SelenideElement personalID = $(By.id("personal_txtOtherID"));
    public SelenideElement driverNumber = $(By.id("personal_txtLicenNo"));
    public SelenideElement numberSSN = $(By.id("personal_txtNICNo"));
    public SelenideElement personalDate = $(By.id("personal_txtLicExpDate"));
    public SelenideElement numberSIN = $(By.id("personal_txtSINNo"));
    public SelenideElement genderFemale = $(By.id("personal_optGender_2"));
    public SelenideElement national =$(By.id("personal_cmbNation"));
    public SelenideElement nationalValueAmerican=$(By.xpath("//option[contains(text(),'American')]"));
    public SelenideElement status = $(By.id("personal_cmbMarital"));
    public SelenideElement dataBirth = $(By.id("personal_DOB"));
    public SelenideElement nickName = $(By.id("personal_txtEmpNickName"));
    public SelenideElement militarySer = $(By.id("personal_txtMilitarySer"));
    public SelenideElement smokerBox = $(By.id("personal_chkSmokeFlag"));
    public SelenideElement buttonSave = $(By.id("btnSave"));

   }
