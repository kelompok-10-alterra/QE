package starter.pages;

import com.github.javafaker.Faker;
import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.automation.pageobject.BasePageObject;

public class Registerpages extends BasePageObject {
    public String name = createrandomname();

    private String createrandomname() {
        return null;
    }

    private By Registericon (){
     return MobileBy.xpath("//android.widget.Button[@content-desc=\"Register\"]");
 }
 private By usernamefield(){
     return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]");

 }
 private By emailfield(){
     return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]");

 }
 private By passwordfield(){
     return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[3]");

 }
    private By userIcon() {
        return MobileBy.xpath("//android.view.View[contains(@content-desc, 'Products')]/following-sibling::android.widget.Button");
    }
 private By Registerbutton(){
     return MobileBy.xpath("//android.widget.Button[@content-desc=\"Register\"]");

 }
    @Step
    public boolean isOnPage() {
        onClick(userIcon());
        return waitUntilPresence(loginButton()).isDisplayed();
    }

    private By loginButton() {
        return MobileBy.xpath("//android.widget.Button[contains(@content-desc, 'Login')]");
    }

    @Step
    public void tapRegisterLink() {
        onClick(Registericon());
    }
    @Step
    public void inputusername() {
        onClick(usernamefield());
        Faker faker = new Faker();
        name = faker.name().firstName();
        onType(usernamefield(), name);

    }

    @Step
    public void inputEmail(String email) {
        onClick(emailfield());
        onType(emailfield(), name + "@gmail.com");
    }

    @Step
    public void inputPassword(String password) {
        onClick(passwordfield());
        onType(passwordfield(), "12345678");
    }

    @Step
    public void tapRegisterButton() {
        onClick(Registerbutton());
    }

}
