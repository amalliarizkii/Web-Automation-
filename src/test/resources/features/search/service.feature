Feature: Searching Functionality

  Scenario: Searching Service Centre in Sydney
    Given User already on home page
    When I input search "Apply for a number plate"
    And I click button search
    Then I redirected to search result page
    When I click Apply to collect number plates from another service centre
    Then I redirected to number plates page
    When I click button find a service centre
    Then I redirected to Find a Service NSW location page
    When I click search by suburb, postcode or current location field
    And I input "Sydney Domestic Airport 2020"
    And I click button search service location
    And I click Marrickville Service Centre
    Then I redirected to Marrickville Service Centre

