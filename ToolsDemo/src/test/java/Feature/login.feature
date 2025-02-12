Feature: Login functionality
Scenario: User logs in with valid credentials
Given user is on the login page
When user enters email "redhulkr2003@gmail.com" and password "RegisterRedhul@1223"
And clicks on the login button
Then user is navigated to the homepage
