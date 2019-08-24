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
formatter.before({
  "status": "passed"
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
  "name": "verify branch creation cancel with multiple data",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user clicks on cancel button after filling form with valid data user can see branch details page",
  "rows": [
    {
      "cells": [
        "branchName",
        "address1",
        "zipcode",
        "country",
        "state",
        "city"
      ]
    },
    {
      "cells": [
        "branchOne",
        "miyapur",
        "50051",
        "INDIA",
        "Delhi",
        "Delhi"
      ]
    },
    {
      "cells": [
        "branchTwo",
        "mirazapur",
        "50049",
        "INDIA",
        "Delhi",
        "Delhi"
      ]
    },
    {
      "cells": [
        "branchThree",
        "ameenpur",
        "50052",
        "INDIA",
        "Delhi",
        "Delhi"
      ]
    },
    {
      "cells": [
        "branchFour",
        "mgroad",
        "50051",
        "INDIA",
        "Delhi",
        "Delhi"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "BranchCreationSteps.user_clicks_on_cancel_button_after_filling_form_with_valid_data_user_can_see_branch_details_page(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});