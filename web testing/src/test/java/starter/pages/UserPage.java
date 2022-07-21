package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class UserPage extends PageObject {
    private By admindashboardpage() {
        return By.xpath("//h4[normalize-space()='Analytics']");
    }

    private By adminclickuserpage() {
        return By.xpath("(//div[text()='User'])[1]");
    }


    private By adminselectuser(){
            return By.xpath("(//div[@class=' css-319lph-ValueContainer'])");
    }
    private By chooseuser(){
            return By.xpath("(//div[text()='5 - Rakha'])");
    }

    private By admindeletuser(){
            return By.xpath("(//tr[7]//td[6]//*[name()='svg'])[2]");
    }
    private By yesdelete(){
            return By.xpath("//button[normalize-space()='Yes, delete it!']");
    }
    private By okdelete(){
        return By.xpath("//button[normalize-space()='OK']");
    }
    private By detailuser(){
        return By.xpath("//th[normalize-space()='ID']");
    }
    @Step
    public void openPage(){
    open();
    }
    @Step
    public void selectuser(){
        $(adminselectuser()).click();
    }
    @Step
    public void userchooser(){
        $(chooseuser()).click();
    }
    @Step
    public void deleteuser(){
        $(admindeletuser()).click();

    }
    @Step
    public void deleteyes(){
        $(yesdelete()).click();
    }
    @Step
    public void deleteok(){
        $(okdelete()).click();
    }


    @Step
    public void userpage(){
        $(adminclickuserpage()).click();
    }
    @Step
    public void Dashboardpage(){
        $(admindashboardpage()).isDisplayed();
    }

    @Step
    public void userdetaul(){
        $(detailuser()).isDisplayed();
    }
}

