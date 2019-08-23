$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/branch_creation.feature");
formatter.feature({
  "name": "branch creation",
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
  "name": "user clicks on branches button in admin home page",
  "keyword": "And "
});
formatter.match({
  "location": "BranchCreationSteps.user_clicks_on_branches_button_in_admin_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on new branch button in branch details page",
  "keyword": "And "
});
formatter.match({
  "location": "BranchCreationSteps.user_clicks_on_new_branch_button_in_branch_details_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "verfiy branch creation with multiple invalid branch names",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user enters invalid branch name user can see error message",
  "rows": [
    {
      "cells": [
        "branch@12"
      ]
    },
    {
      "cells": [
        "branch@13"
      ]
    },
    {
      "cells": [
        "branch@14"
      ]
    },
    {
      "cells": [
        "branch@15"
      ]
    },
    {
      "cells": [
        "branch@15"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "BranchCreationSteps.user_enters_invalid_branch_name_as_branchName_user_can_see_error_message(DataTable)"
});
formatter.result({
  "status": "passed"
});
});