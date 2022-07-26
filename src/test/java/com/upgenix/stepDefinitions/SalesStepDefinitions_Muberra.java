package com.upgenix.stepDefinitions;

import com.upgenix.pages.BasePage;
import com.upgenix.pages.SalesPage_Muberra;
import com.upgenix.utilities.BrowserUtilities;
import com.upgenix.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.util.concurrent.TimeUnit;

public class SalesStepDefinitions_Muberra {

    SalesPage_Muberra salesPage = new SalesPage_Muberra();

    @Given("SalesManager is on the upgenix home page")
    public void sales_manager_is_on_the_upgenix_home_page() {
        BasePage.loginAsSalesManager();
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }


    @When("User click to Sales module")
    public void userClickToSalesModule() {
        salesPage.salesButton.click();
    }

    @And("User click Customers button")
    public void userClickCustomersButton() {
        salesPage.customerButton.click();
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Then("User click Create button on the top of page")
    public void userClickCreateButtonOnTheTopOfPage() {
        salesPage.createButton.click();
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    @When("User fill out the names field by {string}")
    public void userFillOutTheNamesFieldBy(String name) {

        salesPage.nameInputBox.click();
        salesPage.nameInputBox.sendKeys(name);
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    @Then("User click save button on the top of the page")
    public void userClickSaveButtonOnTheTopOfThePage() {

        salesPage.saveButtonCustomer.click();
    }

    @When("User leave blank names field")
    public void userLeaveBlankNamesField() {

        salesPage.nameInputBox.click();

    }

    @Then("User should see an error message displayed")
    public void userShouldSeeAnErrorMessageDisplayed() {

       Assert.assertTrue(salesPage.errorMessage.getAttribute("outerText").startsWith("The following fields are invalid"));

    }

    @Then("User see page title contains customer {string} successfully.")
    public void user_see_page_title_contains_customer_successfully(String pageTitle){
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertTrue(Driver.getDriver().getTitle().contains(pageTitle));

    }

    @Then("User should be able to see customer created on the Customers module successfully.")
    public void userShouldBeAbleToSeeCustomerCreatedOnTheCustomersModuleSuccessfully() {
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        salesPage.customerButton.click();
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        salesPage.searchBox.sendKeys("Ayse123"+ Keys.ENTER);
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertTrue(salesPage.visibleCustomerNameOnCustomerPage.isDisplayed());


    }



}
