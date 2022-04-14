package gb.locators.Android;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import gb.locators.interfaces.MainPageLocators;

public class AndroidMainPageLocators implements MainPageLocators {
    @Override
    public By loginButton() {
        return By.xpath("//android.view.ViewGroup[@content-desc=\"Login\"]/android.widget.TextView");
    }

    @Override
    public By formsButton() {
        return By.xpath("//android.view.ViewGroup[@content-desc=\"Forms\"]/android.widget.TextView");
    }

    @Override
    public By swipeButton() {
        return By.xpath("//android.view.ViewGroup[@content-desc=\"Swipe\"]/android.widget.TextView");

    }
    @Override
    public By homeScreen() {
        return MobileBy.AccessibilityId("Home-screen");
    }
}

