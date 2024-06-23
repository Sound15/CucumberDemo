@DataDriven
Feature: This is login feature with header
  
  Scenario: This is login scenario with header
    Given You are in the login page
    When You enter the below credentials
    | Username | Password |
    | practice | SuperSecretPassword! |
    And click on the login button
    Then you should see the home page there