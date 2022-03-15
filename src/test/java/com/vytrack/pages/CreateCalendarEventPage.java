package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCalendarEventPage {

    public CreateCalendarEventPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //iframe of Description
    @FindBy(xpath ="//iframe[1]" )
    public WebElement iframeOfDescription;


    //#1. descriptionBody
    @FindBy(xpath ="//body[@id='tinymce']")
    public WebElement descriptionBody;

    //#2. repeatCheckbox
    @FindBy (xpath = "//input[@data-name='recurrence-repeat']")
     public WebElement repeatCheckbox;

    //#3. allDayCheckbox
    @FindBy (xpath ="//input[@data-name='field__all-day']")
    public WebElement allDayCheckbox;


    //#4. cancelButton
    @FindBy (xpath ="//a[@data-action='cancel']")
    public WebElement cancelButton;

    //#5.repeatEveryInput
    @FindBy(xpath = "(//input[@class='recurrence-subview-control__number'])[1]")
    public WebElement repeatEveryInput;

    //#6. error message
    @FindBy(xpath = "//span/span/span[.='This value should not be blank.']")
    public WebElement errorMessage;







}
