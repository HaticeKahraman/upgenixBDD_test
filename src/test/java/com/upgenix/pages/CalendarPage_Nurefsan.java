package com.upgenix.pages;

import com.upgenix.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CalendarPage_Nurefsan {

    public CalendarPage_Nurefsan(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "/html/body/nav/div[2]/ul[1]/li[2]/a/span")
    public WebElement calendarBtn;

    @FindBy(xpath = "(//li[@class='active'])[2]")
    public WebElement firstWeeklyDisplay;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[1]/div/div/button")
    public List<WebElement> btnGroup;

}
