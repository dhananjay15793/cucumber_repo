Feature: feature to test google search functionality 

Scenario: validate google search is working 

Given Browser is open
And  User is on google search page
When User enters a text in google search box
And Hit Enters
Then User is Navigate to search results