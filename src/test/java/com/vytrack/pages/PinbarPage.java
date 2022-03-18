package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PinbarPage {

    public PinbarPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//h3[.='How To Use Pinbar']")
    public WebElement pinbarHeader;

    @FindBy (xpath = "//p[contains(text(),'Use pin icon')]")
    public WebElement pinbarText;

    @FindBy (xpath = "//img[@src='/bundles/oronavigation/images/pinbar-location.jpg']")
    public WebElement image_Pinbar;
}
