@BRT-363
Feature: Surveys Functionality
  User Story:As a Posmanager, I should be able to create and design a new survey from "Surveys" module

  Background:For all scenarios, user is on the upgenix home page.
    Given User is on the home page as a posmanager
@wip
  Scenario: Verify that User can reach New Survey Form by clicking Surveys --> Create
    When User clicks Surveys from the horizontal menu
    And User clicks Create button
    Then User should see Surveys "New" header
