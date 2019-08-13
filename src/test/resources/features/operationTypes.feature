@briteSecond
Feature: Warehouse management as a manager
  Scenario: inventoryManagement
    Given User is in Inventory  page
    When User goes to Warehouse management
    And  User clicks Operation Types tab
    And  User goes to Create button
    When faker creates some random string  and passes into Operation Type name
    And  User goes to Reference sequance
    And  User creates random number from faker class
    And  User goes to Types of  operation
    And  User chooses first value from Types of operation drop down menu
    And  User goes to Operation Type of Returns and chooses 5th value from it
    And  User goes to Show Detailed Operations
    Then User goes to Save buttons


