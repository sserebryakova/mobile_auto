package gb.tests.Swipe;

import gb.base.BaseTest;
import gb.listeners.AllureListener;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(AllureListener.class)
public class CheckActiveSwipeElementTest extends BaseTest {

    @Test
    @Description("Проверяем видимость основного элемента")
    public void checkActiveSwipeElement() {
        openApp()
                .clickSwipeButton()
                .checkActiveSwipeElement();
        }
    }

