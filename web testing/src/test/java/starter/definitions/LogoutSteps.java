package starter.definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.LogoutPage;

public class LogoutSteps {
    @Steps
    LogoutPage logoutPage;
    @Given("admin in the dashboardpage")
    public void admininthedashboardpage() {
        logoutPage.Dashboardpage();

    }

    @When("admin click logutpage")
    public void adminClickLogutpage() {
        logoutPage.logoutpageclick();
    }


    @And("admin logoutpage")
    public void adminLogoutpage() {
        logoutPage.logoutyes();
    }

    @Then("admin sucsess loguout page")
    public void adminSucsessLoguoutPage() {
        logoutPage.logoutsucsess();

    }

}
