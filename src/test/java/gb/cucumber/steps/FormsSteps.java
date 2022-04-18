package gb.cucumber.steps;

import gb.pages.FormsPage;
import io.cucumber.java.en.*;
import gb.base.BaseTest;

public class FormsSteps extends BaseTest {

    FormsPage formsPage;

    @Given("User is on Forms page")
    public void user_is_on_Forms_page() {
        formsPage = openApp().clickFormsButton();
    }

    @When("User click active button")
    public void user_click_active_button() {
        formsPage.clickActiveButton();
    }

    @Then("User should see active widget")
    public void user_should_see_active_widget() {
       formsPage.checkActiveButtonWidget();
    }
}