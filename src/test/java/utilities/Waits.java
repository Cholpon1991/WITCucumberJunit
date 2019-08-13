package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

    public static WebDriverWait wait = new WebDriverWait(Driver.getDriver(),15);

    public void VisibleElement(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }

}
