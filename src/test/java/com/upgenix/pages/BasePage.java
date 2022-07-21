package com.upgenix.pages;

import com.upgenix.utilities.ConfigurationReader;
import com.upgenix.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public static void loginAsSalesManager() {
        Driver.getDriver().get(ConfigurationReader.getProperty("upgenix.url"));
        Driver.getDriver().findElement(By.id("login")).sendKeys(ConfigurationReader.getProperty("username.salesmanager"));
        Driver.getDriver().findElement(By.id("password")).sendKeys(ConfigurationReader.getProperty("password.salesmanager"));
        Driver.getDriver().findElement(By.xpath("//button[@class='btn btn-primary']")).click();
    }

    public static void loginAsPosManager() {
        Driver.getDriver().get(ConfigurationReader.getProperty("upgenix.url"));
        Driver.getDriver().findElement(By.id("login")).sendKeys(ConfigurationReader.getProperty("username.posmanager"));
        Driver.getDriver().findElement(By.id("password")).sendKeys(ConfigurationReader.getProperty("password.posmanager"));
        Driver.getDriver().findElement(By.xpath("//button[@class='btn btn-primary']")).click();
    }
}
