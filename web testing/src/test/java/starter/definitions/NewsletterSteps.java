package starter.definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.NewsletterPage;

public class NewsletterSteps {
    @Steps
    NewsletterPage newsletterPage;
    
    @When("admin click newsletter page")
    public void adminClickNewsletterPage() {
        newsletterPage.newsletterpage();
    }

    @And("admin fill in the desired title and fill in the text that matches the title after that click send")
    public void adminFillInTheDesiredTitleAndFillInTheTextThatMatchesTheTitleAfterThatClickSend() {
        newsletterPage.filltitle("pendaftaran awal diskon 50%");
        newsletterPage.filltext("segera mendaftar terbatas hanya untuk 20 orang pendaftar pertama");
    }

    @Then("admin sucsess send the newsletter")
    public void adminSucsessSendTheNewsletter() {
        newsletterPage.newslettersend();
        newsletterPage.clickyespostit();
        
    }

    @Then("admin succses see detail newsletter page")
    public void adminSuccsesSeeDetailNewsletterPage() {
        newsletterPage.Detail();
        
    }

    @And("And admin do not fill in the desired title and fill in the text that matches the title after that click send")
    public void andAdminDoNotFillInTheDesiredTitleAndFillInTheTextThatMatchesTheTitleAfterThatClickSend() {
        newsletterPage.newslettersend();
        newsletterPage.okerror();

    }

    @Given("admin on dashboard page")
    public void adminOnDashboardPage() {
        newsletterPage.pagedashboard();
    }

    @Then("admin don't sucsess send the newsletter")
    public void adminDonTSucsessSendTheNewsletter() {
        newsletterPage.newsletterpage();
    }
}
