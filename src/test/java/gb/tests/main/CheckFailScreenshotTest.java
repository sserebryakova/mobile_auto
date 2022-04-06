package gb.tests.main;

import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import gb.base.BaseTest;
import gb.listeners.AllureListener;

@Listeners(AllureListener.class)
public class CheckFailScreenshotTest extends BaseTest {

    @Test
    @Description("Проверяем поведение теста при неудачной проверки UI главной страницы с помощью скриншота.")
    public void CheckFailMainPageScreenshot() {
        openApp()
                .checkFailScreenshot();
    }
}
