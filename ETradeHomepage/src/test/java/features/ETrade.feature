
@smoketest
Feature: Homepage functionalities work properly
  Scenario: homepage functionality check
    Given user is in homepage
    When user mouse hover on Account Types menu
    And user clicks on Core Portfolios link
    Then user should see Meet Core Portfolios text

