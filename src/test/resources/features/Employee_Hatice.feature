@employee
Feature: Upgenix employee feature
  User Story:
  As a Posmanager, I should be able to create and edit a new employee from "Employees" module

  Background: For the scenarios in the feature file, user is expected to be on the home page
    Given Posmanager is on the Upgenix home page

  Scenario:  Verify that User can reach New Employee Form by clicking Employees --> Create
      When user clicks to the Employee button
      And  user clicks create button
      And user see the New Employee Form

  Scenario: 2. Verify that if Employee's Name field leaves blank, an error message "The following fields are invalid:" is appeared.
    When user clicks to the Employee button
    And  user clicks create button
    Then user clicks save button
    And user see this error message "The following fields are invalid: Name"

    Scenario: 3. Verify that the "Employee created" message appears under full profile.
      When user clicks to the Employee button
      And  user clicks create button
      And user get required information
      Then user clicks save button
      And user see the "Employee created" message appears under full profile.
@wip
      Scenario: 4. Verify that the user should be able to see created employee is listed after clicking the Employees module.
        When user clicks to the Employee button
        And  user clicks create button
        And user get required information
        Then user clicks save button
        And user clicks to the Employee button
        Then user should be able to see check employee is listed