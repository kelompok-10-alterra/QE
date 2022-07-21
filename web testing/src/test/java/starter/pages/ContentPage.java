package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ContentPage extends PageObject {
    private By adminthedashboardpage(){
        return By.xpath("//h4[normalize-space()='Analytics']");
    }
    private By adminclickcontentpage(){
        return By.xpath("//div[contains(@class,'style_name__pJdTH')][normalize-space()='Content']");
    }
    private By adminfillintitle(){
        return By.xpath("//input[@placeholder='Type your title here...']");
    }
    private By adminfillinlink(){
        return By.xpath("//textarea[@placeholder='Type your link youtube here...']");
    }
    private By sendcontent(){
        return By.xpath("//button[@type='submit']");
    }
    private By clickok(){
        return By.xpath("//button[normalize-space()='Yes, post it!']");
    }
    private By seecontent(){
        return By.xpath("//div[@class='style_container__DsstA']");
    }
    private By clicklistcontent(){
        return By.xpath("//h5[normalize-space()='List of Content']");
    }
    private By Clickokerror(){
        return By.xpath("//button[text()='OK']");
    }


    @Step
    public void openPage(){

        open();
    }
    @Step
    public void dashboardpage(){
        $(adminthedashboardpage()).isDisplayed();
    }
    @Step
    public void contentpage(){
        $(adminclickcontentpage()).click();
    }
    @Step
    public void filltitle(String title){
        $(adminfillintitle()).type(title);
    }
    @Step
    public void filllink(String link){
        $(adminfillinlink()).type(link);
    }
    @Step
    public void contentsend(){
        $(sendcontent()).click();
    }
    @Step
    public void okclick(){
        $(clickok()).click();
    }
    @Step
    public void contentsee(){
        $(seecontent()).isDisplayed();
    }
    @Step
    public void seelistcontent(){
        $(clicklistcontent()).isDisplayed();
    }
    @Step
    public void okerror(){
        $(Clickokerror()).click();
    }


}
