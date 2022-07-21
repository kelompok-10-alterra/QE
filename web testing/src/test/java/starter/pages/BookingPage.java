package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


public class BookingPage extends PageObject {
    private By admindshboardpage(){
        return By.xpath("//h4[normalize-space()='Analytics']");
    }
    private By adminclickbookingpage(){
        return By.xpath("//div[contains(@class,'style_name__pJdTH')][normalize-space()='Booking']");
    }
    private By adminsuccseslookdetailpage(){
        return By.xpath("//div[@class='style_content_wrapper__3zfEO']//main");
    }
    private By clickaddnewbooking(){
        return By.xpath("//button[@type='button']");
    }
    private By fillinorderedclass(){
        return By.xpath("(//div[@class=' css-319lph-ValueContainer'])[1]");
    }
    private By fillinorderedstatus(){
        return By.xpath("(//div[@class=' css-319lph-ValueContainer'])[2]");
    }
    private By fillinordereduser(){
        return By.xpath("(//div[@class=' css-319lph-ValueContainer'])[3]");

    }
    private By selectclass(){
        return By.xpath("(//div[text()='Wing Chun D - Offline'])");
    }
    private By selectstatus(){
        return By.xpath("(//div[text()='Active'])");
    }
    private By selectuser(){
        return By.xpath("(//div[text()='5 - Rakha'])");
    }

    private By clicksave(){
        return By.xpath("//button[contains(@type,'submit')]");
    }
    private By yessaveit(){
        return By.xpath("//button[text()='Yes, save it!']");
    }
    private By clickokbooking(){
        return By.xpath("//button[text()='OK']");
    }
    private  By selectfilterbooking(){
        return By.xpath("//div[contains(@class,'css-319lph-ValueContainer')]");
    }
    private By selectbooking(){
        return By.xpath("(//div[text()='65 - Monkey D Luffy'])");
    }
    private By filterbooking(){
        return By.xpath("//th[normalize-space()='ID Booking']");
    }


    @Step
    public void openPage(){
        open();
    }
    @Step
    public void dashboardpage(){
       $(admindshboardpage()).isDisplayed();
    }
    @Step
    public void bookingpage(){
        $(adminclickbookingpage()).click();
    }
    @Step
    public void detailbooking(){
        $(adminsuccseslookdetailpage()).isDisplayed();
    }
    @Step
    public void addnewbooking(){
        $(clickaddnewbooking()).click();
    }
    @Step
    public void clickclass(){
        $(fillinorderedclass()).click();
    }
    @Step
    public void clickstatus(){
        $(fillinorderedstatus()).click();
    }
    @Step
    public void clickuser(){
        $(fillinordereduser()).click();
    }
    @Step
    public void saveclick(){
        $(clicksave()).click();
    }
    @Step
    public void clickyessave(){
        $(yessaveit()).click();
    }
    @Step
    public void selectfilter(){
        $(selectfilterbooking()).click();
    }
    @Step
    public void chooseclass(){
        $(selectclass()).click();
    }
    @Step
    public void choosestatus(){
        $(selectstatus()).click();
    }
    @Step
    public void chooseuser(){
        $(selectuser()).click();
    }
    @Step
    public void choosebooking(){
        $(selectbooking()).click();
    }
    @Step
    public void sucsessfilter(){
        $(filterbooking()).isDisplayed();
    }
    @Step
    public void clickok(){
        $(clickokbooking()).click();
    }


}
