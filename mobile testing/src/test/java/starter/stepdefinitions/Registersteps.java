package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.Registerpages;

public class Registersteps {
    @Steps
    Registerpages registerpages;

    @Given("new user on login page")
    public void newuseronloginpage(){
        registerpages.isOnPage();

    }

    @When("user click icon register")
    public void userclickiconregister(){
        registerpages.tapRegisterLink();

    }
    @And("user input name field")
    public void userinputnamefield(){
        registerpages.inputusername();

    }
    @And("user input email field")
    public void userinputemailfield(){
        registerpages.inputEmail("@gmail.com");

    }
    @And("user input password field")
    public void userinputpasswordfield(){
        registerpages.inputPassword("12345678");

    }
    @Then("user click register button and succses register account")
    public void userclickregisterbuttonandsuccsesregisteraccount(){
        registerpages.tapRegisterButton();

    }


}
