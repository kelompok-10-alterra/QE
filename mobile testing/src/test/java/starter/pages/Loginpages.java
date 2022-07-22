package starter.pages;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.automation.pageobject.BasePageObject;

public class Loginpages extends BasePageObject {
    private By registerLink() {
        return MobileBy.id("textViewLinkRegister");
    }

    private By loginButton() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Masuk\"]");
    }

    private By usernameField() {
        return MobileBy.xpath("//android.widget.EditText[contains(@text, 'Username')]");
    }

    private By passwordField() {
        return MobileBy.xpath("//android.widget.EditText[contains(@text, 'Password')]");
    }

    private By userIcon() {
        return MobileBy.xpath("//android.view.View[contains(@content-desc, 'Products')]/following-sibling::android.widget.Button");
    }

    private By toastMessage() {
        return MobileBy.xpath("//android.view.View[@content-desc= 'Email atau password tidak valid.']");
    }
    private By tapiconlewati(){
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Lewati\"]");
    }
    private By tapiconmasuk(){
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Masuk\"]");
    }

    @Step
    public boolean isOnPage() {
        onClick(tapiconlewati());
        onClick(tapiconmasuk());
        return waitUntilPresence(loginButton()).isDisplayed();
    }

    @Step
    public void tapRegisterLink() {
        onClick(registerLink());
    }

    @Step
    public void inputusername(String username) {
        onClick(usernameField());
        onType(usernameField(), username);
    }

    @Step
    public void inputPassword(String password) {
        onClick(passwordField());
        onType(passwordField(), password);
    }

    @Step
    public void tapLoginButton() {
        onClick(loginButton());
    }



}



