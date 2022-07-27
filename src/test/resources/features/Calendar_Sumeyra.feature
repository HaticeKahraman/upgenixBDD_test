Feature: Upgenix calendar feature
	User Story:
	As a PosManager, I should be able to create and to see my meetings and events on my calendar from "Calendar" module.

	Background: For the scenarios in the feature file, user is expected to be on the home page
		Given posmanager is on the Upgenix homepage


	@BRT-376
	Scenario:  Verify that user first lands on weekly display [AutomationS4-Sumeyra]
		When posmanager clicks to the "calendar" button
		Then posmanager lands on a weekly display

	@BRT-380
	Scenario: Verify that user can change display between Day-Week-Month [AutomationS4-Sumeyra]
	User can change display

		When posmanager clicks to the "calendar" button
		And posmanager click display between "day-week-month"



	@BRT-381
	Scenario: Verify that user can create event by clicking on daily time box [AutomationS4-Sumeyra]
		When posmanager clicks to the "Calendar" button
		And user click to the "Month" button
		And user click on time box "07/28/2022"
		And user see "Summary" input box.
		And user write event into the input box
		And user click to the "Create" button
		Then user  see the created event on the calendar widget

	@BRT-382
	Scenario Outline: Verify that user can edit a created event [AutomationS4-Sumeyra]
		When posmanager clicks to the "Calendar" button
		And user click to the "Month" button
		And user click existing event that created before
		And user click to the "Edit" button
		And user edits "<eventName>" and "<date>"
		And user click to the "Save" button
		Then user  see the created event on the calendar widget

		Examples:

			|eventName  |date 					 |
			|softplay   |07/21/2022 11:00:00     |
			|celebrate  |07/22/2022 10:00:00     |


	@BRT-383
	Scenario: Verify that user can not edit a created event if deletes the event name [AutomationS4-Sumeyra]
	Negative edit a created event scenario

		When user clicks to the "Calendar" button
		And user clicks to the "Month" button
		And user click exist event that created before
		And user clicks to the "Edit" button
		And user delete event name
		And user clicks to the "Save" button
		Then user should  see the notice message as expected "The following fields are invalid:"


	@BRT-384
	Scenario: Verify that user can edit a created event by drag and drop [AutomationS4-Nurefsan]
		When user clicks to the "Calendar" button
		And user clicks to the "Month" button
		When user drag and drop the "dance" event to "2022-07-21"
		Then user should see the "dance" event day has been successfully changed