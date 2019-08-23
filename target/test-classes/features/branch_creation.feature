Feature: branch creation

  Background: 
    Given user is in bank home page
    And user do login with valid credentials
    And user clicks on branches button in admin home page
    And user clicks on new branch button in branch details page

  #Scenario Outline: verify branch creation reset functionality with multiple sets of data
    #When user enters branch name as "<branchName>"
    #And user enters addressOne as "<address1>"
    #And user enters zipcode as "<zipcode>"
    #And user selects country as "<country>"
    #And user selects state as "<state>"
    #And user selects city as "<city>"
    #And user clicks on reset button in branch creation form
    #Then user can see an empty branch creation form
#
    #Examples: 
      #| branchName     | address1  | zipcode | country | state | city  |
      #| newBranchOne   | miyapur   |   50051 | INDIA   | Delhi | Delhi |
      #| newBranchTwo   | mirazapur |   50049 | INDIA   | Delhi | Delhi |
      #| newBranchThree | ameenpur  |   50052 | INDIA   | Delhi | Delhi |
      #| newBranchFour  | mgroad    |   50051 | INDIA   | Delhi | Delhi |
      #| newBranchFive  | miyapur   |   50051 | INDIA   | Delhi | Delhi |

  Scenario: verfiy branch creation with multiple invalid branch names
    When user enters invalid branch name user can see error message
      | branch@12  |
      | branch@13  |
      | branch@14  |
      | branch@15  |
      | branch@15  |
