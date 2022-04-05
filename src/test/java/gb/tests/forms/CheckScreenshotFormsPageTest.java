package gb.tests.forms;

import gb.base.BaseTest;
import gb.listeners.AllureListener;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(AllureListener.class)
public class CheckScreenshotFormsPageTest extends BaseTest {

    @Test
    @Description("Проверяем UI страницы 'forms' с помощью скриншота.")
    public void CheckScreenshotFormsPage() {
        openApp()
                .clickFormsButton()
                .checkScreenshotFormsPage();
    }
}
