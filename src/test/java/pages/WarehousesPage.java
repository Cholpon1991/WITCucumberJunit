package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WarehousesPage {

    public WarehousesPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//tbody//input")
    public WebElement MyCompanyChicago_Checkbox;

    @FindBy (xpath = "//button[contains(text(),'Action')]")
    public WebElement ActionDropdown;

    @FindBy (xpath = "//a[contains(text(),'Delete')]")
    public WebElement Delete;

    @FindBy (xpath = "//span[contains(text(),'Ok')]")
    public WebElement ConfirmDeletion;

    @FindBy (xpath = "//span[contains(text(),'Ok')]")
    public WebElement Error_OK;

    @FindBy (xpath = "//h4[@class= 'modal-title']")
    public WebElement ErrorPopup;

}
