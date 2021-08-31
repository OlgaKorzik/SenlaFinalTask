package eu.senla.page.dashboard;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class DashboardPage {
    SelenideElement menuTable = $(By.id("dashboard-quick-launch-panel-menu_holder"));
    ElementsCollection menuTableImg = $$(By.xpath("//td/div[1]/a[1]/img[1]"));
    SelenideElement employeeDistribution = $(By.id("dashboard__employeeDistribution"));
    ElementsCollection legendBox= $$(By.xpath("//tr/td[1]/div[1]/div[1]"));
    SelenideElement pendingLeave =$(By.id("task-list-group-panel-container"));


    @Step("Checking if an element is in the menu table")
    public void existenceElement(String str){
        $(By.xpath("//span[contains(text(),\'"+str +"\')]")).should(exist);
    }
    @Step("Checking if an img is in the menu table")
    public void existenceImg(){
        for(int i =0;i<menuTableImg.size();i++){
            $(By.xpath("//td["+i+"]/div[1]/a[1]/img[1]")).should(exist);
        }
    }
    @Step("Checking if an element is in the legend table")
    public void existenceLegendElement(String str){
        $(By.xpath("//td[contains(text(),\'"+str +"\')]")).should(exist);
    }
    @Step("Checking if an color box is in the legend table")
    public void existenceBox(){
        for(int i=0;i<legendBox.size();i++){
            $(By.xpath("//tr["+i+"]/td[1]/div[1]/div[1]")).should(exist);
        }
    }
}
