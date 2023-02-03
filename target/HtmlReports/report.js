$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/login.feature");
formatter.feature({
  "name": "feature to test login functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "check login is successfull with valid credential",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinations.LoginSteps.user_is_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter user name and password",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinations.LoginSteps.user_enter_user_name_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinations.LoginSteps.click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is navigating to the home page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinations.LoginSteps.user_is_navigating_to_the_home_page()"
});
formatter.result({
  "status": "passed"
});
});