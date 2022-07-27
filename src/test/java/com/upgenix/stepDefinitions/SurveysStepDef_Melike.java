package com.upgenix.stepDefinitions;

import com.upgenix.pages.BasePage;
import com.upgenix.pages.SurveysPage_Melike;
import com.upgenix.utilities.BrowserUtilities;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

public class SurveysStepDef_Melike {
    SurveysPage_Melike surveysPage_melike = new SurveysPage_Melike();

    @Given("User is on the home page as a {string}")
    public void user_is_on_the_home_page_as(String userType) {

        if (userType.equals("posmanager"))
            BasePage.loginAsPosManager();
        else if (userType.equals("salesmanager")) {
            BasePage.loginAsSalesManager();
        }
    }
    @When("User clicks Surveys module")
    public void user_clicks_surveys_module() {

        surveysPage_melike.surveysLink.click();
    }

    @When("User clicks {string} button")
    public void user_clicks_button(String button) {

        switch(button){
            case "Create":
                surveysPage_melike.createButton.click();
                break;
            default:
                surveysPage_melike.saveButton.click();
                break;
        }
    }

    @Then("User should see Surveys {string} header")
    public void user_should_see_header(String newWord) {

        assertEquals(surveysPage_melike.Surveys_NewHeader.getText(), newWord);
    }


    @Then("User should see {string} error message")
    public void user_should_see_error_message(String errorMsg) {
        //System.out.println(surveysPage_melike.errorMessage.getText());
        assertEquals(surveysPage_melike.errorMessage.getText(), errorMsg);

    }

    @When("User writes {string} in the title input box")
    public void user_writes_in_the_title_input_box(String titleName) {
        surveysPage_melike.titleInputBox.sendKeys(titleName);
    }

    @Then("User should see {string} message")
    public void user_should_see_message(String surveyCreatedMsg) {
        //System.out.println(surveysPage_melike.surveyCreatedMessage.getText());
        assertEquals(surveysPage_melike.surveyCreatedMessage.getText(), surveyCreatedMsg);

    }

    @Then("User should see {string} is listed")
    public void user_should_see_is_listed(String createdSurveyTitle) {
        //System.out.println(surveysPage_melike.createdSurvey.getText());
        assertTrue(surveysPage_melike.createdSurvey.isDisplayed());

    }


}
