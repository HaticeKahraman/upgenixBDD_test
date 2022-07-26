Feature: Upgenix calendar feature
  User Story:
  As a PosManager, I should be able to create and to see my meetings and events on my calendar from "Calendar" module.

  Background: For the scenarios in the feature file, user is expected to be on the home page
    Given user is on the Upgenix home page

  @BRT-367
  Scenario: Verify that user first lands on weekly display
    When user clicks to the "Calendar" button
    Then user first land on a weekly display

  @BRT-368
  Scenario: Verify that user can change display between Day-Week-Month
    When user clicks to the "Calendar" button
    And user can change display between Day-Week-Month

  @BRT-369
  Scenario: Verify that user can create event by clicking on time box
    When user clicks to the "Calendar" button
    And user clicks to the "Month" button
    And user clicks on time box
    And user writes the event as "meeting" to the summary input box.
    And user clicks to the "Create" button
    Then user can see the created event on the calendar widget

  @BRT-377
  Scenario Outline: Verify that user can not create event with an invalid dates range
  Negative edit a created event scenario
    When user clicks to the "Calendar" button
    And user clicks to the "Month" button
    And user clicks existing event that created before
    And user clicks to the "Edit" button
    And user choose "<invalid dates range>"
    Then user clicks to the "Save" button
    Then user can not edit event with an invalid dates range

    Examples:
      | invalid dates range |
      | 01/03/1905          |
      | 01/12/2221          |

  @BRT-370
  Scenario: Verify that user can not edit a created event if deletes the event name
  Negative edit a created event scenario

    When user clicks to the "Calendar" button
    And user clicks to the "Month" button
    And user clicks existing event that created before
    And user clicks to the "Edit" button
    And user deletes event name
    And user clicks to the "Save" button
    Then user should be able to see the notice message as expected "The following fields are invalid:"

  @BRT-378
  Scenario: Verify that user can edit a created event
    When user clicks to the "Calendar" button
    And user clicks to the "Month" button
    And user clicks existing event that created before
    And user clicks to the "Edit" button
    And user edits event name as "interview"
    #And user edits date as "01/01/2010"
    And user selects tag as interview from tags drop-down
    Then user clicks to the "Save" button

  @BRT-379
  Scenario: Verify that user can edit a created event by drag and drop
    When user clicks to the "Calendar" button
    And user clicks to the "Month" button
    When user can drag and drop the "meeting" event to "2022-07-01"
    Then user should be able to see the "meeting" event day has been successfully changed



