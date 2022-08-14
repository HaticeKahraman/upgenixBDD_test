@Regression
Feature: Surveys Functionality

	Background:For all scenario, user is on the upgenix home page.
		Given User is on the home page as a "posmanager"
		Then User click Surveys module


	@BRT-398
	Scenario: Verify that User can reach New Survey Form by clicking Survey / Create
		Given User is on the home page as a "posmanager".
		When User should be able to click Surveys button
		And User should be able to  click Create button
		And User should see Survey "New" header
		And Click "Save" button
		And user can be able to see "The following fields are invalid:" is appeared.
		And user should be able to type "Project Owner" to page title
		And user should be able to click "Save" button
		Then "Survey created" message appears under the survey form


	@BRT-399
	Scenario: Verify that the user should be able to see created survey is listed after clicking the Surveys modules
		When User click Surveys module
		Then User should see "Project Owner" is listed.