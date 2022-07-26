package com.upgenix.pages;

import com.upgenix.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SalesPage_Sule extends BasePage {


    @FindBy(xpath = "(//li[@style='display: block;'])[6]")
    public WebElement salesButton;

    @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div[6]/ul[1]/li[3]")
    public WebElement customerButton;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o-kanban-button-new btn-default']")
    public WebElement createButton;

    @FindBy(name = "name")
    public WebElement nameInputBox;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_form_button_save']")
    public WebElement saveButtonCustomer;

    @FindBy(className= "o_notification_manager")
    public WebElement errorMessage;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[1]/div/input")
    public WebElement searchBox;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/div[1]")
    public WebElement CustomerNameVisibleOnCustomerPage;






}
