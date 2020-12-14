
Feature: Search Functionality 
@TestRun
Scenario: Search Functionality Verify
Given I navigate to the PwC Digital Pulse website
When I click on the 'Magnifying glass' icon to perform a search
And I enter the text 'Single page applications'
And I submit the search
Then I am taken to the search results page
And I am presented with at least 1 search result