package com.upgenix.stepDefinitions;

import com.upgenix.pages.BasePage;
import com.upgenix.pages.CalendarPage_Nurefsan;
import com.upgenix.utilities.BrowserUtilities;
import com.upgenix.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
            BrowserUtilities.sleep(5);
        } else if (Btn.equals("Month")) {
            BrowserUtilities.sleep(5);
            calendarPage.monthBtn.click();
            BrowserUtilities.sleep(5);
        } else if (Btn.equals("Create")) {
            calendarPage.createBtn.click();
            BrowserUtilities.sleep(5);
        } else if (Btn.equals("Edit")) {
            calendarPage.editBtn.click();
            BrowserUtilities.sleep(5);
        } else if (Btn.equals("Save")) {
            calendarPage.saveBtn.click();
        } else {
            System.out.println("Button is not expected!");
        }
    }

    @Then("user first land on a weekly display")
    public void user_first_land_on_a_weekly_display() {
        assertEquals(true, calendarPage.firstWeeklyDisplay.getAttribute("innerHTML").contains("Week"));
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

    @When("user clicks on time box")
    public void user_clicks_on_time_box() {
        calendarPage.calendarDays.get(1).click();
        BrowserUtilities.sleep(3);
    }

    @And("user writes the event as {string} to the summary input box")
    public void userWritesTheEventAsToTheSummaryInputBox(String eventName) {
        calendarPage.eventCreateInput.sendKeys(eventName);
        BrowserUtilities.sleep(3);
    }

    @Then("user can see the created event on the calendar widget")
    public void user_can_see_the_created_event_on_the_calendar_widget() {
        String expectedEventName = "meeting";
        String actualEventName = calendarPage.verifyEvent.getText();
        assertEquals(expectedEventName, actualEventName);
    }

    //////////////////////////////////edit event (negative/bug)///////////////////////////

    @And("user choose {string}")
    public void userChoose(String invalidDatesRange) {
        if (invalidDatesRange.equals("01/03/1905")) {
            String del = Keys.chord(Keys.CONTROL, "a") + Keys.DELETE;
            calendarPage.startDateBtn.sendKeys(del + invalidDatesRange);
            calendarPage.saveBtn.click();
        }else{
            String del = Keys.chord(Keys.CONTROL, "a") + Keys.DELETE;
            calendarPage.endDateBtn.sendKeys(del + invalidDatesRange);
            calendarPage.saveBtn.click();
        }

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

    @When("user edits event name as {string}")
    public void user_edits_event_name_as(String editEventName) {
        calendarPage.editEventName.clear();
        calendarPage.editEventName.click();
        calendarPage.editEventName.sendKeys(editEventName);
    }

    @When("user edits date as {string}")
    public void user_edits_date_as(String editDate) {
        String del = Keys.chord(Keys.CONTROL, "a") + Keys.DELETE;
        calendarPage.startDateBtn.sendKeys(del + editDate);
    }

    @When("user selects tag as interview from tags drop-down")
    public void user_selects_tag_as_interview_from_tags_drop_down() {
        calendarPage.tagsDropDown.click();
        calendarPage.tagsDropDownSelectInterview.click();
        BrowserUtilities.sleep(3);
    }

    ////////////////////////////////////////edit event(dragAndDrop)///////////////////////////////////////////////////

    @When("user can drag and drop the {string} event to {string}")
    public void user_can_drag_and_drop_the_event_to(String string, String string2) {

        Actions actions = new Actions(Driver.getDriver());
        actions.dragAndDrop(calendarPage.meetingEvent, calendarPage.calendarDays.get(6)).perform();
        BrowserUtilities.sleep(3);
    }
    @Then("user should be able to see the {string} event day has been successfully changed")
    public void user_should_be_able_to_see_the_event_day_has_been_successfully_changed(String expectedEventName) {
        String actualEventName = calendarPage.verifyEvent.getText();
        assertEquals(expectedEventName, actualEventName);
    }

}




