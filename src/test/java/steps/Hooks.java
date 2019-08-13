package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.*;
import utilities.Config;
import utilities.Driver;

public class Hooks {


    @Before
    public void login(){

        Driver.getDriver().get(Config.getProperty("url"));
        WebElement login = Driver.getDriver().findElement(By.id("login"));
        login.sendKeys(Config.getProperty("username"));
        WebElement password = Driver.getDriver().findElement(By.id("password"));
        password.sendKeys(Config.getProperty("password")+ Keys.ENTER);
        Driver.getDriver().findElement(By.linkText("Inventory")).click();
    }

    @After
    public void tearDown(Scenario scenario){

        System.out.println(scenario.getName());
        System.out.println(scenario.getStatus());

        if(scenario.isFailed()){
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
        }
        Driver.quitDriver();
    }
}
