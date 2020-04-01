Feature: Google homepage search
  As user
  I want to search a book in google search
  for checking the book page

  Background: Open the homepage of google
    Given I am on google homepage

  Scenario: Find the first result in google using the search button
    When I search 'The name of the wind' using search button
    Then the Google Search results page is dispayed
    And the first result is 'The Name of the Wind - Patrick Rothfuss'

  Scenario: Go to a book page with search button
    When I search 'The name of the wind' using search button
    And I select the first result of the search
    Then the 'Patrick Rothfuss - The Books' page should be displayed

  @WorkingOn
  Scenario: Display suggestions list
    When I write 'The name of the w' into the search field
    Then the suggestions list is dispayed

  Scenario: Find the first result in google using the suggestions list
    When I search 'The name of the w' using suggestions list
    Then the Google Search results page is dispayed
    And the first result is 'The Name of the Wind - Patrick Rothfuss'

  Scenario: Go to a book page with suggestions list
    When I search 'The name of the w' using suggestions list
    And I select the first result of the search
    Then the 'Patrick Rothfuss - The Books' page should be displayed
