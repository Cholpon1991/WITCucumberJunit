package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ProductsPage {

    public ProductsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//button[@class='btn btn-primary btn-sm o-kanban-button-new btn-default']")
    public WebElement Create;

    @FindBy (xpath = "//input[@placeholder='Product Name']")
    public WebElement ProductName;

    @FindBy (xpath = "//select[@class='o_input o_field_widget o_required_modifier']")
    public WebElement ProductType;

    @FindBy (xpath = "//option[contains(text(),'Consumable')]")
    public WebElement Consumable;

    @FindBy (xpath = "//input[@class='o_input ui-autocomplete-input']")
    public WebElement Category;

    @FindBy (xpath = "//a[contains(text(),'All / Artistic')]")
    public WebElement All_Artistic;

    @FindBy (name = "default_code")
    public WebElement InternalReference;

    @FindBy (name = "barcode")
    public WebElement Barcode;

    @FindBy (xpath = "//input[@class='o_input']")
    public WebElement SalesPrice;

    @FindBy (xpath = "//td//div//div//input[@class='o_input']")
    public WebElement Cost;

    @FindBy (xpath = "//button[@class='btn btn-primary btn-sm o_form_button_save']")
    public WebElement Save;

    @FindBy (xpath = "//div[@class='o_dialog_warning modal-body']")
    public WebElement ErrorWindow;

}
