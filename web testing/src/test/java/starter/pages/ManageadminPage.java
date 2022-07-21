package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ManageadminPage extends PageObject {
    private By admindashboardpage(){

        return By.xpath("//h4[normalize-space()='Analytics']");
    }
    private By adminclickmanageadminpage(){
        return By.xpath("//a[@href='/admin']");
    }
    private By adminaddnewmanageadmin(){
        return By.xpath("//button[@type='button']");
    }
    private By adminfillinusername(){
        return By.xpath("//input[@placeholder='Type admin username...']");
    }
    private By adminfillinname(){
        return By.xpath("//input[contains(@placeholder,'Type admin name...')]");
    }
    private By adminfillinemail(){
        return By.xpath("//input[@placeholder='Type admin email...']");
    }
    private By adminfillincontact(){
        return By.xpath("//input[@placeholder='Type admin contact...']");
    }
    private By adminfillinaddress(){
        return By.xpath("//input[@placeholder='Type admin address...']");
    }
    private By adminfillinpassword(){
        return By.xpath("//input[@placeholder='Type admin password...']");
    }
    private By adminclicksend(){
        return By.xpath("//button[@type='submit']");
    }
    private By adminclickbuttonok(){
        return By.xpath("//button[text()='Yes, save it!']");
    }
    private By adminselectadmin(){
        return By.xpath("//div[contains(@class,' css-319lph-ValueContainer')]");
    }
    private By admindeleteadmin(){
        return By.xpath("(//tr[2]//td[6]//*[name()='svg'])[2]");
    }
    private By yesdelete(){
        return By.xpath("//button[text()='Yes, delete it!']");
    }
    private By chooseadmin(){
        return By.xpath("(//div[text()='2 - Admin'])");
    }
    private By detailadminchoose(){
        return By.xpath("//th[normalize-space()='ID']");
    }
    @Step
    public void openPage(){

        open();
    }
    @Step
    public void dashboardpage(){
        $(admindashboardpage()).isDisplayed();
    }
    @Step
    public void manageadminpage(){
        $(adminclickmanageadminpage()).click();
    }
    @Step
    public void addnewadmin(){
        $(adminaddnewmanageadmin()).click();
    }
    @Step
    public void fillname(String name){
        $(adminfillinname()).type(name);
    }
    @Step
    public void fillusername(String username){
        $(adminfillinusername()).type(username);

    }
    @Step
    public void fillemail(String email){
        $(adminfillinemail()).type(email);

    }
    @Step
    public void fillcontact(String contact){
        $(adminfillincontact()).type(contact);

    }
    @Step
    public void filladdress(String address){
        $(adminfillinaddress()).type(address);

    }
    @Step
    public void fillpassword(String password){
        $(adminfillinpassword()).type(password);

    }
    @Step
    public void clicksave(){
        $(adminclicksend()).click();
    }
    @Step
    public void clickok(){
        $(adminclickbuttonok()).click();
    }
    @Step
    public void selectadmin(){
        $(adminselectadmin()).click();
    }
    @Step
    public void deleteadmin(){
        $(admindeleteadmin()).click();
    }
    @Step
    public void deleteok(){
        $(yesdelete()).click();
    }
    @Step
    public void adminchoose(){
        $(chooseadmin()).click();
    }
    @Step
    public void choosedetail(){
        $(detailadminchoose()).isDisplayed();
    }


}
