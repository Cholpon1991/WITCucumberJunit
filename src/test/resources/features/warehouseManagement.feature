Feature: Warehouses verification

  @deleteWarehouse @smoke
  Scenario: Manager should fail to delete selected warehouse

    Given Manager clicks on Warehouse Management dropdown
    And Manager clicks on Warehouses
    And Manager selects My Company, Chicago warehouse checkbox
    And Manager clicks on Action dropdown that appears
    And Manager selects Delete option
    And Manager confirms deletion
    Then Manager should see an Odoo Server Error window popup