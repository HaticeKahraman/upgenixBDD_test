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

    @FindBy(xpath = "//div[@class='btn-group btn-group-sm']/button[2]")
    public WebElement WeekButton;

    @FindBy(xpath = " //div[@class='o_calendar_buttons']/div/button[3]")
    public WebElement MonthButton;

    @FindBy(xpath = "//ol[@class='breadcrumb']/li")
    public WebElement weekVerify;

    @FindBy(xpath = "//ol[@class='breadcrumb']/li")
    public WebElement dayVerify;

    @FindBy(xpath = "//ol[@class='breadcrumb']/li")
    public WebElement monthVerify;


    @FindBy(xpath = "//td[@data-date='2022-07-28']")
    public WebElement dataDate;

    @FindBy(xpath = "//div[@class='form-group']/input")
    public WebElement eventCreateInput;

    @FindBy(xpath = "//div[contains(@id,'modal')]/div/div/div[3]/button[1]")
    public WebElement createButton;

    @FindBy(xpath = "(//div[@class='o_field_name o_field_type_char'])[2]")
    public WebElement VerifyEvent;

    @FindBy(xpath = "//label[@class='control-label']" )
    public WebElement summary;

    @FindBy(xpath = "(//td[@class='fc-event-container'])[1]")
    public WebElement danceEvent;

    @FindBy(xpath = "//span[text()='Edit']")
    public WebElement editButton;

    @FindBy(xpath = "(//div[@class='modal-footer'])/button[@type='button']")
    public WebElement saveButtn;

    @FindBy(xpath = "//input[@placeholder='e.g. Business Lunch']")
    public WebElement editEventName;

    @FindBy(xpath = "(//input[@name='start_date'])[1]")
    public WebElement editDate;


    @FindBy(xpath = "//div[@class='o_notification_title']")
    public WebElement errorMessage;

    @FindBy(xpath = "//label[.='Meeting Subject']")
    public WebElement errorMeetingSubject;


    @FindBy(xpath = "(//div[@class='fc-bg'])[5]/table/tbody/tr/td")
    public List<WebElement> weeklyDays;




}
