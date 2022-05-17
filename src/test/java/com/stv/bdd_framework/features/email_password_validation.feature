# Created by filler547 at 17.05.2022
Feature: Email and Password validation

  Scenario Outline: User enter email address an password
    Given the Wiggle main page is loaded
    When the user clicks on the Your account link
    Then the user goes to the Sign In page
    And the user enter Email Address as "<email address>" and Password as "<password>"
    And click Sign in securely
    Then the user goes to New customer page
    Examples:
      | email address | password |
      | test@test.com | asasasasa |
      | fest@fest.com | asasasasas |
