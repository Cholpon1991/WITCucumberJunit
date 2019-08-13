package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import pages.InventoryPage;
import pages.ProductsPage;

public class DuplicateProduct {

    InventoryPage inventoryPage = new InventoryPage();
    ProductsPage productsPage = new ProductsPage();

    @Given("Manager clicks on Products tab")
    public void manager_clicks_on_Products_tab() {
        inventoryPage.Products.click();
    }

    @And("Manager clicks on Create button")
    public void manager_clicks_on_Create_button() {
        productsPage.Create.click();
    }

    @And("Manager enters {string} in Product Name textbox")
    public void manager_enters_in_Product_Name_textbox(String string) {
        productsPage.ProductName.sendKeys(string);
    }

    @And("Manager sets Product Type to Consumable")
    public void manager_setsProduct_Type_to_Consumable() {
        productsPage.ProductType.click();
        productsPage.Consumable.click();
    }

    @And("Manager sets Category to All_Artistic")
    public void manager_sets_Category_to_All_Artistic() {
        productsPage.Category.click();
        productsPage.All_Artistic.click();
    }

    @And("Manager enters Int Reference in Internal Reference textbox")
    public void manager_enters_Int_Reference_in_Internal_Reference_textbox() {
        productsPage.InternalReference.click();
        productsPage.InternalReference.sendKeys("Int Reference");
    }

    @And("Manager enters {string} in Barcode textbox")
    public void manager_enters_in_Barcode_textbox(String string) {
        productsPage.Barcode.sendKeys(string);

    }

    @And("Manager sets Sales Price to {string}")
    public void manager_sets_Sales_Price_to(String string) {
        productsPage.SalesPrice.click();
        productsPage.SalesPrice.clear();
        productsPage.SalesPrice.sendKeys(string);
    }

    @And("Manager sets Cost to {string}")
    public void manager_sets_Cost_to(String string) {
        productsPage.Cost.click();
        productsPage.Cost.clear();
        productsPage.Cost.sendKeys(string);
    }

    @And("Manager clicks on Save Button")
    public void manager_clicks_on_Save_Button() {
        productsPage.Save.click();
    }

    @Then("Manager should see an error popup")
    public void manager_should_see_an_error_popup() {
        Assert.assertTrue(productsPage.ErrorWindow.getText().contains("A barcode can only be assigned to one product"));
    }

}
