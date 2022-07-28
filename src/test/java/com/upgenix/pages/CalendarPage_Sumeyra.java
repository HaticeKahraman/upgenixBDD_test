package com.upgenix.pages;

import com.upgenix.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CalendarPage_Sumeyra {

    public CalendarPage_Sumeyra(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//a[@class='oe_menu_leaf'])[2]/span")
    public WebElement CalendarButton;

    @FindBy(xpath = "//button[@class='o_calendar_button_week btn btn-sm btn-default active']")
    public WebElement WeeklyDisplay;

    @FindBy(xpath = "//div[@class='btn-group btn-group-sm']/button[1]")
    public WebElement DayButton;
    //div[@class='btn-group btn-group-sm']/button[1]
    //button[@class='o_calendar_button_day btn btn-sm btn-default']
    //button[@class='o_calendar_button_day btn btn-sm btn-default active']
    @FindBy(xpath = "//div[@class='btn-group btn-group-sm']/button[2]")
    public WebElement WeekButton;

    @FindBy(xpath = " //div[@class='o_calendar_buttons']/div/button[3]")
            //div[@class='btn-group btn-group-sm']/button[3]
    ///html/body/div[1]/div[2]/div[1]/div[2]/div[1]/div/div/button[3]
    public WebElement MonthButton;

    @FindBy(xpath = "//ol[@class='breadcrumb']/li")
    public WebElement weekVerify;
    //li[. = 'Meetings (Week 30)']
    @FindBy(xpath = "//ol[@class='breadcrumb']/li")
    public WebElement dayVerify;
    //li[. = 'Meetings (July 23, 2022)']
    @FindBy(xpath = "//ol[@class='breadcrumb']/li")
    public WebElement monthVerify;
//li[. = 'Meetings (July 2022)']

    @FindBy(xpath = "//td[@class='fc-day-top fc-thu fc-future']/span")
    public WebElement dataDate;
    //td[@data-date='2022-07-28']

    @FindBy(xpath = "//div[@class='form-group']/input")
    public WebElement eventCreateInput;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-primary']")
    public WebElement createButton;

    @FindBy(xpath = "//div[contains(@class,'o_field_name')]")
    public WebElement VerifyEvent;

    @FindBy(xpath = "//label[@class='control-label']" )
    public WebElement summary;

    @FindBy(xpath = "(//td[@class='fc-event-container'])[1]")
    public WebElement danceEvent;

    @FindBy(xpath = "//span[text()='Edit']")
    public WebElement editButton;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-primary']")
    public WebElement saveButton;

    @FindBy(xpath = "//input[@placeholder='e.g. Business Lunch']")
    public WebElement editEventName;

    @FindBy(xpath = "(//input[@name='start_date'])[1]")
    public WebElement editDate;
  //span[@class='o_datepicker_button'])[3]

    @FindBy(xpath = "//div[@class='o_notification_title']")
    public WebElement errorMessage;

    @FindBy(xpath = "//label[.='Meeting Subject']")
    public WebElement errorMeetingSubject;


   // @FindBy(xpath = "//input[@id='o_field_input_260']")
   // public WebElement errorRedBorder;

    @FindBy(xpath = "(//td[@data-date='2022-07-24'])/span")
    public WebElement targetDragDrop;
//td[@data-date='2022-07-10']

    @FindBy(xpath = "//input[@id='o_field_input_129']")
    public WebElement checkbox;

    @FindBy(xpath = "((//td[@class='fc-event-container'])/a")
    public WebElement DragdanceEventDrop;

    @FindBy(xpath = "(//div[@class='fc-bg'])[5]/table/tbody/tr/td")
    public List<WebElement> weeklyDays;
}
