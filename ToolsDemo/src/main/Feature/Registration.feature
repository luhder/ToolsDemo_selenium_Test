Feature: User Registration

  Scenario: User registers with valid details
    Given user is on the registration page
    When user enters "Redhul" as firstname and "KR" as lastname
    And user enters "redhul@test.com" as email
    And user enters "Password123!" as password
    And clicks on the register button
    Then user is navigated to the welcome page
