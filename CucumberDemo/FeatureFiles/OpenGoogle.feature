Feature: This is to test google search
Scenario: Google search Scenario
Given user is entering google.co.in
When user is typing the search term "Agni"
And enter the return key
Then the user should see the search results