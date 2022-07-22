package test.automation.pageobject;

import java.util.HashMap;

public class AndoroidPageObject extends BasePageObject {
    private HashMap<String, String> appiumProperties;

    public HashMap<String, String> getAppiumProperties() {
        return appiumProperties;
    }

    public void setAppiumProperties(HashMap<String, String> appiumProperties) {
        this.appiumProperties = appiumProperties;
    }
}
