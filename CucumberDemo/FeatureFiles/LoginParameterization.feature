@SimpleLogin
Feature: This is login feature for Studentpractice
  @Positive
  Scenario: This is valid login scenario
    Given user is on the login page
    When when the user enters the valid "practice" and "SuperSecretPassword!"
    And clicks on the login button
    Then the user should be navigated to the home page
    
   @Negative
   Scenario: This is invalid login scenario
    Given user is on the login page
    When when the user enters the invalid "practice1" and "SuperSecretPassword!1"
    And clicks on the login button
    Then the user should not be navigated to the home page
  
