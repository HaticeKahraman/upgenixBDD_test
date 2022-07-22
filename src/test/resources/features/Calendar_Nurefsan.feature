Feature: Upgenix calendar feature
  User Story:
  As a PosManager, I should be able to create and to see my meetings and events on my calendar from "Calendar" module.

  Background: For the scenarios in the feature file, user is expected to be on the home page
    Given user is on the Upgenix home page

  @BRT-367
  Scenario: Verify that user first lands on weekly display
    When posManager clicks to the "Calendar" button
    Then posManager first land on a weekly display

  @BRT-368
  Scenario: Verify that user can change display between Day-Week-Month
    When posManager clicks to the "Calendar" button
    And posManager can change display between Day-Week-Month



