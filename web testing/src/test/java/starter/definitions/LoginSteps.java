package starter.definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

import starter.pages.LoginPage;

public class LoginSteps {
    @Steps
    LoginPage loginPage;

    @Then("I am on the home pages")
    public void iAmOnTheHomePages() {
        loginPage.validatehomepage();


    }

    @And("admin input valid password")
    public void adminInputValidPassword() {
        loginPage.inputPassword("buatpasswordyangsusah");

    }

    @Given("admin on login page")
    public void adminOnLoginPage() {
        loginPage.openPage();
        loginPage.validateonLoginPage();

    }

    @When("admin input valid ussername")
    public void adminInputValidUssername() {
        loginPage.inputusername("manager");
    }

    @And("click login button")
    public void clickLoginButton() {
        loginPage.clickloginButton();
    }

    @And("click sucsess login")
    public void clickSucsessLogin() {
        loginPage.sucseslogin();
    }
}
