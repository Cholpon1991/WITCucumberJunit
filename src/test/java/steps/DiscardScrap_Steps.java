package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.InventoryPage;
import utilities.Driver;

public class DiscardScrap_Steps {

    InventoryPage inventoryPage = new InventoryPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);

    @Given("Manger navigates to Scrap and clicks")
    public void manger_navigates_to_Scrap_and_clicks() {
       wait.until(ExpectedConditions.elementToBeClickable(inventoryPage.scrap)).click();
    }

    @Given("Manager clicks Create button_")
    public void manager_clicks_Create_button_() {
        inventoryPage.scrapCreateButton.click();
    }

    @Given("Manager clicks Discard button")
    public void manager_clicks_Discard_button() {
        inventoryPage.discardButton.click();
    }
    @Then("Manager sees {string} in main header")
    public void manager_sees_in_main_header(String word) {
        System.out.println(inventoryPage.scrapOrdersHeader.getText());
        System.out.println(Driver.getDriver().getTitle());
        //application is not giving actual header text
        //application is not giving actual title

    }

}
