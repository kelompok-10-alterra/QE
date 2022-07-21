package starter.definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.ClassPage;

public class ClassSteps {
    @Steps
    ClassPage classPage;

    @Given("admin in dashboard page")
        public void adminindashboard(){
        classPage.dashboardpage();
    }

    @When("admin click class page")
    public void adminClickClassPage() {
        classPage.classpage();
    }

    @Then("admin see detail about class")
    public void adminSeeDetailAboutClass() {
        classPage.classdetail();
        
    }

    @When("admin click add new class")
    public void adminClickAddNewClass() {
        classPage.addnewclass();
        
    }

    @And("Admin fill in all that is ordered")
    public void adminFillInAllThatIsOrdered() {
        classPage.roomclick();
        classPage.selectroom();
        classPage.instructureclick();
        classPage.selectinstructure();
        classPage.typeclick();
        classPage.selecttype();
        classPage.descriptionclick("ingin menjadi wingchun terbaik");
        classPage.categoryclick();
        classPage.selectcategory();
        classPage.linkclick("https://www.youtube.com/watch?v=krXMQZ6USKQ");
        classPage.statusclick();
        classPage.selectstatus();
        classPage.capacityclick("7");
        classPage.calenderclick("07/30/2022");
        classPage.priceclick("200000");
    }
    @Then("admin succsess create new class")
    public void adminSuccsessCreateNewClass() {
        classPage.saveclick();
        classPage.yesclick();
        classPage.classdetail();
        
    }

    @And("admin click class on the class page")
    public void adminClickClassOnTheClassPage() {
        classPage.classclick();
        classPage.putclass();
        
    }

    @Then("user succses select or see class")
    public void userSuccsesSelectOrSeeClass() {

    }
}
