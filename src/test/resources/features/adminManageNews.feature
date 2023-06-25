Feature: Manage News Admin

    As an admin
    I want to manage news
    So that I can create and read news  

    # Scenario: POST - Create new news with correct format
    #     Given I set POST api endpoints manage news admin
    #     When I send POST HTTP request manage news admin correct format
    #     Then I receive HTTP response code 200 manage news admin

    Scenario: POST - Create new news without fill title payload
        Given I set POST api endpoints manage news admin
        When I send POST HTTP request manage news admin without fill title payload
        Then I receive HTTP response code 400 manage news admin

    Scenario: POST - Create new news without fill description payload
        Given I set POST api endpoints manage news admin
        When I send POST HTTP request manage news admin without fill description payload
        Then I receive HTTP response code 400 manage news admin

    Scenario: POST - Create new news only fill 1 char in title payload
        Given I set POST api endpoints manage news admin
        When I send POST HTTP request manage news admin only fill 1 char in title payload
        Then I receive HTTP response code 400 manage news admin

    Scenario: POST - Create new news only fill 1 char in description payload
        Given I set POST api endpoints manage news admin
        When I send POST HTTP request manage news admin only fill 1 char in description payload
        Then I receive HTTP response code 400 manage news admin

    Scenario: GET - All news
        Given I set GET api endpoints all news
        When I send GET HTTP request all news
        Then I receive HTTP response code 200 manage news admin

    Scenario: GET - News by ID
        Given I set GET api endpoints news by id
        When I send GET HTTP request new by id
        Then I receive HTTP response code 200 manage news admin

    Scenario: GET - News by out of bound ID
        Given I set GET api endpoints news by out of bound id
        When I send GET HTTP request new by out of bound id
        Then I receive HTTP response code 404 manage news admin

    Scenario: GET - News by invalid ID
        Given I set GET api endpoints news by invalid id
        When I send GET HTTP request new by invalid id
        Then I receive HTTP response code 404 manage news admin