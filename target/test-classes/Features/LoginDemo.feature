Feature: Test login functionality

  Scenario Outline: check login is sucessfull with valid credential
    Given Browser is open
    And user is in login page
    When user enter <username> and <password>
    Then user is navigated to home page

    Examples:
    |username|password|
    |Dhananjay|12345|
    |manish|12345|