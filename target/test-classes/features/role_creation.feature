Feature: As a admin I want to create Role so that I can add employees under the roles

  Background: 
    Given user is in bank home page
    And user do login with valid credentials
    And user click on role button in Admin home page
    And user click on new role button in role details page

  Scenario: Role creation with valid data
    When user enters role name as "AdminstratorONE"
    And user selects role type as "E"
    And user clicks on submit button
    Then user can see a message role created successully

  Scenario: Role creation reset with valid data
   	When user enters role name as "AdminOne"
   	And user selects role type as "E"
   	And user clicks on reset button
   	Then user can see empty role creation form
