# Created by fille at 15.05.2022
Feature: Region check for wiggle.com


  Scenario: 1. Check Region UK US UK US
    Given the main page is loaded
    When flag click
    And choose destination UK
    And choose update click
    And check UK flag
    Then choose destination US
    And choose update click
    And check US flag
    And check US dollars icon in cart