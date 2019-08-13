package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.Keys;
import pages.InventoryVoluationPage;
import utilities.Config;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class InventoryVoluation_Steps {

  InventoryVoluationPage manager2Page = new InventoryVoluationPage();


    @Then("Manager{int} Click on Inventory  Valuation button")
    public void manager_Click_on_Inventory_Valuation_button(Integer int1) {
        manager2Page.inventoryValuation2.click();
    }

    @Then("Clicks  on Retrieve the inventory valuation tab")
    public void clicks_on_Retrieve_the_inventory_valuation_tab() {
        manager2Page.retriveButton.click();
    }

    @Then("Navigates to Search button and clicks")
    public void navigates_to_Search_button_and_clicks() throws InterruptedException {
        Thread.sleep(3000);
        manager2Page.searchBox.sendKeys("Ice Cream");
        manager2Page.searchBox.click();

    }



}