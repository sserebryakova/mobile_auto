package gb.tests.forms;

import gb.base.BaseTest;
import gb.listeners.AllureListener;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(AllureListener.class)
public class CheckActiveButtonWidgetTest extends BaseTest {

    @Test
    @Description("Проверяем появление виджета при клике на кнопку 'аctive'")
    public void CheckActiveButtonWidget() {
        openApp()
                .clickFormsButton()
                .clickActiveButton()
                .checkActiveButtonWidget();
    }
}
