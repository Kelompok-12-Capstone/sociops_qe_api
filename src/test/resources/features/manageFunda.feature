Feature: Manage Fundraising Admin

  As an admin
  I have to manage fundraising
  So that I can accept, reject or pending the fund

  Scenario: POST - create new fundraising
    Given I set POST api endpoints manage fundraising admin
    When I send POST HTTP request manage the fundraising
    Then I receive HTTP response code 200

#  Scenario: POST - new fundraising  with no description about programs
#    Given I set POST api endpoints manage fundraising admin
#    When I send POST HTTP request with no desc program
#    Then I receive HTTP response code 500
#
#  Scenario: POST - new fundraising without typing the type
#    Given I set POST api endpoints manage fundraising admin
#    When I send POST HTTP request without typing the type
#    Then I receive HTTP response code 400
#
#  Scenario: POST - new Fudaraising without fill the body request
#    Given I set POST api endpoints manage fundraising admin
#    When I send POST HTTP request without fill the body request
#    Then I receive HTTP response code 400
#
#
#  Scenario: GET - all categories ACCEPTED
#    Given I set GET all the category api endpoints manage fundraising admin
#    When I send GET HTTP request Accepted
#    Then I receive GET all HTTP response code 200
#
#  Scenario: GET - all categories REJECTED
#    Given I set GET all the REJECTED category api endpoints manage fundraising admin
#    When I send GET HTTP request Rejected
#    Then I receive GET all HTTP response code 200
#
#  Scenario: GET - all categories PENDING
#    Given I set GET all the PENDING category api endpoints manage fundraising admin
#    When I send GET HTTP request Pending
#    Then I receive GET all HTTP response code 200
#
#  Scenario: GET - Some fundraising with its ID
#    Given I set GET fundraising api endpoints by ID
#    When I send GET ID HTTP request
#    Then I receive GET by ID HTTP response code 200
#
#  Scenario: PATCH - updating status on fundraising using their ID
#    Given I set PATCH  api endpoints to manage status fundraising admin
#    When I send PATCH HTTP request
#    Then I receive PATCH HTTP response code 200
#
#  Scenario: DELETE - fundraising by its ID
#    Given I set DELETE api endpoints manage fundraising admin
#    When I send DELETE HTTP request
#    Then I receive DELETE HTTP response code 200