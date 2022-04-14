package gb.locators.Android;

import gb.locators.interfaces.SwipePageLocators;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class AndroidSwipePageLocators implements SwipePageLocators {
    @Override
    public By activeSwipeElement() {
        return MobileBy.xpath("(//android.view.ViewGroup[@content-desc=\"card\"])[1]");
    }
}
