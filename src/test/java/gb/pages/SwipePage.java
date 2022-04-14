package gb.pages;

import gb.locators.LocatorService;
import gb.locators.interfaces.SwipePageLocators;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class SwipePage {
    private SwipePageLocators locator() {
        return LocatorService.SWIPE_PAGE_LOCATORS;
    }

    @Step("Проверяем видимость основного элемента")
    public SwipePage checkActiveSwipeElement() {
        $(locator().activeSwipeElement()).isDisplayed();
        return new SwipePage();
    }
}