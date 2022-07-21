package starter.definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.ManageadminPage;
import starter.pages.UserPage;

public class UserSteps {
    @Steps
    UserPage userPage;



    @Given("Admin dashboard page")
    public void Admindashboardpage(){
        userPage.Dashboardpage();
    }

    @And("admin click select user and behind user post")
    public void adminClickSelectUserAndBehindUserPost() {
        userPage.selectuser();
        userPage.userchooser();
        
    }

    @When("admin click user page")
    public void adminClickUserPage() {
        userPage.userpage();

        
    }

    @Then("admin sucsees choose user select")
    public void adminSucseesChooseUserSelect() {
        userPage.userdetaul();
        
    }

    @And("Admin click the red image next to the address")
    public void adminClickTheRedImageNextToTheAddress() {
        userPage.deleteuser();
        userPage.deleteyes();
        
    }

    @Then("admin sucsees delete user")
    public void adminSucseesDeleteUser() {
        userPage.deleteok();
        
    }


}
