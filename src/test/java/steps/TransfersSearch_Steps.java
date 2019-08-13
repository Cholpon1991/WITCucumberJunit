package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.TransferSearchPage;
import utilities.Config;
import utilities.Driver;

import static org.junit.Assert.assertEquals;

public class TransfersSearch_Steps {
    TransferSearchPage transferSearchPage=new TransferSearchPage();
    @Given("User is on Inventory page")


    @When("User goes to Transfers tab")
    public void user_goes_to_Transfers_tab() throws InterruptedException {
        transferSearchPage.transferTab.click();

    }

    @When("User types {string} word in the search box")
    public void user_types_word_in_the_search_box(String string) throws InterruptedException {
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.visibilityOf(transferSearchPage.searchBox));
        transferSearchPage.searchBox.sendKeys("anything" + Keys.ENTER);

    }

    @Then("User verify the current url")
    public void user_verify_the_current_url() {

        String actualTitle=Driver.getDriver().getTitle();
        String expectedInTitle="Odoo";

        Assert.assertTrue(actualTitle.contains(expectedInTitle));

    }

}
