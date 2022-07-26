package com.upgenix.stepDefinitions;

import com.upgenix.pages.BasePage;
import com.upgenix.pages.EmployeePage_Hatice;
import com.upgenix.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;

public class EmployeeStepDef_Hatice {
    EmployeePage_Hatice employeePage_hatice=new EmployeePage_Hatice();
    @Given("Posmanager is on the Upgenix homepage")
    public void posmanagerIsOnTheUpgenixHomepage() {
        BasePage.loginAsPosManager();
    }
    @When("user clicks to the Employee button")
    public void user_clicks_to_the_employee_button() {
        employeePage_hatice.employeeButton.click();

    }
    @When("user see the New Employee Form")
    public void user_see_the_new_employee_form() {
        String expectedUrl="https://qa.upgenix.net/web#id=&view_type=form&model=hr.employee&menu_id=161&action=179";
        String actualURL=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualURL);

    }
    @Then("user see this error messsage {string}")
    public void user_see_this_error_messsage(String expectedErrorMessage) {
        assertEquals(expectedErrorMessage, employeePage_hatice.errorMessage.getAttribute("outerText"));

    }

    @When("user clicks create button")
    public void user_clicks_create_button() {
        employeePage_hatice.createButton.click();

    }
    @When("user get required information")
    public void user_get_required_information() {
        employeePage_hatice.nameBox.sendKeys("Ayse");

    }
    @Then("user clicks save button")
    public void user_clicks_save_button() {
        employeePage_hatice.saveButton.click();

    }
    @Then("user go back employees module")
    public void user_go_back_employees_module() {
        Driver.getDriver().navigate().back();

    }
    @Then("user see created employee is listed")
    public void user_see_created_employee_is_listed() {


    }
    @Then("user see the {string} message appears under full profile.")
    public void user_see_the_message_appears_under_full_profile(String expectedMessage) {
        assertEquals(expectedMessage, employeePage_hatice.createdMessage.getText());
    }
}
