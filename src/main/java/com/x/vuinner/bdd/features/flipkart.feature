Feature: Flipkart login functionality


Scenario: Check user can login with valid credentials

Given user is on flipkart home page
When user enter valid username in username field
And user enters valid password in password field
Then user should be successfully logged in