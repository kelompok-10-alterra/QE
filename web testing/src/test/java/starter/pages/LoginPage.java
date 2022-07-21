package starter.pages;


import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {
    private By usernameField(){

        return By.xpath("//input[@placeholder='Type your username...']");
    }
    private By passwordField(){

        return By.xpath("//input[@placeholder='Type your password...']");
    }

    private By LoginButton(){

        return By.xpath("//button[@type='submit']");
    }
    private By loginsucses(){
        return By.xpath("//button[normalize-space()='OK']");
    }
    private By homepage(){
        return By.xpath("//h4[normalize-space()='Analytics']");
    }

    @Step
    public void openPage(){

        open();
    }
    @Step
    public void sucseslogin(){
        $(loginsucses()).click();
    }
    @Step
    public boolean validatehomepage(){
       return  $(homepage()).isDisplayed();
    }

    @Step
    public boolean validateonLoginPage(){
       return  $(LoginButton()).isDisplayed();
    }

    @Step
    public void inputusername(String username){
        $(usernameField()).type(username);
    }

    @Step
    public void inputPassword(String password){
        $(passwordField()).type(password);
    }


@Step
    public void clickloginButton() {
        $(LoginButton()).click();
    }
}

