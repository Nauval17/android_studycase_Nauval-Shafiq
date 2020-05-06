@Android-POS
Feature: Checkout

  Background: login with correct username and password
    Given User is on moka start page
    When User click sign in button on moka start page
    And User is on moka login page
    And User insert correct email "nauval.shafiq17@gmail.com" in email field
    And User insert correct password "mokaAPPS2020" in password field
    And User click sign in button on moka login page

  @Lowest_Payment_All
  Scenario Outline: Choose item from favourite tab
    Given User is on moka POS Page
    When User choose an item "<itemName>" from favourite tab
    And User choose item "Fried Rice" 3 amount
    And User click charge button
    And User is on pay page
    And User choose lowest payment
    And User pay the amount
    Then User get change information
    Examples:
      | itemName        | itemQty
      | Fried Rice      | 3
#      | Ice Tea         | 1
#      | Vegetable Salad | 2

#@Lowest_Payment_Fried-Rice
#    Scenario: Choose Fried Rice from favourite tab
#      Given User is on moka POS Page
#      When User choose an item "Fried Rice" from favourite tab
#      And User choose item "1" amount
#      And User click charge button
#      And User choose lowest payment
#      And User pay the amount
#      Then User get change information

#  @Middle_Payment_All
#  Scenario Outline: Choose item from favourite tab
#    Given User is on moka POS Page
#    When User choose an item "<itemName>" from favourite tab
#    And User choose item "<itemName>" "<itemQty>" amount
#    And User click charge button
#    And User choose middle payment
#    And User pay the amount
#    Then User get change information
#    Examples:
#      | itemName        | itemQty
#      | Fried Rice      | 0
#      | Ice Tea         | 1
#      | Vegetable Salad | 2
#
#    @Custom_Payment_All
#      @Middle_Payment_All
#    Scenario Outline: Choose item from favourite tab
#      Given User is on moka POS Page
#      When User choose an item "<itemName>" from favourite tab
#      And User choose item "<itemQty>" amount
#      And User click charge button
#      And User choose custom payment
#      And User pay the amount
#      Then User get change information
#      Examples:
#        | itemName        | itemQty
#        | Fried Rice      | 0
#        | Ice Tea         | 1
#        | Vegetable Salad | 2