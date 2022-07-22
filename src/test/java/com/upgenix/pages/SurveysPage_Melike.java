package com.upgenix.pages;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SurveysPage_Melike extends BasePage {

    @FindBy (linkText = "Surveys")
    public WebElement surveysLink;


    @FindBy (xpath = "//button[@accesskey='c']")
    public WebElement createButton;

    @FindBy (xpath = "(//ol[@class='breadcrumb']/li)[2]")
    public WebElement Surveys_NewHeader;

}
