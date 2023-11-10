Feature: Introduction to BDD & Cucumber

  Scenario: The example
    Given an example scenario
    When all step definitions are implemented
    Then the scenario passes

    Scenario: I have correct money on my wallet
      Given I have 100 euros in my wallet
      When I spend 50 euros
      Then I should have 50 euros
