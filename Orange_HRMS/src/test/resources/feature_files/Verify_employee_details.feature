
@employee_deatils
Feature: This feature is to get the employee deatils from the Orange hrm app

Scenario Outline: This test to verify the employee deatils 

Given  User is Logged in successfully and enter in to Home page
When  User click the Admin option from menu bar
And  Enter the <username> in field
Then  Click the search button
And  User should see the Admin details

Examples:
|username|
|Admin123|
