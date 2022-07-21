package com.upgenix.pages;

import com.upgenix.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SalesPage_Muberra {

    public SalesPage_Muberra(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

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

    @FindBy(xpath = "/html/body/div[2]")
    public WebElement errorMessage;









}
