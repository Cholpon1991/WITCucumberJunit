package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TransferSearchPage {

    public TransferSearchPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(linkText = "Transfers")
    public WebElement transferTab;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[1]/div/input")
    public WebElement searchBox;



}
