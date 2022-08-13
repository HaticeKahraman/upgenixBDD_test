package com.upgenix.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Survey_Musa extends BasePage{


    @FindBy (css = "#login")
    public WebElement emailBtn ;


    @FindBy (id = "password")
    public WebElement passwordBtn ;

    @FindBy (className = "btn btn-primary")
    public WebElement loginBtn ;

    @FindBy(xpath = "(//li[@style='display: block;'])[15]")
    public WebElement surveysBtn;

    @FindBy (css = "button[type = 'button'][class = 'btn btn-primary btn-sm o-kanban-button-new']")
    public WebElement createBtn ;

    @FindBy (name = "title")
    public WebElement surveyTitle ;

    @FindBy (css = "button[class ='btn btn-primary btn-sm o_form_button_save']")
    public WebElement saveBtn ;

    @FindBy (css = "div[class='o_notification_title']")
    public WebElement errorMessage ;

    @FindBy (className = "o_thread_message_content")
    public WebElement surveyCreated;

    @FindBy (xpath = "//div[1]/div[32]/div[2]/h4/span")
    public WebElement verifyJobTitle;




}
