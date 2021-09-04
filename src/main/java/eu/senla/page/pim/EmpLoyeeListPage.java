package eu.senla.page.pim;

import com.codeborne.selenide.SelenideElement;
import eu.senla.page.GeneralPageAbstract;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class EmpLoyeeListPage extends GeneralPageAbstract {
    SelenideElement subUnit = $(By.id("empsearch_sub_unit"));
    SelenideElement valueSubUnit = $("#empsearch_sub_unit > option:nth-child(8)");
    SelenideElement searchButton = $(By.id("searchBtn"));


    @Step("Click sub unit button")
    public void clickSubUnit(){
        subUnit.click();
    }
    @Step("Click sub unit button")
    public void clickValueSubUnit(){
        valueSubUnit.click();
    }
    @Step("Click search button")
    public void clickSearchButton(){
        searchButton.click();
    }

}
