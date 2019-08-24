Feature: employee creation using json data

Scenario: employee creation with valid data from json file
	  Given user is in bank home page
    And user do login with valid credentials
    And user clicks on employee button in admin home page
    And user clicks on new employee button in branch details page
    When user clicks on submit button by filling the employee creation form by taking data from json file