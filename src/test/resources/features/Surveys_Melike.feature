@BRT-363
Feature: Surveys Functionality
  User Story:As a Posmanager, I should be able to create and design a new survey from "Surveys" module

  Background:For all scenarios, user is on the upgenix home page.
    Given User is on the home page as a posmanager


  Scenario: Verify that User can reach New Survey Form by clicking Surveys --> Create
    When User clicks Surveys from the horizontal menu
    And User clicks Create button
    Then User should see Surveys "New" header

  Scenario:Verify that if Survey Title field leaves blank,an error message
  "The following fields are invalid:" is appeared.
    When User clicks Surveys from the horizontal menu
    And User clicks Create button
    And User clicks Save button
    Then User should see "The following fields are invalid:" error message
  @wip
  Scenario: Verify that the "Survey created" message appears under the survey form sheet
    When User clicks Surveys from the horizontal menu
    And User clicks Create button
    And User writes "Melnac" in the title input box
    And User clicks Save button
    Then User should see "Survey created" message
