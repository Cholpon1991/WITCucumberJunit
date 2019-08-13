Feature: BriteERP Inventory Functionality

  @discardScrap @smoke
  Scenario: Discard Scrap Orders Creation as a manager
    Given Manger navigates to Scrap and clicks
    And Manager clicks Create button_
    And Manager clicks Discard button
    Then Manager sees "Scrap Orders" in main header

