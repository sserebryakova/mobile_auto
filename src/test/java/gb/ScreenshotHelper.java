package gb;

import io.appium.java_client.MobileBy;
import org.testng.annotations.Test;
import gb.base.BaseTest;

import java.io.File;

import static com.codeborne.selenide.Selenide.$;
//Ненастоящий тест. Помогает сделать скриншот для ожидаемого результата.
public class ScreenshotHelper extends BaseTest {

    @Test
    public void createScreen() {
        openApp()
                .clickLoginMenuButton();
        File actualScreenshot = $(MobileBy.AccessibilityId("Login-screen")).screenshot();
    }
}
