Feature: User Registration
Scenario: User registers on the website using valid credentials
Given User is on the registration page
When User enters a valid email, password, and other required details
And User clicks on the register button
Then the user should be registered successfully and see a confirmation message
