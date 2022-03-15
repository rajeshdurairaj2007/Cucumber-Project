$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/features_File/ALogin.feature");
formatter.feature({
  "line": 1,
  "name": "Booking In Adactin Application",
  "description": "",
  "id": "booking-in-adactin-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Login",
  "description": "",
  "id": "booking-in-adactin-application;login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@run"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User Enter The Username In Username Field",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User Enter The Password In Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User click On The Login Button And It Navigate To Search Hotel",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 6383027800,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Username_In_Username_Field()"
});
formatter.result({
  "duration": 403674700,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Password_In_Password_Field()"
});
formatter.result({
  "duration": 165298500,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_click_On_The_Login_Button_And_It_Navigate_To_Search_Hotel()"
});
formatter.result({
  "duration": 768950500,
  "status": "passed"
});
});