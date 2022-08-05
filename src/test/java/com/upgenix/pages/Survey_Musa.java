package com.upgenix.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Survey_Musa extends BasePage{


    @FindBy (name = "login")
    public WebElement emailBtn ;


    @FindBy (name = "password")
    public WebElement passwordBtn ;

    @FindBy (xpath = "//div/button[@type='submit']")
    public WebElement loginBtn ;

    @FindBy (xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[1]/div/button[1]")
    public WebElement createBtn ;

    @FindBy (xpath = "//div//h1/input[@name = 'title']")
    public WebElement surveyTitle ;

    @FindBy (xpath = "//button[@class='btn btn-primary btn-sm o_form_button_save']")
    public WebElement saveBtn ;

    @FindBy (xpath = "//div[@class = 'o_notification_title']")
    public WebElement errorMessage ;

    @FindBy (xpath = "//div/p[.='Survey created']")
    public WebElement surveyCreated;

    @FindBy(xpath = "(//li[@style='display: block;'])[15]")
    public WebElement surveysBtn;

    @FindBy (xpath = "//div//h4//span[.='Project Owner']")
    public WebElement projectOwner ;


}
