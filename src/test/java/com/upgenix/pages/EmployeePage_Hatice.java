package com.upgenix.pages;

import com.upgenix.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeePage_Hatice extends BasePage {
    public EmployeePage_Hatice(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@data-menu='157']")
    public WebElement employeeButton;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o-kanban-button-new btn-default']")
    public WebElement createButton;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_form_button_save']")
    public WebElement saveButton;

    @FindBy(xpath = "//div[@class='o_notification_manager']")
    public WebElement errorMessage;

    @FindBy(xpath = "//input[@id='o_field_input_404']")
    public WebElement nameBox;

    @FindBy(xpath = "//*[.='Employee created']")
    public WebElement createdMessage;

}
