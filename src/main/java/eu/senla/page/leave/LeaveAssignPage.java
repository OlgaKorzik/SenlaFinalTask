package eu.senla.page.leave;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.*;

public class LeaveAssignPage {
    SelenideElement employeeName = $(By.id("assignleave_txtEmployee_empName"));
    SelenideElement leaveType = $(By.id("assignleave_txtLeaveType"));
    SelenideElement valueLeaveType = $(By.xpath("//option[contains(text(),'CAN - Bereavement')]"));
    SelenideElement fromData = $(By.id("assignleave_txtFromDate"));
    SelenideElement toData= $(By.id("assignleave_txtToDate"));
    SelenideElement commentLeave = $(By.id("assignleave_txtComment"));
    SelenideElement buttonAssign = $(By.id("assignBtn"));
    SelenideElement balanceLink = $(By.id("leaveBalance_details_link"));

    @Step("Click button assign")
    public void clickButtonAssign(){
        buttonAssign.pressEnter();
    }
    @Step("Get value employee name")
    public SelenideElement getEmployeeName(){
       return employeeName;
    }
    @Step("Click leave type button")
    public SelenideElement clickLeaveType(){
        return leaveType;
    }
    @Step("Get value of leave type")
    public SelenideElement setValueLeaveType(){
        valueLeaveType.should(exist);
        return valueLeaveType;
    }
    @Step("Get from data")
    public SelenideElement getFromData(){
        return fromData;
    }
    @Step("Get to data")
    public SelenideElement getToData(){
        return toData;
    }
    @Step("Get comment")
    public SelenideElement getCommentLeave(){
       return commentLeave;
    }
    @Step("Get information from details assign leave")
    public String getDetailsLink(){
        return balanceLink.getText();
    }
    @Step("Confirmation of assign leave")
    public void confirmationAssignLeave(){
        switchTo().window(0);
        $(By.id("confirmOkButton")).click();
    }


}
