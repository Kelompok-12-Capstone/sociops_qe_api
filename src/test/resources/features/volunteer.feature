Feature: Volunteer
    As an User
    I want to manage volunteer
    so that I can edit volunteer data

    Scenario: POST As admin I have be able to create new volunteer data
        Given I set POST new volunteer api endpoints
        When I send POST new volunteer HTTP request
        Then I receive valid HTTP response code 200
        And I receive valid post data for new volunteer

    Scenario: POST As admin I not be able to create with invalid data
        Given I set POST new volunteer api endpoints
        When I send POST new volunteer HTTP request with invalid data
        Then I receive valid HTTP response code 500

    Scenario: GET As admin I have be able to get volunteer data by id
        Given I set GET volunteer by id api endpoints
        When I send GET volunteer by id HTTP request
        Then I receive valid HTTP response code 200
        And I receive valid get data for single volunteer data

    Scenario: DELETE As admin i want to delete volunteer data
        Given I set DELETE volunteer api endpoint
        When I send DELETE volunteer HTTP request
        Then I receive valid HTTP response code 200

    Scenario: GET As admin I have be able to get all volunteer data
        Given I set GET all volunteer api endpoints
        When I send GET all volunteer HTTP request
        Then I receive valid HTTP response code 200
        And I receive valid get data for all volunteer data

