package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class DashboardPage extends PageObject {
    private By Adminondashboardpage(){
        return By.xpath("//h4[normalize-space()='Analytics']");
    }
    private By adminlookonthedashboardpageintherightonthedashboardpage(){
        return By.xpath("//div[@class='react-calendar']");
    }
    private By adminlookonthedashboardpageinrightonthedashboardclickwhichreadsmounth(){
        return By.xpath("//button[@class='react-calendar__navigation__label']");
    }
    private By choosemounth(){
        return By.xpath("//div[contains(@class,'react-calendar__viewContainer')]//button[2]");
    }
    private By looktotaluserandmember(){
        return By.xpath("//canvas[contains(@role,'img')]");
    }
    @Step
    public void openPage(){
        open();
    }
    @Step
    public void dashboardpage(){
        $(Adminondashboardpage()).isDisplayed();
    }
    @Step
    public void adminlookcalender(){
        $(adminlookonthedashboardpageintherightonthedashboardpage()).isDisplayed();
    }
    @Step
    public void adminclickmounth(){
        $(adminlookonthedashboardpageinrightonthedashboardclickwhichreadsmounth()).click();
    }
    @Step
    public void mounthchoose(){
        $(choosemounth()).click();
    }
    @Step
    public void looktotalmemberanduser(){
        $(looktotaluserandmember()).click();
    }

}
