Feature: the version can be retrieved
  Scenario: client makes call to GET /info for version
    When the client calls /info
    Then the client receives status code of 200
    And the client receives server version 1.0.0
    And the client receives server name csci-602
    And the client receives server description Template Spring Boot API for use of CSCI 602