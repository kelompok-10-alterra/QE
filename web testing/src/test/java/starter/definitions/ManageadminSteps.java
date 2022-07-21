package starter.definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.ManageadminPage;

public class ManageadminSteps {
    @Steps
    ManageadminPage manageadminPage;
    @Given("admin dashboard page")
    public void admindashboardpage(){
        manageadminPage.dashboardpage();

    }

    @When("admin click manage admin page and click add new manage admin")
    public void adminClickManageAdminPageAndClickAddNewManageAdmin() {
        manageadminPage.manageadminpage();
        manageadminPage.addnewadmin();
    }

    @And("admin click add new admin then fill in as instructed")
    public void adminClickAddNewAdminThenFillInAsInstructed() {
        manageadminPage.fillname("zcomben");
        manageadminPage.fillusername("comben");
        manageadminPage.fillemail("testabc@gmail.com");
        manageadminPage.fillcontact("0834568212");
        manageadminPage.filladdress("kutai kertanegara");
        manageadminPage.fillpassword("Zcomben123");
    }

    @Then("admin sucsees add new admin")
    public void adminSucseesAddNewAdmin() {
        manageadminPage.clicksave();
        manageadminPage.clickok();
    }

    @When("admin click manage admin page and click")
    public void adminClickManageAdminPageAndClick() {
        manageadminPage.manageadminpage();
    }

    @And("admin click select admin and behind manage admin post")
    public void adminClickSelectAdminAndBehindManageAdminPost() {
        manageadminPage.selectadmin();
        manageadminPage.adminchoose();
    }

    @Then("admin sucsees choose admin select")
    public void adminSucseesChooseAdminSelect() {
        manageadminPage.choosedetail();

    }

    @And("admin click the red image next to the address")
    public void adminClickTheRedImageNextToTheAddress() {
        manageadminPage.deleteadmin();
    }

    @Then("admin sucsees delete admin")
    public void adminSucseesDeleteAdmin() {
        manageadminPage.deleteok();

    }
}
