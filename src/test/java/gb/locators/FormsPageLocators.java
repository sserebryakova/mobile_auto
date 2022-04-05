package gb.locators;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class FormsPageLocators {
    public By activeButton() {
        return MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"button-Active\"]/android.view.ViewGroup/android.widget.TextView");
    }

    public By activeButtonWidget() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout");
    }

    public By homeScreen() {
        return MobileBy.AccessibilityId("Home-screen");
    }
}
