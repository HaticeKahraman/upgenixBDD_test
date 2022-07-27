package com.upgenix.stepDefinitions;

import com.upgenix.pages.BasePage;
import com.upgenix.pages.EmployeePage_Hatice;
import com.upgenix.utilities.BrowserUtilities;
import com.upgenix.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import static org.junit.Assert.assertEquals;

public class EmployeeStepDef_Hatice {
    EmployeePage_Hatice employeePage_hatice=new EmployeePage_Hatice();
    @Given("Posmanager is on the Upgenix home page")
    public void posmanager_is_on_the_upgenix_home_page() {
        BasePage.loginAsPosManager();
    }
    @When("user clicks to the Employee button")
    public void user_clicks_to_the_employee_button() {
        employeePage_hatice.employeeButton.click();
        BrowserUtilities.sleep(3);

    }
    @When("user see the New Employee Form")
    public void user_see_the_new_employee_form() {
        String expectedUrl="https://qa.upgenix.net/web?#id=&view_type=form&model=hr.employee&menu_id=161&action=179";
        String actualURL=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualURL);

    }
    @Then("user see this error message {string}")
    public void user_see_this_error_message(String expectedErrorMessage) {

        Assert.assertTrue(employeePage_hatice.errorMessage.getAttribute("outerText").startsWith("The following fields are invalid"));

    }

    @When("user clicks create button")
    public void user_clicks_create_button() {
        employeePage_hatice.createButton.click();
     BrowserUtilities.sleep(3);
    }

    @Then("user clicks save button")
    public void user_clicks_save_button() {
        employeePage_hatice.saveButton.click();

    }

    @Then("user see the {string} message appears under full profile.")
    public void user_see_the_message_appears_under_full_profile(String expectedMessage) {
        assertEquals(expectedMessage, employeePage_hatice.createdMessage.getText());
    }


    @And("user get required information {string}")
    public void userGetRequiredInformation(String name) {
        employeePage_hatice.nameBox.click();
        BrowserUtilities.sleep(1);
        employeePage_hatice.nameBox.sendKeys(name);

    }

    @Then("user should be able to see check {string} employee is listed")
    public void userShouldBeAbleToSeeCheckEmployeeIsListed(String name) {
        employeePage_hatice.searchButton.click();
        BrowserUtilities.sleep(2);
        employeePage_hatice.searchButton.sendKeys(name+ Keys.ENTER);
        String value=employeePage_hatice.countValue.getText();
        System.out.println(value);

    }
}
