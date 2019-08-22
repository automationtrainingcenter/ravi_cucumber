$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/role_creation.feature");
formatter.feature({
  "name": "As a admin I want to create Role so that I can add employees under the roles",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user is in bank home page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.user_is_in_bank_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user do login with valid credentials",
  "keyword": "And "
});
formatter.match({
  "location": "RoleCreationSteps.user_do_login_with_valid_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on role button in Admin home page",
  "keyword": "And "
});
formatter.match({
  "location": "RoleCreationSteps.user_click_on_role_button_in_Admin_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on new role button in role details page",
  "keyword": "And "
});
formatter.match({
  "location": "RoleCreationSteps.user_click_on_new_role_button_in_role_details_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Role creation with valid data",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user enters role name as \"AdminstratorONE\"",
  "keyword": "When "
});
formatter.match({
  "location": "RoleCreationSteps.user_enters_role_name_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects role type as \"E\"",
  "keyword": "And "
});
formatter.match({
  "location": "RoleCreationSteps.user_selects_role_type_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on submit button",
  "keyword": "And "
});
formatter.match({
  "location": "RoleCreationSteps.user_clicks_on_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user can see a message role created successully",
  "keyword": "Then "
});
formatter.match({
  "location": "RoleCreationSteps.user_can_see_a_message_role_created_successully()"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat stepdefinitions.RoleCreationSteps.user_can_see_a_message_role_created_successully(RoleCreationSteps.java:62)\r\n\tat ✽.user can see a message role created successully(file:src/test/java/features/role_creation.feature:13)\r\n",
  "status": "failed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user is in bank home page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.user_is_in_bank_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user do login with valid credentials",
  "keyword": "And "
});
formatter.match({
  "location": "RoleCreationSteps.user_do_login_with_valid_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on role button in Admin home page",
  "keyword": "And "
});
formatter.match({
  "location": "RoleCreationSteps.user_click_on_role_button_in_Admin_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on new role button in role details page",
  "keyword": "And "
});
formatter.match({
  "location": "RoleCreationSteps.user_click_on_new_role_button_in_role_details_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Role creation reset with valid data",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user enters role name as \"AdminOne\"",
  "keyword": "When "
});
formatter.match({
  "location": "RoleCreationSteps.user_enters_role_name_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects role type as \"E\"",
  "keyword": "And "
});
formatter.match({
  "location": "RoleCreationSteps.user_selects_role_type_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on reset button",
  "keyword": "And "
});
formatter.match({
  "location": "RoleCreationSteps.user_clicks_on_reset_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user can see empty role creation form",
  "keyword": "Then "
});
formatter.match({
  "location": "RoleCreationSteps.user_can_see_empty_role_creation_form()"
});
formatter.result({
  "status": "passed"
});
});