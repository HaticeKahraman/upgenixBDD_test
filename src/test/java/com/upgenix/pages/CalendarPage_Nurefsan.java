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

    @FindBy(xpath = "(//li[@style='display: block;'])[2]")
    public WebElement calendarBtn;

    @FindBy(xpath = "(//li[@class='active'])[2]")
    public WebElement firstWeeklyDisplay;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[1]/div/div/button")
    public List<WebElement> btnGroup;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[1]/div/div/button[3]")
    public WebElement monthBtn;

    @FindBy(xpath = "//div[@class='fc-scroller fc-day-grid-container']/div")
    public WebElement dataDate;

    @FindBy(xpath = "//input[@class='o_input']")
    public WebElement eventCreateInput;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-primary']")
    public WebElement createBtn;

    @FindBy(xpath = "(//td[@class='fc-event-container'])[1]")
    public WebElement meetingEvent;

    @FindBy(xpath = "//span[text()='Edit']")
    public WebElement editBtn;

    @FindBy(xpath = "//input[@placeholder='e.g. Business Lunch']")
    public WebElement editEventName;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-primary']")
    public WebElement saveBtn;

    @FindBy(xpath = "//div[contains(@class,'o_field_name')]")
    public WebElement verifyEvent;

    @FindBy(xpath = "//div[@class='o_notification_title']")
    public WebElement errorMessage;

    @FindBy(xpath = "(//span[@class='o_datepicker_button'])[3]")
    public WebElement startDateBtn;

}
