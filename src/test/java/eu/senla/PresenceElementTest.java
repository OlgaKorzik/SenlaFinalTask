package eu.senla;

import eu.senla.page.dashboard.DashboardPage;
import eu.senla.util.PageMethods;
import io.qameta.allure.*;
import org.junit.jupiter.api.*;


import static com.codeborne.selenide.Condition.*;
import static eu.senla.util.IConstants.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class PresenceElementTest extends BaseClass{
    PageMethods pageMethods = new PageMethods();
    DashboardPage dashboardPage = new DashboardPage();
    @BeforeEach
    public void login(){
        pageMethods.loginAdmin();
    }
    @Feature("Dashboard")
    @Severity(SeverityLevel.NORMAL)
    @Description("Presence of elements")
    @DisplayName("Check to presence of elements on the \"Quick Launch\"")
    @Test
    public void presenceQuickLaunchTest(){
        for(int i =0; i<dashboardPage.elementsQuickLaunch.size(); i++){
            dashboardPage.existenceElement(DATA_TABLE.get(i)).should(exist);
        }
    }
    @Feature("Dashboard")
    @Severity(SeverityLevel.NORMAL)
    @Description("Presence of elements")
    @DisplayName("Check to presence of img on the \"Quick Launch\"")
    @Test
    public void presenceImgQuickLaunchTest(){
          for(int i =0; i<dashboardPage.elementsQuickLaunch.size(); i++){
              dashboardPage.imgQuickLaunch.get(i).shouldBe(visible);
       }
    }
    @Feature("Dashboard")
    @Severity(SeverityLevel.NORMAL)
    @Description("Presence of elements")
    @DisplayName("Check to name table from page")
    @Test
    public void presenceTableTest(){
        for(int i =0, j=0; i<dashboardPage.tableOfDashboard.size(); i++,j++){
            dashboardPage.tableOfDashboard.get(i)
                    .shouldHave(text(TABLE_PAGE.get(j)));
        }
    }
    @Feature("Dashboard")
    @Severity(SeverityLevel.NORMAL)
    @Description("Presence of elements")
    @DisplayName("Check to presence of elements on the \"Legend\"")
    @Test
    public void presenceLegendTest(){
        for(int i =0; i<dashboardPage.legendBox.size(); i++) {
            dashboardPage.existenceLegendElement(TABLE_LEGEND.get(i)).should(exist);
        }}
    @Feature("Dashboard")
    @Severity(SeverityLevel.NORMAL)
    @Description("Presence of elements")
    @DisplayName("Checking if an color box is in the legend table")
    @Test
    public void presenceImgLegendTest(){
        for(int i =0; i<dashboardPage.legendBox.size(); i++){
            dashboardPage.legendBox.get(i).shouldBe(visible);
        }
    }
    @Feature("Dashboard")
    @Severity(SeverityLevel.NORMAL)
    @Description("Presence of elements")
    @DisplayName("Check of presence Employee Distribution by Subunit")
    @Test
    public void presenceTableEmployeeTest(){
       dashboardPage.employeeDistribution.should(exist);
       dashboardPage.distributionLegend.should(hidden);
    }
    @Feature("Dashboard")
    @Severity(SeverityLevel.NORMAL)
    @Description("Presence of elements")
    @DisplayName("Check of presence Pending Leave Requests")
    @Test
    public void presencePendingLeaveTest(){
        dashboardPage.tablePending.should(exist);
        dashboardPage.tableTotal.should(exist);
        dashboardPage.taskList.should(exist);
    }

    @Feature("PIM")
    @Severity(SeverityLevel.NORMAL)
    @Description("Presence of elements")
    @DisplayName("Check to form of employee Personal Details")
    @Test
    public void presenceFormEmployeeTest(){
        pageMethods.shouldElementForm();
    }


            @AfterEach
    public void logout(){
        pageMethods.logout();
    }
}
