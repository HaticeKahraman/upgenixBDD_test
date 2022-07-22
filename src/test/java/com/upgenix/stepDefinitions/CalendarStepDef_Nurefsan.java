package com.upgenix.stepDefinitions;

import com.upgenix.pages.BasePage;
import com.upgenix.pages.CalendarPage_Nurefsan;
import com.upgenix.utilities.BrowserUtilities;
import com.upgenix.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CalendarStepDef_Nurefsan extends BasePage {

    CalendarPage_Nurefsan calendarPage = new CalendarPage_Nurefsan();

    @Given("user is on the Upgenix home page")
    public void user_is_on_the_upgenix_home_page() {
        BasePage.loginAsPosManager();
    }

    @When("user clicks to the {string} button")
    public void user_clicks_to_the_button(String Btn) {
        if (Btn.equals("Calendar")) {
            BrowserUtilities.sleep(5);
            calendarPage.calendarBtn.click();
        } else if (Btn.equals("Month")) {
            calendarPage.monthBtn.click();
        } else if (Btn.equals("Create")) {
            calendarPage.createBtn.click();
            BrowserUtilities.sleep(5);
        } else if (Btn.equals("Edit")) {
            calendarPage.editBtn.click();
        } else if (Btn.equals("Save")) {
            calendarPage.saveBtn.click();
        } else {
            System.out.println("Button is not expected!");
        }

    }

    @Then("user first land on a weekly display")
    public void user_first_land_on_a_weekly_display() {
        assertTrue(calendarPage.firstWeeklyDisplay.getAttribute("innerHTML").contains("Week"));
    }

    ////////////////////////////////////change display feature//////////////////////////////////////////////////

    @When("user can change display between Day-Week-Month")
    public void user_can_change_display_between_day_week_month() {

        for (int i = 0; i < calendarPage.btnGroup.size(); i++) {
            calendarPage.btnGroup.get(i).click();
            BrowserUtilities.sleep(2);
            if (i == 0) {
                assertEquals("Day", calendarPage.btnGroup.get(0).getAttribute("innerHTML"));
            } else if (i == 1) {
                assertEquals("Week", calendarPage.btnGroup.get(1).getAttribute("innerHTML"));
            } else {
                assertEquals("Month", calendarPage.btnGroup.get(2).getAttribute("innerHTML"));
            }
        }
    }

    /////////////////////////////////////create event feature////////////////////////////////////////////

    @When("user clicks on time box {string}")
    public void user_clicks_on_time_box(String string) {
        calendarPage.dataDate.click();

    }

    @And("user writes the event as {string} to the summary input box.")
    public void userWritesTheEventAsToTheSummaryInputBox(String eventName) {
        calendarPage.eventCreateInput.sendKeys(eventName);
        calendarPage.createBtn.click();
    }

    @Then("user can see the created event on the calendar widget")
    public void user_can_see_the_created_event_on_the_calendar_widget() {
        String expectedEventName = "Summary";
        String actualEventName = calendarPage.verifyEvent.getText();
        assertEquals(expectedEventName, actualEventName);
    }

    //////////////////////////////////edit event (negative/bug)///////////////////////////

    @And("user choose {string}")
    public void userChoose(String invalidDatesRange) {
        Actions actions = new Actions(Driver.getDriver());
        actions.click(calendarPage.startDateBtn);
    }

    @Then("user can not edit event with an invalid dates range")
    public void user_can_not_edit_event_with_an_invalid_dates_range() {
        calendarPage.saveBtn.click();
        //assert???
    }

//////////////////////////////////edit event (negative)///////////////////////////


    @When("user clicks existing event that created before")
    public void user_clicks_existing_event_that_created_before() {
        calendarPage.meetingEvent.click();
    }

    @When("user deletes event name")
    public void user_deletes_event_name() {
        calendarPage.editEventName.clear();
        BrowserUtilities.sleep(3);

    }

    @Then("user should be able to see the notice message as expected {string}")
    public void user_should_see_the_notice_message_as_expected(String expectedErrorMessage) {
        assertEquals(expectedErrorMessage, calendarPage.errorMessage.getAttribute("outerText"));

    }


    ////////////////////////////////////////edit event (positive)///////////////////////////////////////////////////

}




