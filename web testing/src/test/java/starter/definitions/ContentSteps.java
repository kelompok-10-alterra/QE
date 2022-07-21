package starter.definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.ClassPage;
import starter.pages.ContentPage;

public class ContentSteps {
    @Steps
    ContentPage contentPage;

    @Given("admin the dashboard page")
    public void adminTheDashboardPage() {
        contentPage.dashboardpage();
    }

    @When("admin click content page")
    public void adminClickContentPage() {
        contentPage.contentpage();

    }

    @And("admin fill in the desired title and fill link after that click send")
    public void adminFillInTheDesiredTitleAndFillLinkAfterThatClickSend() {
        contentPage.filltitle("Tutorial Treadmill");
        contentPage.filllink("https://www.youtube.com/watch?v=-On27nSClRo");
    }

    @Then("admin sucsess send the content")
    public void adminSucsessSendTheContent() {
        contentPage.contentsend();
        contentPage.okclick();
        contentPage.contentsee();
    }

    @And("admin see when you burn fat,where does it go on the list of content")
    public void adminSeeWhenYouBurnFatWhereDoesItGoOnTheListOfContent() {
        contentPage.seelistcontent();
    }

    @Then("admin sucsess click list of content")
    public void adminSucsessClickListOfContent() {
        contentPage.seelistcontent();
    }

    @And("admin do not fill in the desired title and fill link after that click send")
    public void adminDoNotFillInTheDesiredTitleAndFillLinkAfterThatClickSend() {
        contentPage.contentsend();
        contentPage.okerror();
    }

    @Then("admin  send the content error")
    public void adminSendTheContentError() {
        contentPage.contentpage();
    }
}
