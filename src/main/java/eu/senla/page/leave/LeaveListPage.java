package eu.senla.page.leave;

import com.codeborne.selenide.SelenideElement;
import eu.senla.page.GeneralPageAbstract;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class LeaveListPage extends GeneralPageAbstract {
    SelenideElement allCheckBox = $(By.id("leaveList_chkSearchFilter_checkboxgroup_allcheck"));
    SelenideElement searchButton = $(By.id("btnSearch"));
    @Step("Click all checkbox and search button")
    public void clickButton(){
        allCheckBox.click();
        searchButton.click();
    }
}
