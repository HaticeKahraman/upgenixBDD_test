package com.upgenix.stepDefinitions;

import com.upgenix.pages.BasePage;
import com.upgenix.utilities.BrowserUtilities;
import com.upgenix.pages.SalesPage_Sule;
import com.upgenix.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.util.concurrent.TimeUnit;

public class SalesStepDef_Sule {

SalesPage_Sule salesPage_sule = new SalesPage_Sule();


    @Given("SalesManager on the upgenix home page")
    public void sales_manager_on_the_upgenix_home_page() {
        BasePage.loginAsSalesManager();
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @When("User clicks to Sales module")
    public void userClicksToSalesModule() {
        salesPage_sule.salesButton.click();
    }

    @And("User clicks Customers button")
    public void userClicksCustomersButton() {
        salesPage_sule.customerButton.click();
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Then("User clicks Create button on the top of page")
    public void userClicksCreateButtonOnTheTopOfPage() {
        salesPage_sule.createButton.click();
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    @When("User fill out the names field with {string}")
    public void user_fill_out_the_names_field_with(String name) {
        salesPage_sule.nameInputBox.click();
        salesPage_sule.nameInputBox.sendKeys(name);
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


    }

    @Then("User click save button at the top of the page")
    public void user_click_save_button_at_the_top_of_the_page() {
        salesPage_sule.saveButtonCustomer.click();
    }

    @When("User leave the names field blank")
    public void userLeaveBlankNamesField() {

        salesPage_sule.nameInputBox.click();
    }

    @Then("User should see the error message displayed")
    public void userShouldSeeAnErrorMessageDisplayed() {

        Assert.assertTrue(salesPage_sule.errorMessage.getAttribute("outerText").startsWith("The following fields are invalid"));

    }

    @Then("User see page title contains customer {string} as expected.")
    public void user_see_page_title_contains_customer_successfully(String pageTitle){
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertTrue(Driver.getDriver().getTitle().contains(pageTitle));

    }

    @Then("User should be able to see that the customer is created at the Customers module successfully.")
    public void userShouldBeAbleToSeeCustomerCreatedOnTheCustomersModuleSuccessfully() {
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        salesPage_sule.customerButton.click();
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        salesPage_sule.searchBox.sendKeys("Alexandra123"+ Keys.ENTER);
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertTrue(salesPage_sule.CustomerNameVisibleOnCustomerPage.isDisplayed());


    }

}
