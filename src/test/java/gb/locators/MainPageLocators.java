package gb.locators;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class MainPageLocators {
    public By loginButton() {
        return By.xpath("//android.view.ViewGroup[@content-desc=\"Login\"]/android.widget.TextView");
//        return MobileBy.AccessibilityId("Login");
    }
    public By formsButton() {
        return By.xpath("//android.view.ViewGroup[@content-desc=\"Forms\"]/android.widget.TextView");
//        return MobileBy.AccessibilityId("Forms");
    }

    public By homeScreen() {
        return MobileBy.AccessibilityId("Home-screen");
    }

}
