Feature: Create Product - View and edit Purchase tab as a manager

  @smoke
  Scenario: Verify View and edit Purchase tab as a manager


    And Manager clicks product button
    Then Manager clicks create button
    And Manager clicks purchase button
    When Manager clicks Add an item
    And Manager clicks Vendor Product Name button
    And Manager clicks Vendor Product Code button
    And Manager clicks Delivery Lead Time button
    And Manager clicks Minimal Quantity button
    And Manager clicks Price button
    And Manager clicks Validity Start Date button and enters the date
    And Manager clicks Validity End Date button and enters the date
    When Manager clicks Save & Close button

