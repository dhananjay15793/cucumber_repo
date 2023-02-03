@smokeFeature
Feature: feature to test login functionality
   
  @smoketest 
  Scenario: check login is successfull with valid credential
    Given user is on login page
    When user enter user name and password
    And click on login button
    Then user is navigating to the home page

 