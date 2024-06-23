@SimpleLogin 
@DataDriven
Feature: This is login feature without header
  
  Scenario: This is login scenario without header
    Given You are on the login page
    When You enter below credentials
    | practice | SuperSecretPassword! |
    And click the login button
    Then you should see the home page