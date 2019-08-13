package steps;

import com.github.javafaker.Faker;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.Config;
import utilities.Driver;

public class OperationTypes_Steps {
    @When("User goes to Warehouse management")
    public void user_goes_to_Warehouse_management() {
        Driver.getDriver().get(Config.getProperty("url"));
        WebElement login=Driver.getDriver().findElement(By.id("login"));
        login.sendKeys(Config.getProperty("usernameManager"));
        WebElement password = Driver.getDriver().findElement(By.id("password"));
        password.sendKeys(Config.getProperty("passwordManager")+ Keys.ENTER);

        WebElement inventoryTabdisplay= Driver.getDriver().findElement(By.linkText("Inventory"));
        inventoryTabdisplay.click();

        WebElement warehouseManagement= Driver.getDriver().findElement(By.linkText("Warehouse Management"));
        warehouseManagement.click();

    }

    @When("User clicks Operation Types tab")
    public void user_clicks_Operation_Types_tab() {
        WebElement operationTypesTab= Driver.getDriver().findElement(By.xpath("(//span[@class='oe_menu_text'])[29]"));
        operationTypesTab.click();

    }

    @When("User goes to Create button")
    public void user_goes_to_Create_button() {
        WebElement createButton = Driver.getDriver().findElement(By.xpath("//button[@accesskey='c']"));
        createButton.click();


    }

    @When("faker creates some random string  and passes into Operation Type name")
    public void faker_creates_some_random_string_and_passes_into_Operation_Type_name() {
        Faker faker = new Faker();
        String myString= faker.food().ingredient()  ;

        WebElement operationTypeName= Driver.getDriver().findElement(By.xpath("//input[@class='o_field_char o_field_widget o_input o_required_modifier']"));
        operationTypeName.sendKeys(myString);


    }

    @When("User goes to Reference sequance")
    public void user_goes_to_Reference_sequance() {



    }

    @When("User creates random number from faker class")
    public void user_creates_random_number_from_faker_class() {
        Faker faker1 = new Faker();
        String myString1 = Faker.instance().numerify("12345");
        WebElement referenceSeq = Driver.getDriver().findElement(By.xpath("(//input[@class='o_input ui-autocomplete-input'])[1]"));
        referenceSeq.sendKeys(myString1);

    }
    @When("User goes to Types of  operation")
    public void user_goes_to_Types_of_operation() {
        WebElement typeOfOperationTab= Driver.getDriver().findElement(By.xpath("//select[@class='o_input o_field_widget o_required_modifier']"));
        typeOfOperationTab.click();


    }

    @When("User chooses first value from Types of operation drop down menu")
    public void user_chooses_first_value_from_Types_of_operation_drop_down_menu() {
        Select select = new Select(Driver.getDriver().findElement(By.xpath("//select[@class='o_input o_field_widget o_required_modifier']")));
        select.selectByIndex(1);


    }

    @When("User goes to Operation Type of Returns and chooses {int}th value from it")
    public void user_goes_to_Operation_Type_of_Returns_and_chooses_th_value_from_it(Integer int1) {
        WebElement operationReturnType= Driver.getDriver().findElement(By.xpath("(//input[@class='o_input ui-autocomplete-input'])[3]"));
        operationReturnType.click();

        Driver.getDriver().findElement(By.linkText("YourCompany: 7yy")).click();


    }

    @When("User goes to Show Detailed Operations")
    public void user_goes_to_Show_Detailed_Operations() {
        WebElement showDetailedOperations = Driver.getDriver().findElement(By.xpath("(//input[@type='checkbox'])[3]"));
        showDetailedOperations.click();


    }

    @Then("User goes to Save buttons")
    public void user_goes_to_Save_buttons() {
        WebElement saveButton = Driver.getDriver().findElement(By.xpath("//button[@accesskey='s']"));
        saveButton.click();




    }
}
