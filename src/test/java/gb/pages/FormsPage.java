package gb.pages;

import com.codeborne.selenide.Condition;

import com.github.romankh3.image.comparison.ImageComparison;
import com.github.romankh3.image.comparison.ImageComparisonUtil;
import com.github.romankh3.image.comparison.model.ImageComparisonResult;
import com.github.romankh3.image.comparison.model.ImageComparisonState;
import gb.locators.FormsPageLocators;
import io.qameta.allure.Step;

import java.awt.image.BufferedImage;
import java.io.File;

import static com.codeborne.selenide.Selenide.$;
import static org.testng.Assert.assertEquals;

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

    @Step("Делаем скриншот страницы 'forms' и сравниваем с требованием.")
    public FormsPage checkScreenshotFormsPage() {
        // Загружаем ожидаемое изображения для сравнения.
        BufferedImage expectedImage = ImageComparisonUtil.readImageFromResources("src/main/resources/expectedScreenshots/formsPage.png");
        // Делаем актуальный скриншот, используя элемент и игнорируя другие части экрана.
        File actualScreenshot = $(locator().homeScreen()).screenshot();
        // Загружаем актуальный скриншот.
        BufferedImage actualImage = ImageComparisonUtil.readImageFromResources("screenshots/actual/" + actualScreenshot.getName());

        // Где будем хранить скриншот с различиями в случае падения теста.
        File resultDestination = new File("diff/diff_CheckFormsPageScreenshot.png");

        // Сравниваем.
        ImageComparisonResult imageComparisonResult = new ImageComparison(expectedImage, actualImage, resultDestination).compareImages();
        assertEquals(ImageComparisonState.MATCH, imageComparisonResult.getImageComparisonState());
        return this;
    }

}
