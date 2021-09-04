package eu.senla.page.dashboard;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Selenide.*;

public class DashboardPage {
    public SelenideElement employeeDistribution = $(By.id("dashboard__employeeDistribution"));
    public ElementsCollection tableOfDashboard=$$(By.xpath("//div[@id='panel_wrapper_1']/div/fieldset"));
    public SelenideElement distributionLegend =$(By.id("div_graph_display_emp_distribution_legend"));
    public SelenideElement taskList = $(By.id("task-list-group-panel-menu_holder"));
    public SelenideElement tablePending= $(By.id("panel_draggable_1_2"));
    public SelenideElement tableTotal = $("#total > table > tbody");
    public ElementsCollection legendBox= $$(By.xpath("//tr/td[1]/div[1]/div[1]"));
    public SelenideElement pendingLeave =$(By.id("task-list-group-panel-container"));
    public ElementsCollection imgQuickLaunch = $$(By.xpath("//td/div[1]/a[1]/img[1]"));
    public ElementsCollection elementsQuickLaunch =$$(By.xpath("//*[@id=\"dashboard-quick-launch-panel-menu_holder\"]//tr/td"));


    @Step("Checking if an element is in the Quick Launch table")
    public SelenideElement existenceElement(String str){
       return  $(By.xpath("//span[contains(text(),\'"+str +"\')]"));
    }

    @Step("Checking if an element is in the legend table")
    public SelenideElement existenceLegendElement(String str){
        return $(By.xpath("//td[contains(text(),\'"+str +"\')]"));
    }

}
