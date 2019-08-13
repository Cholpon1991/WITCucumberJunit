package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.InventoryPage;


public class BriteErpStepsAziza {
    InventoryPage inventoryPage = new InventoryPage();


    @When("User clicks on Inventory button")
    public void user_clicks_on_Inventory_button() {
    inventoryPage.inventoryTab.click();

    }

    @Then("User clicks on Transfers button")
    public void user_clicks_on_Transfers_button() {
       inventoryPage.transfersTab.click();
    }

    @Then("User clicks on Import button")
    public void user_clicks_on_Import_button() {
        inventoryPage.importTab.click();
    }

    @Then("User clicks on Cancel button")
    public void user_clicks_on_Cancel_button() {
        inventoryPage.cancelButton.click();


        Assert.assertTrue("Cancel button is not displayed", inventoryPage.cancelButton.isDisplayed());
    }




}
