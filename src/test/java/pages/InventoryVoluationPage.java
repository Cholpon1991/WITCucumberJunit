package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class InventoryVoluationPage {
    public InventoryVoluationPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath="//a[@data-action-id='637']")
    public WebElement inventoryValuation2;

    @FindBy(xpath="//button[@name='open_table']/span")
    public WebElement retriveButton;

    @FindBy(className = "o_searchview_input")
    public WebElement searchBox;

}
