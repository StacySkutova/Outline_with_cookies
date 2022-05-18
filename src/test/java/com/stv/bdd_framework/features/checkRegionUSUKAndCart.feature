# Created by fille at 19.05.2022
Feature: Region check for wiggle.com


  Scenario: 1. Check changing Region US - UK, UK - US and check US dollars icon
    Given the main page is loaded
    When the user click on US flag icon
    And choose destination to UK
    And click update button
    And check the US flag has bean changed to UK flag
    Then click UK flag
    And choose destination to US
    And click update button
    And check the UK flag has bean changed to US flag
    And check US dollars icon in the cart