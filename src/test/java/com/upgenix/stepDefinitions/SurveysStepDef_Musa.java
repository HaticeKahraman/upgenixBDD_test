package com.upgenix.stepDefinitions;

import com.upgenix.pages.BasePage;
import com.upgenix.pages.Survey_Musa;
import com.upgenix.utilities.BrowserUtilities;
import com.upgenix.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Set;

import static org.junit.Assert.*;

public class SurveysStepDef_Musa {

    Survey_Musa survey_musa = new Survey_Musa() ;

    @Given("User is on the home page as a {string}.")
    public void user_is_on_the_home_page_as_a(String Manager) {

       if(Manager.equals("posmanager"))
           BasePage.loginAsPosManager();
       else if (Manager.equals("salesmanager"))
           BasePage.loginAsSalesManager();

       }


    @When("User click Surveys button")
    public void user_click_surveys_button() {
        BrowserUtilities.sleep(5);
        survey_musa.surveysBtn.click();


    }
    @When("User click Create button")
    public void user_click_create_button() {

        BrowserUtilities.sleep(3);

        survey_musa.createBtn.click();
        BrowserUtilities.sleep(5);


        }



    @Then("User should see Survey {string} header")
    public void user_should_see_survey_header(String string) {

        String expectedTitle = "New - Odoo";
        String actualTitle = Driver.getDriver().getTitle();

        System.out.println(actualTitle);
        System.out.println(expectedTitle);

        assertEquals(expectedTitle,actualTitle);




    }


    @Given("Click {string} button")
    public void click_button(String string) {

        BrowserUtilities.sleep(3);

        survey_musa.saveBtn.click();


    }
    @Then("user can be able to see {string} is appeared.")
    public void user_can_be_able_to_see_is_appeared(String string) {


        assertTrue(survey_musa.fillTheBtn.isDisplayed());



    }

    @Given("user should be able to type {string} to page title")
    public void user_should_be_able_to_type_to_page_title(String string) {
        BrowserUtilities.sleep(3);

        survey_musa.surveyTitle.sendKeys("Project Owner");


    }

    @And("user should be able to click {string} button")
    public void user_should_be_able_to_click_button(String string) {


        BrowserUtilities.sleep(3);

        survey_musa.saveBtn.click();


    }

    @Then("{string} message appears under the survey fo")
    public void message_appears_under_the_survey_fo(String string) {

        assertTrue(survey_musa.surveyCreated.isDisplayed());

    }
    @When("User click Surveys module")
    public void user_click_surveys_module() {

        BrowserUtilities.sleep(3);

        survey_musa.surveysBtn.click();


    }
    @Then("User should see {string} is listed.")
    public void user_should_see_is_listed(String string) {

        assertTrue(survey_musa.projectOwner.isDisplayed());

    }




}