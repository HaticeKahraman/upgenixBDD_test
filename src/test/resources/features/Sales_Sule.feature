@wip
@BRT-361
Feature: Sales Feature

  User Story :
  As a Sales Manager, I should be able to create and edit a new customer from "Sales" module

  User: SalesManager


  Background:
    Given SalesManager on the upgenix home page
    When User clicks to Sales module
    And User clicks Customers button
    Then User clicks Create button on the top of page


  @BRT-390
  Scenario: Verify that User can reach New Customer Form by clicking Sales ==> Customers ==> Create
  Verify that User can reach New Customer Form by clicking Sales --> Customers --> Create
    When User fill out the names field with "@Alexandra123"
    Then User click save button at the top of the page

  @BRT-391
  Scenario: Verify that if customer name field leaves blank, an error message "The following fields are invalid:" is appeared.
  Verify that if customer name field leaves blank, an error message "The following fields are invalid:" is appeared.
    When User leave the names field blank
    And User click save button at the top of the page
    Then User should see the error message displayed




  @BRT-392
  Scenario: Verify that after creating a new customer, the page title includes the customer name.
  Verify that after creating a new customer, the page title includes the customer name.
    When User fill out the names field with "Alexandra123"
    And User click save button at the top of the page
    Then User see page title contains customer "Alexandra123" as expected.



  @BRT-393
  Scenario: Verify that the user should be able to see created customer is listed after clicking the Customers module.
  Verify that the user should be able to see created customer is listed after clicking the Customers module.
    When User fill out the names field with "Alexandra123"
    And User click save button at the top of the page
    Then User should be able to see that the customer is created at the Customers module successfully.


