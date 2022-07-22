package com.upgenix.stepDefinitions;

import com.upgenix.pages.BasePage;
import com.upgenix.pages.CalendarPage_Nurefsan;
import com.upgenix.utilities.BrowserUtilities;
import com.upgenix.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CalendarStepDef_Nurefsan extends BasePage {

    CalendarPage_Nurefsan calendarPage = new CalendarPage_Nurefsan();

    @Given("user is on the Upgenix home page")
    public void user_is_on_the_upgenix_home_page() {
        BasePage.loginAsPosManager();
    }

    @When("posManager clicks to the {string} button")
    public void pos_manager_clicks_to_the_button(String calendarBtn) {
        Set<String> allWindowHandles = Driver.getDriver().getWindowHandles();

        for (String each : allWindowHandles) {

            Driver.getDriver().switchTo().window(each);
            calendarPage.calendarBtn.click();
        }

    }

    @Then("posManager first land on a weekly display")
    public void pos_manager_first_land_on_a_weekly_display() {
        assertTrue(calendarPage.firstWeeklyDisplay.getAttribute("innerHTML").contains("Week"));
    }

    @When("posManager can change display between Day-Week-Month")
    public void pos_manager_can_change_display_between_day_week_month() {

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
}

//    @Given("<{string}> is on the login page")
//    public void is_on_the_login_page(String user, DataTable dataTable) {
//
//        switch (dataTable.asMap().get(user)) {
//            case "salesmanager":
//                BasePage.loginAsSalesManager();
//                break;
//            case "posmanager":
//                BasePage.loginAsPosManager();
//                break;
//        }



