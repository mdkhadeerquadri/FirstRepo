Feature: Login Page

Background:
Given url  "https://tutorialsninja.com/demo/index.php?route=account/login"
Then Login page should display

Scenario: validate Login with valid credentials
Given  email: "shah@gmail.com"
Given  password: "shahzohaib"
And click login button
Then home page is displayed

Scenario: validate Login with invalid credentials
Given  email: "s@gmail.com"
Given  password: "shah"
And click login button
Then No match for credientials 