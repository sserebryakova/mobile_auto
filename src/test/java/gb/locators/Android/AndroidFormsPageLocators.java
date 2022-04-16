package gb.locators.Android;

import gb.locators.interfaces.FormsPageLocators;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class AndroidFormsPageLocators implements FormsPageLocators {
    @Override
    public By activeButton() {
        return MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"button-Active\"]/android.view.ViewGroup/android.widget.TextView");
    }

    @Override
    public By activeButtonWidget() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout");
    }
}
