package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class MembershipPage extends PageObject {
    private By seedashboardpage(){
        return By.xpath("//h4[normalize-space()='Analytics']");
    }
    private By clickmembership(){
        return By.xpath("//div[@class='style_name__pJdTH'][normalize-space()='Membership']");
    }
    private By seemembership(){
        return By.xpath("//th[normalize-space()='ID']");
    }
    private By clickaddmembership(){
        return By.xpath("//button[@type='button']");
    }
    private By clickuser(){
        return By.xpath(" (//div[@class=' css-1s2u09g-control'])[1]");
    }
    private By clickmember(){
        return By.xpath("//div[contains(@class,'style_container__XUILf')]//div[2]//div[1]//div[1]//div[2]//div[1]//*[name()='svg']");
    }
    private By clicksave(){
        return By.xpath("//button[contains(@type,'submit')]");
    }
    private By selectuser(){
        return By.xpath("//div[text()='5 - Rakha']");
    }
    private By selectmember(){

        return By.xpath("//div[text()='Gold']");
    }
    private By paymember(){
        return By.xpath("//button[normalize-space()='Pay']");
    }
    private By symbolactive(){
        return By.xpath("(//td[contains(text(),'Active')])[2]");
    }
    private By clickok(){
        return By.xpath("//button[normalize-space()='OK']");
    }



    @Step
    public void openPage(){
        open();
    }
    @Step
    public void homepage(){
        $(seedashboardpage()).isDisplayed();
    }
    @Step
    public void validateclickmembership(){
        $(clickmembership()).click();
    }
    @Step
    public void canseedetailmembership(){
        $(seemembership()).isDisplayed();
    }
    @Step
    public void addmembership(){
        $(clickaddmembership()).click();
    }
    @Step
    public void memberclick(){
        $(clickmember()).click();
    }
    @Step
    public void userchoose(){
        $(selectuser()).click();
    }
    @Step
    public void userclick() {
        $(clickuser()).click();
    }
    @Step
    public void memberchoose(){
        $(selectmember()).click();
    }
    @Step
    public void buttonsave(){
        $(clicksave()).click();
    }
    @Step
    public void payy(){
        $(paymember()).click();
    }
    @Step
    public void seesymbolactive(){
        $(symbolactive()).isDisplayed();
    }
    @Step
    public void okclick(){
        $(clickok()).click();
    }

}
