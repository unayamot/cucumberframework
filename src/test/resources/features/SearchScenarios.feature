@Chrome
Feature: Search Scenarios
  As a user of DuckDuckGo, I want to be able to search for stuff

  Scenario: 01. Search and select a result
    Given I am on the search page
    When I search for "Reddit"
    And I view the first result
    Then I see the Reddit homepage