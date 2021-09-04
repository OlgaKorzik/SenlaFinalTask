package eu.senla.page.dashboard;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Selenide.*;

public class DashboardPage {
    SelenideElement employeeDistribution = $(By.id("dashboard__employeeDistribution"));
    ElementsCollection tableOfDashboard=$$(By.xpath("//div[@id='panel_wrapper_1']/div/fieldset"));
    SelenideElement distributionLegend =$(By.id("div_graph_display_emp_distribution_legend"));
    SelenideElement taskList = $(By.xpath("//div[@id='task-list-group-panel-menu_holder']"));
    SelenideElement tablePending= $(By.id("panel_draggable_1_2"));
    SelenideElement tableTotal = $("#total > table > tbody");
    ElementsCollection legendBox= $$(By.xpath("//tr/td[1]/div[1]/div[1]"));
    ElementsCollection imgQuickLaunch = $$(By.xpath("//td/div[1]/a[1]/img[1]"));
    ElementsCollection elementsQuickLaunch =$$(By.xpath("//*[@id=\"dashboard-quick-launch-panel-menu_holder\"]//tr/td"));


    @Step("Checking if an element is in the Quick Launch table")
    public SelenideElement existenceElement(String str){
       return  $(By.xpath("//span[contains(text(),\'"+str +"\')]"));
    }

    @Step("Checking if an element is in the legend table")
    public SelenideElement existenceLegendElement(String str){
        return $(By.xpath("//td[contains(text(),\'"+str +"\')]"));
    }
    @Step("Get table from \'Employee Distribution by Subunit\'")
    public SelenideElement getEmployeeDistribution() {
        return employeeDistribution;
    }
    @Step("Get table from \'Dashboard\'")
    public ElementsCollection getTableOfDashboard() {
        return tableOfDashboard;
    }
    @Step("Get hidden element from \'Employee Distribution by Subunit\'")
    public SelenideElement getDistributionLegend() {
        return distributionLegend;
    }
    @Step("Get task list from \'Pending Leave Requests\'")
    public SelenideElement getTaskList() {
        return taskList;
    }
    @Step("Get table \'Pending Leave Requests\'")
    public SelenideElement getTablePending() {
        return tablePending;
    }
    @Step("Get table total from \'Pending Leave Requests\'")
    public SelenideElement getTableTotal() {
        return tableTotal;
    }
    @Step("Get table from page")
    public ElementsCollection getLegendBox() {
        return legendBox;
    }
@Step("Get collection element from \'Quick Launch\'")
    public ElementsCollection getImgQuickLaunch() {
        return imgQuickLaunch;
    }
    @Step("Get collection img from \'Quick Launch\'")
    public ElementsCollection getElementsQuickLaunch() {
        return elementsQuickLaunch;
    }
}
