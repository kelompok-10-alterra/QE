package starter.definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.BookingPage;

public class BookingSteps {
    @Steps
    BookingPage bookingPage ;


    @Given("admin on the dashboard page")
    public void adminOnTheDashboardPage() {
        bookingPage.dashboardpage();
    }

    @When("when admin click booking page")
    public void whenAdminClickBookingPage() {
        bookingPage.bookingpage();

    }

    @Then("admin sucsess look detail booking page")
    public void adminSucsessLookDetailBookingPage() {
        bookingPage.detailbooking();
    }

    ///
    @Given("admin on the booking page")
    public void adminOnTheBookingPage() {
        bookingPage.bookingpage();
    }


    @When("admin click add new booking")
    public void adminClickAddNewBooking() {
        bookingPage.addnewbooking();


    }

    @And("admin fill in all that is ordered")
    public void adminFillInAllThatIsOrdered() {
        bookingPage.clickclass();
        bookingPage.chooseclass();
        bookingPage.clickstatus();
        bookingPage.choosestatus();
        bookingPage.clickuser();
        bookingPage.chooseuser();

    }

    @Then("admin sucsess create new booking")
    public void adminSucsessCreateNewBooking() {
        bookingPage.saveclick();
        bookingPage.clickyessave();
        bookingPage.clickok();
        bookingPage.detailbooking();
    }


    ///
    @When("admin click select booking")
    public void adminClickSelectBooking() {
        bookingPage.selectfilter();
    }

    @And("Admin select filter booking")
    public void adminSelectFilterBooking() {
        bookingPage.choosebooking();
    }

    @Then("admin sucsess select filter booking")
    public void adminSucsessSelectFilterBooking() {
        bookingPage.sucsessfilter();

    }
}
