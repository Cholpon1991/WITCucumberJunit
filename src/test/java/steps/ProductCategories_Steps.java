package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import pages.InventoryPage;

public class ProductCategories_Steps {

    InventoryPage inventoryPage = new InventoryPage();

    @Given("Manager navigates to Products under Configuration and clicks")
    public void manager_navigates_to_Products_under_Configuration_and_clicks() {

        inventoryPage.productsCategories.click();
    }

    @And("Manager clicks Products Categories")
    public void manager_clicks_Products_Categories() {
        inventoryPage.productCategories.click();
    }

    @And("Manager clicks Create button")
    public void manager_clicks_Create_button() {

        inventoryPage.productCategoryCreateButton.click();
    }

    @And("Manager types {string} in Category Name field")
    public void manager_types_in_Category_Name_field(String word) {
        inventoryPage.inputCategoryName.sendKeys(word);
    }

    @And("Manager clicks Parent Category")
    public void manager_clicks_Parent_Category() {
        inventoryPage.parentCategory.click();
    }

    @And("Manager selects All")
    public void manager_selects_All() {
        inventoryPage.all.click();
    }

    @And("Manager clicks Save Button")
    public void manager_clicks_Save_Button() {
        inventoryPage.saveButton.click();
    }

    @Then("Manager sees {string} as a product category name")
    public void manager_sees_as_a_product_category_name(String word) {
        Assert.assertEquals(inventoryPage.productCategoryName.getText(), word);
    }



}
