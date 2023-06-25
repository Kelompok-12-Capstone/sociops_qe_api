Feature: User
  As an admin
  I want to create new user and login account
  So that I can create and login account

  Scenario: POST - As admin I have be able to login
    Given I set POST sign in api endpoints
    When I send POST sign in HTTP request
    And I recive valid HTTP response code 201
    Then I recive valid data for login

  Scenario: POST - As admin I have be able to login without email
    Given I set POST sign in api endpoints
    When I send POST sign in1 HTTP request
    And I recive valid HTTP response code 400

  Scenario: POST - As admin I have be able to login with unregist email
    Given I set POST sign in api endpoints
    When I send POST sign in2 HTTP request
    And I recive valid HTTP response code 400

  Scenario: POST - As admin I have be able to login with inccorect type email
    Given I set POST sign in api endpoints
    When I send POST sign in3 HTTP request
    And I recive valid HTTP response code 400

  Scenario: POST - As admin I have be able to login without password
    Given I set POST sign in api endpoints
    When I send POST sign in4 HTTP request
    And I recive valid HTTP response code 400

  Scenario: POST - As admin I have be able to login with inccorect type password
    Given I set POST sign in api endpoints
    When I send POST sign in5 HTTP request
    And I recive valid HTTP response code 400


