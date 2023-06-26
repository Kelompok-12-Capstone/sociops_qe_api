Feature: User
    As an admin
    I want to create new user and login account
    So that I can create and login account

    Scenario: POST - As admin I have be able to create new account
        Given I set POST sign up api endpoints
        When I send POST sign up HTTP request
        And I recive valid HTTP response code 201
        Then I recive valid data for new user


    Scenario: POST - As admin I shouldn't be able to create new account with inccorect email type
        Given I set POST sign up api endpoints
        When I send POST sign up1 HTTP request
        And I recive invalid HTTP response code 400

    Scenario: POST - As admin I shuldn't be able to create new account with exist
        Given I set POST sign up api endpoints
        When I send POST sign up2 HTTP request
        And I recive invalid HTTP response code 400

    Scenario: POST - As admin I shuldn't be able to create new account with incorrect password type
        Given I set POST sign up api endpoints
        When I send POST sign up3 HTTP request
        And I recive invalid HTTP response code 400

    Scenario: POST - As admin I shuldn't be able to create new account without name
        Given I set POST sign up api endpoints
        When I send POST sign up4 HTTP request
        And I recive invalid HTTP response code 400

    Scenario: POST - As admin I shuldn't be able to create new account with incorrect type role
        Given I set POST sign up api endpoints
        When I send POST sign up5 HTTP request
        And I recive invalid HTTP response code 400

    Scenario: POST - As admin I shuldn't be able to create new account without role
        Given I set POST sign up api endpoints
        When I send POST sign up6 HTTP request
        And I recive invalid HTTP response code 400

    Scenario: POST - As admin I shuldn't be able to create new account without email
        Given I set POST sign up api endpoints
        When I send POST sign up7 HTTP request
        And I recive invalid HTTP response code 400

    Scenario: POST - As admin I shuldn't be able to create new account without password
        Given I set POST sign up api endpoints
        When I send POST sign up8 HTTP request
        And I recive invalid HTTP response code 400