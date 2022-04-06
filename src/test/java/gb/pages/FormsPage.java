package gb.pages;

import gb.locators.FormsPageLocators;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class FormsPage {
    private FormsPageLocators locator() {
        return new FormsPageLocators();
    }


    @Step("Кликаем по кнопке 'active' в форме")
    public FormsPage clickActiveButton() {
        $(locator().activeButton()).click();
        return new FormsPage();
    }

    @Step("Проверяем появление виджета при клике на кнопку 'аctive' ")
    public FormsPage checkActiveButtonWidget() {
        $(locator().activeButtonWidget()).isDisplayed();
        return new FormsPage();

    }

}
