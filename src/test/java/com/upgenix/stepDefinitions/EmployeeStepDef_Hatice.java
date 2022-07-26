package com.upgenix.stepDefinitions;

import com.upgenix.pages.BasePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EmployeeStepDef_Hatice {
    EmployeeStepDef_Hatice employeeStepDef_hatice;
    @Given("user is on the Upgenix homepage")
    public void userIsOnTheUpgenixHomepage() {
        BasePage.loginAsPosManager();
    }
    @When("user clicks to the Employee button")
    public void user_clicks_to_the_employee_button() {

    }
    @When("user see the New Employee Form")
    public void user_see_the_new_employee_form() {

    }
    @Then("user see this error messsage {string}")
    public void user_see_this_error_messsage(String string) {

    }

    @When("user clicks create button")
    public void user_clicks_create_button() {

    }
    @When("user get required information")
    public void user_get_required_information() {

    }
    @Then("user clicks save button")
    public void user_clicks_save_button() {

    }
    @Then("user go back employees module")
    public void user_go_back_employees_module() {

    }
    @Then("user see created employee is listed")
    public void user_see_created_employee_is_listed() {

    }
    @Then("user see the {string} message appears under full profile.")
    public void user_see_the_message_appears_under_full_profile(String string) {

    }
}
