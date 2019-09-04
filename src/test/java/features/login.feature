@login
Feature: login functionality
  Description: verify admin login functionality

  @login_valid
  Scenario: Login with valid credentials
    Given user is in bank home page
    When user enters valid username
    And user enters valid password
    And user clicks on login button
    Then user can see admin home page with logout link

  @login_invlaid
  Scenario: Login with invlaid password
    Given user is in bank home page
    When user enters valid username
    But user enters invalid password
    And user clicks on login button
    Then user can see an error message saying incorrect username or password

  @login_invalid
  Scenario: Login with invalid username
    Given user is in bank home page
    When user enters invalid username
    And user enters valid password
    And user clicks on login button
    Then user can see an error message saying incorrect username or password
