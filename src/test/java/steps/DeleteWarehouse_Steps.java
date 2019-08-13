package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import pages.InventoryPage;
import pages.WarehousesPage;
import utilities.Waits;

public class DeleteWarehouse_Steps {

    WarehousesPage warehousesPage = new WarehousesPage();
    InventoryPage inventoryPage = new InventoryPage();
    Waits wait = new Waits();

    @Given("Manager clicks on Warehouse Management dropdown")
    public void manager_clicks_on_Warehouse_Management_dropdown() {
        inventoryPage.WarehouseManagement.click();
    }

    @And("Manager clicks on Warehouses")
    public void manager_clicks_on_Warehouses() {
        inventoryPage.Warehouses.click();
    }

    @And("Manager selects My Company, Chicago warehouse checkbox")
    public void manager_selects_My_Company_Chicago_warehouse_checkbox() {
        warehousesPage.MyCompanyChicago_Checkbox.click();
    }

    @And("Manager clicks on Action dropdown that appears")
    public void manager_clicks_on_Action_dropdown() {
        warehousesPage.ActionDropdown.click();
    }

    @And("Manager selects Delete option")
    public void manager_selects_Delete_option() {
        warehousesPage.Delete.click();

    }

    @And("Manager confirms deletion")
    public void manager_confirms_deletion() {
        warehousesPage.ConfirmDeletion.click();
    }

    @Then("Manager should see an Odoo Server Error window popup")
    public void manager_should_see_an_Odoo_Server_Error_window_popup() throws InterruptedException{
        Thread.sleep(1500);
        Assert.assertEquals("Error popup not confirmed", "Odoo Server Error - Validation Error", warehousesPage.ErrorPopup.getText());
    }

}
