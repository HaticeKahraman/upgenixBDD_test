package com.upgenix.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Survey_Musa extends BasePage{


    @FindBy (name = "//div//input[@name='login']")
    public WebElement emailBtn ;


    @FindBy (name = "//div//input[@name='password']")
    public WebElement passwordBtn ;

    @FindBy (name = "//div/button[@type='submit']")
    public WebElement loginBtn ;

    @FindBy (className = "//div//button[@class = 'btn btn-primary btn-sm o-kanban-button-new']")
    public WebElement createBtn ;

    @FindBy (id = "//div//h1/input[@id ='o_field_input_155']")
    public WebElement surveyTitle ;

    @FindBy (className = "//div//button[@class = 'btn btn-primary btn-sm o_form_button_save']")
    public WebElement saveBtn ;

    @FindBy (className = "//div[@class = 'o_notification_title']")
    public WebElement fillTheBtn ;

    @FindBy (className = "//div/p[. = 'Survey created']")
    public WebElement surveyCreated;

    @FindBy (linkText = "a[href='/web#menu_id=475&action=']")
    public WebElement surveyBtn;

    @FindBy (className = "//div//h4//span[.='Project Owner']")
    public WebElement verifyBtn ;


}
