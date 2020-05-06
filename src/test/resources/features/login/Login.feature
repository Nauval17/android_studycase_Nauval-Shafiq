@Android
Feature: Login

  Scenario: login with correct username and password
    Given User is on moka start page
    When User click sign in button on moka start page
    And User is on moka login page
    And User insert correct email "nauval.shafiq17@gmail.com" in email field
    And User insert correct password "mokaAPPS2020" in password field
    And User click sign in button on moka login page
    Then User log in to POS HomePage