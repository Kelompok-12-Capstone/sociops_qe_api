Feature: As admin I want to see customer Page

  Scenario: As admin I want to see all user
    Given I set GET all user api endpoints
    When I send GET all user HTTP request
    And I recive valid HTTP response code 201
    Then I recive valid data

  Scenario: As admin I want to see all user with param page
    Given I set GET all user1 api endpoints
    When I send GET all user1 HTTP request
    And I recive valid HTTP response code 201
    Then I recive valid data

  Scenario: As admin I want to see all user with param page size
    Given I set GET all user2 api endpoints
    When I send GET all user2 HTTP request
    And I recive valid HTTP response code 201
    Then I recive valid data

  Scenario: As admin I want to see all user with params sort ascending
    Given I set GET all user3 api endpoints
    When I send GET all user3 HTTP request
    And I recive valid HTTP response code 201
    Then I recive valid data

  Scenario: As admin I want to see all user with params sort descending
    Given I set GET all user4 api endpoints
    When I send GET all user4 HTTP request
    And I recive valid HTTP response code 201
    Then I recive valid data

  Scenario: As admin I want to see all fundraising participants
    Given I set GET all fundraising participants api endpoints
    When I send GET all fundraising participants HTTP request
    And I recive valid HTTP response code 201
    Then I recive valid data

  Scenario: As admin I want to see all volunteer participants
    Given I set GET all volunteer participants api endpoints
    When I send GET all volunteer participants HTTP request
    And I recive valid HTTP response code 201
    Then I recive valid data