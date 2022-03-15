package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarEventsPage {
    CalendarEventsPage(){
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


    //#4.selectAll
    @FindBy (xpath =" //a[@class='save_a']" )
    public  WebElement selectAll;

    //#5. saveAndCloseButton
    @FindBy(xpath = "//button[normalize-space()='Save and Close']")
    public WebElement saveAndCloseButton;

    //#6 saveAndCloseDropdown
    @FindBy(xpath = "//a[@class='btn-success btn dropdown-toggle']")
    public WebElement saveAndCloseDropdown;

    //#7. repeatCheckbox
    @FindBy(xpath = "//input[@data-name='recurrence-repeat']")
    public WebElement repeatCheckbox;


}
