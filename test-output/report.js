$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/java/features/new_account.feature");
formatter.feature({
  "line": 1,
  "name": "New Account Page",
  "description": "As a user I want a new account page so that accounts can be created.",
  "id": "new-account-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7532739099,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 3,
      "value": "#"
    },
    {
      "line": 4,
      "value": "#Scenario: C234 - New account page should display with error"
    },
    {
      "line": 5,
      "value": "#\tGiven a user with username \"demo@techfios.com\" and password \"abc123\""
    },
    {
      "line": 6,
      "value": "#\tWhen user navigates to New Account Page"
    },
    {
      "line": 7,
      "value": "#\tThen new account page should display"
    },
    {
      "line": 9,
      "value": "#Scenario Outline: C235 - User should be able to create a new account"
    },
    {
      "line": 10,
      "value": "#\tGiven a user with username \"\u003cusername\u003e\" and password \"\u003cpassword\u003e\""
    },
    {
      "line": 11,
      "value": "#\tWhen user navigates to New Account Page"
    },
    {
      "line": 12,
      "value": "#\tWhen user create new account using title \"\u003ctitle\u003e\" Description \"\u003cdescription\u003e\" Amount \"\u003camount\u003e\""
    },
    {
      "line": 13,
      "value": "#\tExamples:"
    },
    {
      "line": 14,
      "value": "#\t\t|username\t\t  |password|title|description |amount|"
    },
    {
      "line": 15,
      "value": "#\t\t|demo@techfios.com|abc123  |Shrimp|Two Topping|10    |"
    },
    {
      "line": 16,
      "value": "#\t\t|demo@techfios.com|abc123  |Sandwich| Kabab   |5     |"
    }
  ],
  "line": 18,
  "name": "C234 - New account page should display with error",
  "description": "",
  "id": "new-account-page;c234---new-account-page-should-display-with-error",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 19,
  "name": "a user with username",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "user navigates to New Account Page",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "new account page should display",
  "keyword": "Then "
});
formatter.match({
  "location": "NewAccountSteps.a_user_with_username()"
});
formatter.result({
  "duration": 8557048199,
  "status": "passed"
});
formatter.match({
  "location": "NewAccountSteps.user_navigates_to_New_Account_Page()"
});
formatter.result({
  "duration": 3280292700,
  "status": "passed"
});
formatter.match({
  "location": "NewAccountSteps.new_account_page_should_display()"
});
formatter.result({
  "duration": 1028479999,
  "status": "passed"
});
formatter.after({
  "duration": 2820418700,
  "status": "passed"
});
});