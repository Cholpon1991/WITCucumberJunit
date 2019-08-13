package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.Config;
import utilities.Driver;

public class DiscardFile_Steps {
    @Given("User is in Inventory  page")
    public void user_is_in_Inventory_page() {
        Driver.getDriver().get(Config.getProperty("url"));
        WebElement login = Driver.getDriver().findElement(By.id("login"));
        login.sendKeys(Config.getProperty("username"));
        WebElement password = Driver.getDriver().findElement(By.id("password"));
        password.sendKeys(Config.getProperty("password")+ Keys.ENTER);

        WebElement inventoryTabdisplay= Driver.getDriver().findElement(By.linkText("Inventory"));
        inventoryTabdisplay.click();


    }

    @Then("User goes to Inventory Adjustment")
    public void user_goes_to_Inventory_Adjustment() {
        WebElement inventoryAdjustment = Driver.getDriver()
                .findElement(By.linkText("Inventory Adjustments"));
        inventoryAdjustment.click();


    }

    @Then("User goes to Import")
    public void user_goes_to_Import() {
        WebElement importButtton = Driver.getDriver().
                findElement(By.xpath("//button[@class='btn btn-sm btn-default o_button_import']"));
        importButtton.click();


    }

    @Then("User loads file")
    public void user_loads_file() {
        WebElement fileLoad = Driver.getDriver().
                findElement(By.xpath("//label[@class='btn btn-primary']"));

    }

    @Then("User cancels")
    public void user_cancels() {
        WebElement cancelButton = Driver.getDriver().findElement(By.xpath("//button[@class='btn btn-sm btn-default o_import_cancel']"));
        cancelButton.click();

    }

    @Then("User clicks to Create button and clicks Ok button")
    public void user_clicks_to_Create_button_and_clicks_Ok_button() {
        WebElement createButton = Driver.getDriver().findElement(By.xpath("(//button[@accesskey])[1]"));
        createButton.click();

        WebElement okButton = Driver.getDriver().findElement(By.xpath("//button[@class='btn btn-sm btn-primary']"));
        okButton.click();


    }

    @And("User uploads file")
    public void userUploadsFile() {
        WebElement inventoryAdjustment = Driver.getDriver()
                .findElement(By.linkText("Inventory Adjustments"));

        WebElement uploadFile = Driver.getDriver().findElement(By.id("my-file-selector"));
        Assert.assertTrue("Inventory Adjustment is not displayed",inventoryAdjustment.isDisplayed());
    }
}
