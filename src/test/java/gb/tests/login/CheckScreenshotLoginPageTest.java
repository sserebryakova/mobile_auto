package gb.tests.login;

import gb.base.BaseTest;
import gb.listeners.AllureListener;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(AllureListener.class)
public class CheckScreenshotLoginPageTest extends BaseTest {

    @Test
    @Description("Проверяем UI страницы 'login' с помощью скриншота.")
    public void CheckScreenshotLoginPage() {
        openApp()
                .clickLoginMenuButton()
                .checkScreenshotLoginPage();
    }
}
