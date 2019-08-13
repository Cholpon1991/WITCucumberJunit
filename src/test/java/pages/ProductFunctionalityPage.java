package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ProductFunctionalityPage {

    public ProductFunctionalityPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(linkText= "Products")
    public WebElement products;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o-kanban-button-new btn-default']")
    public WebElement create;

    @FindBy(linkText= "Purchase")
    public WebElement purchase;

    @FindBy(linkText= "Add an item")
    public WebElement Add_an_item;

    @FindBy(xpath= "//input[@name='product_name']")
    public WebElement vendorTab;

    @FindBy(xpath= "//input[@name='product_code']")
    public WebElement productCode;

    @FindBy(xpath= "//input[@name='delay']")
    public WebElement deliveryLeadTime;

    @FindBy(xpath= "//input[@name='min_qty']")
    public WebElement minimalQuantity;

    @FindBy(xpath= "//input[@name='price']")
    public WebElement price;


    @FindBy(xpath= "//input[@name='date_start']")
    public WebElement Validity_Start_Date;

    @FindBy(xpath= "//input[@name='date_end']")
    public WebElement vaidity_End_Date;

    @FindBy(xpath="//div[@class='modal-footer']/button[1]")
    public WebElement saveCloseButton;

}

