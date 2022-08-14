package com.upgenix.stepDefinitions;

import com.upgenix.pages.BasePage;
import com.upgenix.pages.Survey_Musa;
import com.upgenix.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

import static org.junit.Assert.*;



public class SurveysStepDef_Musa {

        Survey_Musa survey_musa = new Survey_Musa();
        @Given("User is on the home page as a {string}.")
        public void user_is_on_the_home_page_as_a(String string) {

            BasePage.loginAsPosManager();



        }
        @When("User should be able to click Surveys button")
        public void user_should_be_able_to_click_surveys_button() {

                survey_musa.surveysBtn.click();

        }
        @When("User should be able to  click Create button")
        public void user_should_be_able_to_click_create_button() {
                survey_musa.createBtn.click();

        }
        @When("User should see Survey {string} header")
        public void user_should_see_survey_header(String string) {

                String expectedHeader = "New - Odoo";
                String actualHeader = Driver.getDriver().getTitle();

        }
        @When("Click {string} button")
        public void click_button(String string) {

                survey_musa.saveBtn.click();

        }
        @When("user can be able to see {string} is appeared.")
        public void user_can_be_able_to_see_is_appeared(String string) {

                assertTrue(survey_musa.errorMessage.isDisplayed());

        }
        @When("user should be able to type {string} to page title")
        public void user_should_be_able_to_type_to_page_title(String string) {

                survey_musa.surveyTitle.sendKeys("Project Owner");

        }
        @When("user should be able to click {string} button")
        public void user_should_be_able_to_click_button(String string) {

                survey_musa.saveBtn.click();
        }
        @Then("{string} message appears under the survey form")
        public void message_appears_under_the_survey_form(String string) {

                survey_musa.surveyCreated.isDisplayed();
        }

        @When("User click Surveys module")
        public void user_click_surveys_module() {

                survey_musa.surveysBtn.click();

        }
        @Then("User should see {string} is listed.")
        public void user_should_see_is_listed(String string) {

                ArrayList<WebElement> list = new ArrayList<WebElement>();
                list.add(survey_musa.verifyJobTitle);

                survey_musa.verifyJobTitle = list.get(list.size() - 1);
                System.out.println("survey_musa.verifyJobTitle.getText() = " + survey_musa.verifyJobTitle.getText());

        }
}





