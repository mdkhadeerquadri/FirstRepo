Feature: orangeHRM login page

Background:
Given url:"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"

Scenario: Login with valid inputs
Given username:"Admin"
Given password:"admin123"
And click on login button
Then home page should display

Scenario: Login with invalid inputs
Given username:"Ad"
Given password:"admi"
And click on login button
Then invalid credentials should display
