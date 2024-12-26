@pendingsheet

Feature: This feature is get the pending timesheet 

Scenario Outline: This test to verify the pending timesheet

Given User is on the homepage
When The user click on the time option from menu
And  User enter the <employee name> 
Then Click on the view button 
And  User verify the pending task

Examples:
|employee name|
|John  Doe|



 