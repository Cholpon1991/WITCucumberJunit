package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.ProductFunctionalityPage;
import utilities.Config;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class ProductFunctionality_Steps {

   ProductFunctionalityPage practicePage = new ProductFunctionalityPage();


    @Then("Manager clicks product button")
    public void manager_clicks_product_button() {
        practicePage.products.click();
    }

    @Then("Manager clicks create button")
    public void manager_clicks_create_button() {
        practicePage.create.click();
    }

    @Then("Manager clicks purchase button")
    public void manager_clicks_purchase_button() {
        practicePage.purchase.click();
    }

    @When("Manager clicks Add an item")
    public void manager_clicks_Add_an_item() {
        practicePage.Add_an_item.click();
    }

    @When("Manager clicks Vendor Product Name button")
    public void manager_clicks_Vendor_Product_Name_button() {
        practicePage.vendorTab.sendKeys("anything" + Keys.ENTER);
    }

    @When("Manager clicks Vendor Product Code button")
    public void manager_clicks_Vendor_Product_Code_button() {
        practicePage.productCode.sendKeys("123");
    }

    @When("Manager clicks Delivery Lead Time button")
    public void manager_clicks_Delivery_Lead_Time_button() {
        practicePage.deliveryLeadTime.click();
    }

    @When("Manager clicks Minimal Quantity button")
    public void manager_clicks_Minimal_Quantity_button() {
        practicePage.minimalQuantity.sendKeys("2");
    }

    @When("Manager clicks Price button")
    public void manager_clicks_Price_button() {
        practicePage.price.sendKeys("5");
    }

    @When("Manager clicks Validity Start Date button and enters the date")
    public void manager_clicks_Validity_Start_Date_button_and_enters_the_date() {
        practicePage.Validity_Start_Date.sendKeys("01-01-2019" + Keys.ENTER);


    }

    @When("Manager clicks Validity End Date button and enters the date")
    public void manager_clicks_Validity_End_Date_button_and_enters_the_date() {
        practicePage.vaidity_End_Date.sendKeys("01-30-2019" + Keys.ENTER);
    }

    @When("Manager clicks Save & Close button")
    public void manager_clicks_Save_Close_button() {
        practicePage.saveCloseButton.click();

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(),
                "http://54.148.96.210/web?#id=&view_type=form&model=product.template&menu_id=378&action=521");

    }
}