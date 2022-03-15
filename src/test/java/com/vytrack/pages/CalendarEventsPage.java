package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarEventsPage {
    public CalendarEventsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //#1 allCalendarEvents
    @FindBy (xpath = "//span[.='Calendar Events'] ")
    public WebElement allCalendarEvents;

    //2. options
    @FindBy (xpath ="//div[@class='btn btn-link dropdown-toggle']" )
    public  WebElement options;

//#3. createCalendarEventButton
    @FindBy (xpath = "//a[@title='Create Calendar event']")
    public WebElement createCalendarEventButton;




}
