Feature: Login page

Background:
Given url:"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
Then login page should open

Scenario Outline: login with valid input
Given username <username>
Given password <password>
And click on login button
Then Dashboard page should open
Examples:
|username|password|
|"Admin"|"admin123"|

Scenario: login with invalid input
Given username "admin"
Given password "123"
And click on login button
Then Dashboard page should not open
