package eu.senla.page.leave;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.*;
import static eu.senla.util.IConstants.*;
public class LeaveAssignPage {
    SelenideElement employeeName = $(By.id("assignleave_txtEmployee_empName"));
    SelenideElement leaveType = $(By.id("assignleave_txtLeaveType"));
    SelenideElement valueLeaveType = $(By.xpath("//option[contains(text(),'CAN - Bereavement')]"));
    SelenideElement fromData = $(By.id("assignleave_txtFromDate"));
    SelenideElement toData= $(By.id("assignleave_txtToDate"));
    SelenideElement commentLeave = $(By.id("assignleave_txtComment"));
    SelenideElement buttonAssign = $(By.id("assignBtn"));
    SelenideElement balanceLink = $(By.id("leaveBalance_details_link"));
    SelenideElement assignBalance = $(By.id("assignleave_leaveBalance"));


    @Step("Click button assign")
    public void clickButtonAssign(){
        buttonAssign.click();
    }
    @Step("Set value employee name")
    public void setEmployeeName(String str){
        employeeName.should(exist);
        employeeName.setValue(str);
    }
    @Step("Click leave type button")
    public void clickLeaveType(){
        leaveType.should(exist);
        leaveType.click();
    }
    @Step("Set value of leave type")
    public void setValueLeaveType(){
        valueLeaveType.should(exist);
        valueLeaveType.click();
    }
    @Step("Set from data")
    public void setFromData(String str){
        fromData.should(exist);
        fromData.setValue(str);
    }
    @Step("Set to data")
    public void setToData(String str){
        toData.should(exist);
        toData.setValue(str);
    }
    @Step("Set comment")
    public void setCommentLeave(String str){
        commentLeave.should(exist);
        commentLeave.setValue(str);
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
    @Step("Check to negative balance")
    public boolean negativeBalance(){
        String st = assignBalance.getText();
        return st.startsWith("-");
    }

}
