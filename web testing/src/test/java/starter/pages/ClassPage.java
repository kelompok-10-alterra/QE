package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ClassPage extends PageObject {
    private By adminindashboardpage(){
        return By.xpath("//h4[normalize-space()='Analytics']");
    }
    private By adminclasspage(){
        return By.xpath("//a[@href='/class']");
    }
    private By clickaddnewclass(){
        return By.xpath("//button[@type='button']");
    }
    private By clickroom(){
        return By.xpath("(//div[@class=' css-319lph-ValueContainer'])[1]");
    }
    private By chooseroom(){
        return By.xpath("(//div[text()='B'])");
    }
    private By clickinstructure(){
        return By.xpath("(//div[@class=' css-319lph-ValueContainer'])[2]");
    }
    private By chooseinstructure(){
        return By.xpath("(//div[text()='Gol D Roger'])");
    }
    private By clicktype(){
        return By.xpath("(//div[@class=' css-319lph-ValueContainer'])[3]");
    }
    private By choosetype(){
        return By.xpath("(//div[text()='Zumba'])");
    }
    private By clickdescription(){
        return By.xpath("//textarea[@placeholder='Type class details...']");
    }
    private By clickcategory(){
        return By.xpath("(//div[@class=' css-319lph-ValueContainer'])[4]");
    }
    private By choosecategory(){
        return By.xpath("(//div[text()='Online'])");
    }
    private By clicklink(){
        return By.xpath("//input[@placeholder='Type meeting link ...']");
    }
    private By clickstatus(){
        return By.xpath("(//div[@class=' css-319lph-ValueContainer'])[5]");
    }
    private By choosestatus(){
        return By.xpath("(//div[text()='Active'])");
    }
    private By clickcapacity(){
        return By.xpath("//input[contains(@placeholder,'Type class capacity...')]");
    }
    private By clickcalender(){
        return By.xpath("//input[@placeholder='dd/mm/yy']");
    }
    private By clickprice(){
        return By.xpath("//input[@placeholder='Type class price...']");
    }
    private By clicksave(){
        return By.xpath("//button[@type='submit']");
    }
    private By clickyes(){
        return By.xpath("//button[text()='Yes, save it!']");
    }
    private By selectclass(){
        return By.xpath("(//div[@class=' css-319lph-ValueContainer'])");
    }
    private By chooseclass(){
        return By.xpath("(//div[text()='81 - Wing Chun D Offline'])");
    }
    private By detailclass(){
        return By.xpath("//th[normalize-space()='ID Class']");
    }


    @Step
    public void openPage(){
        open();
    }
    @Step
    public void dashboardpage(){
        $(adminindashboardpage()).isDisplayed();
    }
    @Step
    public void classpage(){
        $(adminclasspage()).click();
    }
    @Step
    public void addnewclass(){
        $(clickaddnewclass()).click();
    }
    @Step
    public void roomclick(){
        $(clickroom()).click();
    }
    @Step
    public void selectroom(){
        $(chooseroom()).click();
    }
    @Step
    public void instructureclick(){
        $(clickinstructure()).click();
    }
    @Step
    public void selectinstructure(){
        $(chooseinstructure()).click();
    }
    @Step
    public void typeclick(){
        $(clicktype()).click();
    }
    @Step
    public void selecttype(){
        $(choosetype()).click();
    }
    @Step
    public void descriptionclick (String descripton){
        $(clickdescription()).type(descripton);
    }
    @Step
    public void categoryclick(){
        $(clickcategory()).click();
    }
    @Step
    public void selectcategory(){
        $(choosecategory()).click();
    }
    @Step
    public void linkclick(String Click){
        $(clicklink()).type(Click);
    }
    @Step
    public void statusclick(){
        $(clickstatus()).click();
    }
    @Step
    public void selectstatus(){
        $(choosestatus()).click();
    }
    @Step
    public void capacityclick(String capacity) {
        $(clickcapacity()).type(capacity);
    }
    @Step
    public void calenderclick(String Calender){
        $(clickcalender()).type(Calender);
    }
    @Step
    public void priceclick(String price){
        $( clickprice()).type(price);
    }
    @Step
    public void saveclick(){
        $(clicksave()).click();
    }
    @Step
    public void yesclick(){
        $(clickyes()).click();
    }
    @Step
    public void classclick(){
        $(selectclass()).click();
    }
    @Step
    public void putclass(){
        $(chooseclass()).click();
    }
    @Step
    public void classdetail(){
        $(detailclass()).isDisplayed();
    }



}
