package gb.locators.Android;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import gb.locators.interfaces.LoginPageLocators;

public class AndroidLoginPageLocators implements LoginPageLocators {
    @Override
    public By loginButton() {
        return MobileBy.AccessibilityId("button-LOGIN");
    }

    @Override
    public By loginErrorText() {
        return  MobileBy.xpath("//android.widget.ScrollView[@content-desc=\"Login-screen\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.TextView[1]");
    }

    @Override
    public By loginScreen() {
        return MobileBy.AccessibilityId("Login-screen");
    }
}
