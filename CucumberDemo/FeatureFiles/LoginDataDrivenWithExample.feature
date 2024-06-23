
Feature: This is login feature with example
  
  Scenario Outline: This is login scenario with example
    Given Proceed to login page
    When User enters "<Username>" and "<Password>"
    And clicked login
    Then you should see the home page there in the web
    Examples:
    |Username|Password|
    |practice1|dummy|
    |practice|SuperSecretPassword!|