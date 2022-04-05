package gb.tests.forms;

import gb.base.BaseTest;
import gb.listeners.AllureListener;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(AllureListener.class)
public class CheckActiveButtonWidgetTest extends BaseTest {
   // public static final String ACTIVE_BUTTON = "This button is аctive";

    @Test
    @Description("Проверяем появление виджета при клике на кнопку 'аctive'")
    public void CheckActiveButtonWidget() {
        openApp()
                .clickFormsButton()
                .clickActiveButton()
                .checkActiveButtonWidget();
    }
}
