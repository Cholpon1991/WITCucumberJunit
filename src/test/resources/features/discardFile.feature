@brite
Feature: Inventory adjustment
  Scenario: Discard file during creation
    Given User is in Inventory  page
    When User goes to Inventory Adjustment
    And  User goes to Import
    And  User loads file
    And  User uploads file
    And  User cancels
    Then User clicks to Create button and clicks Ok button







