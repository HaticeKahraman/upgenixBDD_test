package com.upgenix.stepDefinitions;

import com.upgenix.pages.BasePage;
import com.upgenix.pages.SurveysPage_Melike;
import com.upgenix.utilities.BrowserUtilities;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SurveysStepDef_Melike {
    SurveysPage_Melike surveysPage_melike = new SurveysPage_Melike();

    @Given("User is on the home page as a posmanager")
    public void user_is_on_the_home_page_as_a_posmanager() {

        BasePage.loginAsPosManager();
    }

    @When("User clicks Surveys from the horizontal menu")
    public void user_clicks_from_the_horizontal_menu() {
        BrowserUtilities.waitFor(5);
        surveysPage_melike.surveysLink.click();
    }

    @When("User clicks Create button")
    public void user_clicks_button() {
        BrowserUtilities.waitFor(5);
        surveysPage_melike.createButton.click();

    }

    @Then("User should see Surveys {string} header")
    public void user_should_see_header(String newWord) {

       Assert.assertEquals(surveysPage_melike.Surveys_NewHeader.getText(),newWord);



    }
}
