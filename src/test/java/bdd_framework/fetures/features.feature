Feature: Reset password transaction

  Scenario : 1. checking the transition to the password recovery page
    Given the page is loaded
    When the user clicks on the link Forgotten the password
    Then  the user goes to the reset password page
