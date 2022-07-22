package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LogoutPage extends PageObject {
  private By adminindashboardpage(){
      return By.xpath("//h4[normalize-space()='Analytics']");
  }
  private By adminclicklogoutpage(){
      return By.xpath("//div[normalize-space()='Logout']");
  }
  private By yeslogout(){
      return By.xpath("//button[normalize-space()='Yes, logout!']");
  }
  private By sucsesslogout(){
      return By.xpath("//button[normalize-space()='OK']");
  }
    @Step
    public void openPage(){
        open();
    }
    @Step
    public void Dashboardpage(){
      $(adminindashboardpage()).isDisplayed();
    }
    @Step
    public void logoutpageclick(){
      $(adminclicklogoutpage()).click();
    }
    @Step
    public void logoutyes(){
      $(yeslogout()).click();
    }
    @Step
    public void logoutsucsess(){
      $(sucsesslogout()).click();
    }
}
