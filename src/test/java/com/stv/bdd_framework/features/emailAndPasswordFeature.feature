Feature: Email and Password validation

  Scenario Outline: User enter email address and password
    Given the Wiggle main page is loaded
    When the user clicks on the Your account link
    And the user goes to the Sign In page
    And the user enter Email Address as "<email>" and Password as "<password>"
    And click Sign in securely
    Then the user goes to New customer page
    Examples:
      | email         | password   |
      | test@test.com | asasasasa  |
      | fest@fest.com | asasasasas |
