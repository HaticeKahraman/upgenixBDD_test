Feature: Upgenix calendar feature
	User Story:
	As a PosManager, I should be able to create and to see my meetings and events on my calendar from "Calendar" module.

	Background: For the scenarios in the feature file, user is expected to be on the home page
		Given user is on the Upgenix homepage


	@BRT-376
	Scenario:  Verify that user first lands on weekly display [AutomationS4-Sumeyra]
		When posmanager clicks to the "calendar" button
		Then posmanager lands on a weekly display