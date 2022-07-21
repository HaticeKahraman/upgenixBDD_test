Feature:Sales feature

  User Story :
  As a Sales Manager, I should be able to create and edit a new customer from "Sales" module

  User: SalesManager

  Background:
    Given SalesManager is on the upgenix home page
    When User click to Sales module
    And User click Customers button
    Then User click Create button on the top of page

  Scenario: Verify that User can reach New Customer Form by clicking Sales --> Customers --> Create
    When User fill out the names field by "@Ayse123"
    Then User click save button on the top of the page


  Scenario:Verify that if customer name field leaves blank, an error message "The following fields are invalid:" is appeared.
    When User leave blank names field
    And User click save button on the top of the page
    Then User should see an error message displayed


  Scenario:Verify that after creating a new customer, the page title includes the customer name.
    When User fill out the names field by "Ayse123"
    And User click save button on the top of the page
    Then User see page title contains customer "Ayse123" successfully.

  @wip
  Scenario: Verify that the user should be able to see created customer is listed after clicking the Customers module.
    When User fill out the names field by "Ayse123"
    And User click save button on the top of the page
    Then User should be able to see customer created on the Customers module successfully.




