package eu.senla.page.leave;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;
import static eu.senla.util.IConstants.*;
public class LeaveAssignPage {
    SelenideElement employeeName = $(By.id("assignleave_txtEmployee_empName"));
    SelenideElement leaveType = $(By.id("assignleave_txtLeaveType"));
    SelenideElement valueLeaveType = $(By.id("//option[contains(text(),'CAN - Bereavement')]"));
    SelenideElement fromData = $(By.id("assignleave_txtFromDate"));
    SelenideElement toData= $(By.id("assignleave_txtToDate"));
    SelenideElement commentLeave = $(By.id("assignleave_txtComment"));
    SelenideElement buttonAssign = $(By.id("assignBtn"));

    @Step("Add assign leave")
    public void addAssign(){
        employeeName.setValue(EMPLOYEE_NAME);
        leaveType.click();
        valueLeaveType.click();
        fromData.setValue(FROM_DATA);
        toData.setValue(TO_DATA);
        commentLeave.setValue(COMMENT);
    }
    @Step("Click button assign")
    public void clickButtonAssign(){
        buttonAssign.click();
    }

}
