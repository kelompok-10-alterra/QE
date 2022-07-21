package starter.definitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.DashboardPage;

public class DashboardSteps {
    @Steps
    DashboardPage dashboardPage;

    @Given("Admin on the dashboard page")
    public void adminOnTheDashboardPage() {
        dashboardPage.dashboardpage();
        
    }

    @When("admin look on the dashboard page in the right on the dashboard page")
    public void adminLookOnTheDashboardPageInTheRightOnTheDashboardPage() {
        dashboardPage.adminlookcalender();
        
    }

    @Then("admin sucsess look date on the dashboard page")
    public void adminSucsessLookDateOnTheDashboardPage() {
    }
    
    //
    @When("admin look on the dashboard page in right on the dashboard click which reads mounth")
    public void adminLookOnTheDashboardPageInRightOnTheDashboardClickWhichReadsMounth() {
        dashboardPage.adminclickmounth();
        dashboardPage.mounthchoose();
    }

    @Then("admin sucsess changes mounth and year on the dashboard")
    public void adminSucsessChangesMounthAndYearOnTheDashboard() {
    }

    
    ///
    @When("admin look on the dashboard page and look analytics on the dashbord and click total user and total member")
    public void adminLookOnTheDashboardPageAndLookAnalyticsOnTheDashbordAndClickTotalUserAndTotalMember() {
        dashboardPage.looktotalmemberanduser();
    }

    @Then("admin sucsess click total user and total member")
    public void adminSucsessClickTotalUserAndTotalMember() {
    }


}
