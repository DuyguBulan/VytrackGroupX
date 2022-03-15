package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.By;
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

    //#7.selectAll
    @FindBy (xpath =" //a[@class='save_a']" )
    public  WebElement selectAll;

    //#8. saveAndCloseButton
    @FindBy(xpath = "//button[normalize-space()='Save and Close']")
    public WebElement saveAndCloseButton;

    //#9 saveAndCloseDropdown
    @FindBy(xpath = "//a[@class='btn-success btn dropdown-toggle']")
    public WebElement saveAndCloseDropdown;

    //10. repeat with contains xpath locator
    @FindBy(xpath = "(//input[contains(@class,'recurrence-subview-control__number')])[1]")
    public WebElement repeatEveryInputContainsXpath;






}
