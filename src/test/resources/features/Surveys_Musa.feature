Feature: Surveys Functionality

	Background:For all scenario, user is on the upgenix home page.
		Given User is on the home page as a "posmanager"
		When User click Surveys button
		And User click Create button

	@BRT-398
	Scenario: Verify that User can reach New Survey Form by clicking Survey / Create
		Given User is on the home page as a "posmanager".
		When User click Surveys button
		And User click Create button
		Then User should see Survey "New" header

	@BRT-399
	Scenario: Verify that if Survey title field leaves blank an error message "The following fields are invalid:" is appeared.
		Given Click "Save" button
		Then user can be able to see "The following fields are invalid:" is appeared.

	@BRT-400
	Scenario: Verify that the "Survey created" message appears under the survey form sheet.
		Given user should be able to type "Project Owner" to page title
		And user should be able to click "Save" button
		Then "Survey created" message appears under the survey fo

	@BRT-401
	Scenario: Verify that the user should be able to see created survey is listed after clicking the Surveys modules
		When User click Surveys module
		Then User should see "Project Owner" is listed.

