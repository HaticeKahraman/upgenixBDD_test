package com.upgenix.stepDefinitions;

import com.upgenix.pages.BasePage;
import com.upgenix.pages.CalendarPage_Sumeyra;
import com.upgenix.utilities.BrowserUtilities;
import com.upgenix.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CalendarStepDefinitions_Sumeyra extends BasePage {

    CalendarPage_Sumeyra calendarPageSumeyra=new CalendarPage_Sumeyra();

    @Given("user is on the Upgenix homepage")
    public void userIsOnTheUpgenixHomepage() {
        BasePage.loginAsPosManager();
    }

    //=================================================AC:1===========================================

    @When("posmanager clicks to the {string} button")
    public void posmanager_clicks_to_the_button(String Calendar) {
     calendarPageSumeyra.CalendarButton.click();

    }

    @Then("posmanager lands on a weekly display")
    public void posmanager_lands_on_a_weekly_display() {
        assertTrue(calendarPageSumeyra.WeeklyDisplay.getAttribute("innerHTML").contains("Week"));
   }




    //=============================================AC:2==================================================


    @And("posmanager click display between {string}")
    public void posmanagerClickDisplayBetween(String display) {
        if (display.equalsIgnoreCase("week")){
            calendarPageSumeyra.WeekButton.click();
            assertTrue(calendarPageSumeyra.weekVerify.isDisplayed());
            calendarPageSumeyra.DayButton.click();
            assertTrue(calendarPageSumeyra.dayVerify.isDisplayed());
            calendarPageSumeyra.MonthButton.click();
            assertTrue(calendarPageSumeyra.monthVerify.isDisplayed());
        }
        if (display.equalsIgnoreCase("day")){
            calendarPageSumeyra.DayButton.click();
            assertTrue(calendarPageSumeyra.dayVerify.isDisplayed());
            calendarPageSumeyra.MonthButton.click();
            assertTrue(calendarPageSumeyra.monthVerify.isDisplayed());
            calendarPageSumeyra.WeekButton.click();
            assertTrue(calendarPageSumeyra.weekVerify.isDisplayed());

        }
        if (display.equalsIgnoreCase("month")){
            calendarPageSumeyra.MonthButton.click();
            assertTrue(calendarPageSumeyra.monthVerify.isDisplayed());
            calendarPageSumeyra.WeekButton.click();
            assertTrue(calendarPageSumeyra.weekVerify.isDisplayed());
            calendarPageSumeyra.DayButton.click();
            assertTrue(calendarPageSumeyra.dayVerify.isDisplayed());

        }
    }

    //=======================================AC:3========================================================


    @And("user click to the {string} button")
    public void userClickToTheButton(String MonthButton) {
        calendarPageSumeyra.MonthButton.click();



    }

    @And("user click on time box {string}")
    public void userClickOnTimeBox(String day) {
       calendarPageSumeyra.dataDate.click();

    }


    @Then("user  see the created event on the calendar widget")
    public void userSeeTheCreatedEventOnTheCalendarWidget() {
        assertTrue(calendarPageSumeyra.VerifyEvent.isDisplayed());

    }

    @And("user see {string} input box.")
    public void userSeeInputBox(String summary) {
        String expectedName = "Summary:";
        String actualName = calendarPageSumeyra.summary.getText();
        assertEquals(expectedName, actualName);
        
    }

    @And("user write event into the input box")
    public void userWriteEventIntoTheInputBox() {
        calendarPageSumeyra.eventCreateInput.sendKeys("dance");
        calendarPageSumeyra.createButton.click();
    }
//==========================================AC:4===========================================================

    @And("user click existing event that created before")
    public void userClickExistingEventThatCreatedBefore() {
        calendarPageSumeyra.existEvent.click();
        calendarPageSumeyra.editButton.click();


    }


    @And("user edits {string} and {string}")
    public void userEditsAnd(String eventName, String date) {
        Actions actions = new Actions(Driver.getDriver());
        actions.click(calendarPageSumeyra.editEventName).sendKeys(Keys.DELETE).sendKeys(eventName).perform();
      //  calendarPageSumeyra.editEventName.clear();
       // calendarPageSumeyra.editEventName.sendKeys(eventName);
        actions.click(calendarPageSumeyra.editDate).sendKeys(Keys.DELETE).sendKeys(date).perform();
       // calendarPageSumeyra.editDate.clear();
       // calendarPageSumeyra.editDate.sendKeys(date);
        calendarPageSumeyra.saveButton.click();
        assertTrue(calendarPageSumeyra.VerifyEvent.isDisplayed());

    }
    //=========================================AC:4 Negative====================================================

    @And("user delete event name")
    public void userDeleteEventName() {
        calendarPageSumeyra.editEventName.clear();
    }

    @Then("user should  see the notice message as expected {string}")
    public void userShouldSeeTheNoticeMessageAsExpected(String expectedErrorMessage) {
        assertEquals(expectedErrorMessage, calendarPageSumeyra.errorMessage.getAttribute("outerText"));
        assertTrue(calendarPageSumeyra.errorMeetingSubject.isDisplayed());
        assertTrue(calendarPageSumeyra.errorRedBorder.isDisplayed());
    }

    @And("user click exist event that created before")
    public void userClickExistEventThatCreatedBefore() {
        calendarPageSumeyra.existEvent.click();
    }



    //===============================AC:4 Negative(DragDrop)====================================================

/*
    @When("user drag and drop the {string} event to {string}")
    public void userDragAndDropTheEventTo(String event, String date) {
        Actions actions = new Actions(Driver.getDriver());
        actions.dragAndDrop(calendarPageSumeyra.existEvent,calendarPageSumeyra.targetDragDrop).perform();
    }


    @Then("user should see the {string} event day has been successfully changed")
    public void userShouldSeeTheEventDayHasBeenSuccessfullyChanged(String dance) {
        assertTrue(calendarPageSumeyra.VerifyEvent.isDisplayed());
    }

 */
}
