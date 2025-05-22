Feature: Get current list

  @Test
  Scenario: Get current list
    Given check api using GET
    Then status code should be 200
    And validate the response

  @Test
  Scenario: Create user
    Given user reads "createUser" from file
    When create user using POST
    Then status code should be 201
    And validate the response

