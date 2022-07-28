package com.upgenix.stepDefinitions;

import com.upgenix.pages.BasePage;
import com.upgenix.pages.CalendarPage_Sumeyra;
import com.upgenix.utilities.BrowserUtilities;
import com.upgenix.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CalendarStepDefinitions_Sumeyra extends BasePage {

    CalendarPage_Sumeyra calendarPageSumeyra=new CalendarPage_Sumeyra();

    @Given("posmanager is on the Upgenix homepage")
    public void posmanagerIsOnTheUpgenixHomepage() {
        BasePage.loginAsPosManager();
    }

    //=================================================AC:1===========================================

    @When("posmanager clicks to the {string} button")
    public void posmanager_clicks_to_the_button(String Calendar) {
     calendarPageSumeyra.CalendarButton.click();
        BrowserUtilities.sleep(5);



    }

    @Then("posmanager lands on a weekly display")
    public void posmanager_lands_on_a_weekly_display() {
        assertTrue(calendarPageSumeyra.WeeklyDisplay.getAttribute("innerHTML").contains("Week"));
   }




    //=============================================AC:2==================================================


    @And("posmanager click display between {string}")
    public void posmanagerClickDisplayBetween(String dayWeekMonth) {

            calendarPageSumeyra.DayButton.click();
            BrowserUtilities.sleep(5);
            assertEquals(calendarPageSumeyra.dayVerify.getText(),"Meetings (July 27, 2022)");
            calendarPageSumeyra.MonthButton.click();
            BrowserUtilities.sleep(5);
            assertEquals(calendarPageSumeyra.monthVerify.getText(),"Meetings (July 2022)");
            calendarPageSumeyra.WeekButton.click();
            BrowserUtilities.sleep(5);
            assertEquals(calendarPageSumeyra.weekVerify.getText(),"Meetings (Week 31)");
            calendarPageSumeyra.MonthButton.click();
            BrowserUtilities.sleep(5);
            assertEquals(calendarPageSumeyra.monthVerify.getText(),"Meetings (July 2022)");
            calendarPageSumeyra.WeekButton.click();
            BrowserUtilities.sleep(5);
            assertEquals(calendarPageSumeyra.weekVerify.getText(),"Meetings (Week 31)");
            calendarPageSumeyra.DayButton.click();
            BrowserUtilities.sleep(5);
            assertEquals(calendarPageSumeyra.dayVerify.getText(),"Meetings (July 27, 2022)");


    }

    //=======================================AC:3========================================================


    @And("user click to the {string} button")
    public void userClickToTheButton(String MonthButton) {
        calendarPageSumeyra.MonthButton.click();
        BrowserUtilities.sleep(5);


    }

    @And("user click on time box {string}")
    public void userClickOnTimeBox(String day) {
       calendarPageSumeyra.dataDate.click();
        BrowserUtilities.sleep(5);

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
        BrowserUtilities.sleep(5);
    }
//==========================================AC:4===========================================================

    @And("user click existing event that created before")
    public void userClickExistingEventThatCreatedBefore() {
        calendarPageSumeyra.danceEvent.click();
        BrowserUtilities.sleep(5);
        calendarPageSumeyra.editButton.click();
    }

    @And("user edits {string} and {string}")
    public void userEditsAnd(String eventName, String date) {
       calendarPageSumeyra.editEventName.clear();
        BrowserUtilities.sleep(5);
        calendarPageSumeyra.editEventName.sendKeys(eventName);
        BrowserUtilities.sleep(5);
        //actions.click(calendarPageSumeyra.editDate).sendKeys(Keys.DELETE).sendKeys(date).perform();

     //   calendarPageSumeyra.editDate.click();
      //  BrowserUtilities.sleep(5);
      //  calendarPageSumeyra.editDate.clear();
       // BrowserUtilities.sleep(5);
      //// String delete=Keys.chord(Keys.CONTROL,"a")+Keys.DELETE;
      ////  calendarPageSumeyra.editDate.sendKeys(delete);
      //// calendarPageSumeyra.editDate.sendKeys(date);
      // BrowserUtilities.sleep(5);
       // calendarPageSumeyra.checkbox.click();
       // calendarPageSumeyra.checkbox.isSelected();
       JavascriptExecutor js=(JavascriptExecutor) Driver.getDriver();
       js.executeScript("arguments[0].value='"+date+"'",calendarPageSumeyra.editDate);

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
        //assertTrue(calendarPageSumeyra.errorRedBorder.isDisplayed());
    }

    @And("user click exist event that created before")
    public void userClickExistEventThatCreatedBefore() {
        calendarPageSumeyra.danceEvent.click();
    }



    //===============================AC:4 (DragDrop)====================================================


    @When("user drag and drop the {string} event to {string}")
    public void userDragAndDropTheEventTo(String event, String target) {
        Actions actions = new Actions(Driver.getDriver());
        actions.dragAndDrop(calendarPageSumeyra.danceEvent,calendarPageSumeyra.weeklyDays.get(1)).perform();
        BrowserUtilities.sleep(3);
    }


    @Then("user should see the {string} event day has been successfully changed")
    public void userShouldSeeTheEventDayHasBeenSuccessfullyChanged(String dance) {
        //assertTrue(calendarPageSumeyra.VerifyEvent.isDisplayed());
        String expectedEventName = "dance";
       String actualEventName = calendarPageSumeyra.VerifyEvent.getText();
        assertEquals(actualEventName,expectedEventName);
    }

    //===============================AC:4 (Negative)====================================================
    @And("user edits {string}")
    public void userEdits(String arg0) {
        String update="09/29/2022";
        JavascriptExecutor js=(JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].value='"+update+"'",calendarPageSumeyra.editDate);
        calendarPageSumeyra.saveButton.click();
        //assertTrue(calendarPageSumeyra.OdooErrorMessage.isDisplayed());

    }

    @Then("user should be able to  see the notice message as expected {string}")
    public void userShouldBeAbleToSeeTheNoticeMessageAsExpected(String expectedError) {

        assertEquals(expectedError, calendarPageSumeyra.OdooErrorMessage.getAttribute("outerText"));
    }
}
