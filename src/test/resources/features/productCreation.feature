Feature: General Info in product creation

  @productCreation @smoke
  Scenario: Changing values in General Info when creating product

    Given Manager clicks on Products tab
    And Manager clicks on Create button
    And Manager enters "AAA Title" in Product Name textbox
    And Manager sets Product Type to Consumable
    And Manager sets Category to All_Artistic
    And Manager enters Int Reference in Internal Reference textbox
    And Manager enters "#0093215" in Barcode textbox
    And Manager sets Sales Price to "100"
    And Manager sets Cost to "75"
    And Manager clicks on Save Button
    Then Manager should see an error popup