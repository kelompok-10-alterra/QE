package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class NewsletterPage extends PageObject {
    private By adminondashboardpage(){
        return By.xpath("//h4[normalize-space()='Analytics']");
    }
    private By  adminclicknewsletterpage(){
        return By.xpath("//a[@href='/newsletter']");
    }
    private By adminfillinthedesiredtitle(){
        return By.xpath("//input[contains(@placeholder,'Type your title here...')]");
    }
    private By fillinthetextthatmatchesthetitleafterthatclicksend() {
        return By.xpath("//textarea[@placeholder='Type your text here...']");
    }
    private By sendnewsletter(){
        return By.xpath("//button[@type='submit']");
    }
    private  By yespostit(){
        return By.xpath("//button[normalize-space()='Yes, post it!']");
    }
    private By error(){
        return By.xpath("//button[text()='OK']");
    }
    private By detailnewsletter(){
        return By.xpath("//body/div[@id='root']/div[@class='app_container']/div[@class='private-routes-container']/div[@class='private-routes-wrapper']/div[2]");
    }

    @Step
    public void openPage(){
        open();
    }
    @Step
    public void pagedashboard(){
        $(adminondashboardpage()).isDisplayed();
    }
    @Step
    public void newsletterpage(){
        $(adminclicknewsletterpage()).click();
    }
    @Step
    public void filltitle (String title){
        $(adminfillinthedesiredtitle()).type(title);
    }
    @Step
    public void filltext (String text){
        $(fillinthetextthatmatchesthetitleafterthatclicksend()).type(text);
    }
    @Step
    public void newslettersend () {
        $(sendnewsletter()).click();
    }
    @Step
    public void clickyespostit () {
        $(yespostit()).click();
    }
    @Step
    public void okerror () {
        $(error()).click();
    }
    @Step
    public void Detail(){
        $(detailnewsletter()).isDisplayed();
    }

}