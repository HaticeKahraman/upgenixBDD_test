package com.upgenix.stepDefinitions;

import com.upgenix.pages.BasePage;
import com.upgenix.pages.CalendarPage_Sumeyra;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import static org.junit.Assert.assertTrue;

public class CalendarStepDefinitions_Sumeyra extends BasePage {

    CalendarPage_Sumeyra calendarPageSumeyra=new CalendarPage_Sumeyra();

    @Given("user is on the Upgenix homepage")
    public void userIsOnTheUpgenixHomepage() {
        BasePage.loginAsPosManager();
    }

    @When("posmanager clicks to the {string} button")
    public void posmanager_clicks_to_the_button(String Calendar) {
     calendarPageSumeyra.CalendarButton.click();

    }

    @Then("posmanager lands on a weekly display")
    public void posmanager_lands_on_a_weekly_display() {
        assertTrue(calendarPageSumeyra.WeeklyDisplay.getAttribute("innerHTML").contains("Week"));
   }








}
