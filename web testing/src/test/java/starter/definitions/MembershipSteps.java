package starter.definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.MembershipPage;

public class MembershipSteps {
    @Steps
    MembershipPage membershipPage;
    @Given("Admin In dashboard page")
    public void adminInDashboardPage() {
        membershipPage.homepage();
        
    }

    @When("admin click membership page")
    public void adminClickMembershipPage() {
        membershipPage.validateclickmembership();
        
    }

    @And("admin can see detail of membership page")
    public void adminCanSeeDetailOfMembershipPage() {
        membershipPage.canseedetailmembership();
        
    }

    @Then("admin sucsess see membership page")
    public void adminSucsessSeeMembershipPage() {
        
    }

    @And("admin click add new membership")
    public void adminClickAddNewMembership() {
        membershipPage.validateclickmembership();
        membershipPage.addmembership();
        
    }
    

    @And("admin chosee user and chosee membership")
    public void adminChoseeUserAndChoseeMembership() {
        membershipPage.userclick();
        membershipPage.userchoose();
        membershipPage.memberclick();
        membershipPage.memberchoose();

    }



    @And("admin click save")
    public void adminClickSave() {
        membershipPage.buttonsave();
        membershipPage.payy();
        
    }

    @Then("admin sucsess add new membership")
    public void adminSucsessAddNewMembership() {
        membershipPage.okclick();

        
    }

    @And("admin see simbol active on membership page")
    public void adminSeeSimbolActiveOnMembershipPage() {
        membershipPage.seesymbolactive();
        
    }

    @Then("admin sucsess see symbol active")
    public void adminSucsessSeeSymbolActive() {
        membershipPage.canseedetailmembership();
    }
}
