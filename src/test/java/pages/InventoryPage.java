package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class InventoryPage {

    public InventoryPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//a[@href='/web#menu_id=351&action=']")
    public WebElement productsCategories;

    @FindBy(xpath = "//a[@href='/web#menu_id=354&action=232']")
    public WebElement productCategories;

    @FindBy (xpath = "//span[contains(text(),'Warehouse Management')]")
    public WebElement WarehouseManagement;

    @FindBy (xpath = "//span[contains(text(),'Warehouses')]")
    public WebElement Warehouses;

    @FindBy (xpath = "//span[contains(text(),'Products')]")
    public WebElement Products;

    @FindBy(xpath = "(//div[@class='o_list_buttons']//button)[1]")
    public WebElement productCategoryCreateButton;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement inputCategoryName;

    @FindBy(xpath = "(//input[@type='text'])[5]")
    public WebElement parentCategory;

    @FindBy(xpath = "//li[.='All']")
    public WebElement all;

    @FindBy (xpath = "//button[@class='btn btn-primary btn-sm o_form_button_save']")
    public WebElement saveButton;

    @FindBy (xpath = "//span[@class='o_field_char o_field_widget o_required_modifier']")
    public WebElement productCategoryName;

    @FindBy(xpath = "//a[@href='/web#menu_id=369&action=501']")
    public WebElement scrap;

    @FindBy(xpath = "//div[@class='o_list_buttons']/button[1]")
    public WebElement scrapCreateButton;

    @FindBy(xpath = "//button[@class='btn btn-default btn-sm o_form_button_cancel']")
    public WebElement discardButton;

    @FindBy(xpath = "(//li[@class='active'])[3]")
    public WebElement scrapOrdersHeader;

    //Aziza's part


    @FindBy(xpath = "(//a[@class='oe_menu_toggler'])[3]")
    public WebElement inventoryTab;

    @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div[6]/ul[1]/li[1]/a/span")
    public WebElement transfersTab;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-default o_button_import']")
    public WebElement importTab;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-default o_import_cancel']")
    public WebElement cancelButton;





}
