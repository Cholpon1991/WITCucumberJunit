Feature: BriteERP Inventory Functionality

  @productCategories @smoke
  Scenario: Create Product Categories as a manager

    Given Manager navigates to Products under Configuration and clicks
    And Manager clicks Products Categories
    And Manager clicks Create button
    And Manager types "Cars" in Category Name field
    And Manager clicks Parent Category
    And Manager selects All
    And Manager clicks Save Button
    Then Manager sees "Cars" as a product category name




