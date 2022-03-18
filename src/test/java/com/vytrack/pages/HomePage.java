package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {
    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //#1. dashboardModule
    @FindBy(xpath = "//span[normalize-space()='Dashboards' and contains(@class, 'title title-level-1')]")
    public WebElement dashboardModule;

    //#2. fleetModule
    @FindBy(xpath = "//span[normalize-space()='Fleet' and contains(@class, 'title title-level-1')]")
    public WebElement fleetModule;


    //#3. customersModule
    @FindBy(xpath = "//span[normalize-space()='Customers' and contains(@class, 'title title-level-1')]")
    public WebElement customersModule;

    //#4. salesModule
@FindBy(xpath ="//span[normalize-space()='Sales' and contains(@class, 'title title-level-1')]" )
    public  WebElement salesModule;

    //#5. activitiesModule
@FindBy(xpath = "//span[normalize-space()='Activities' and contains(@class, 'title title-level-1')]")
    public  WebElement activitiesModule;

    //#6.  marketingModule
    @FindBy(xpath = "//span[normalize-space()='Marketing' and contains(@class, 'title title-level-1')]")
    public  WebElement marketingModule;

    //#7. reports_segmentsModule
@FindBy(xpath = "//span[normalize-space()='Reports & Segments' and contains(@class, 'title title-level-1')]")
    public  WebElement reports_segmentsModule;


    // #8. systemModule
    @FindBy(xpath = "//span[normalize-space()='System' and contains(@class, 'title title-level-1')]")
    public  WebElement systemModule;


    //#9. vehicle Odometer sub module
    @FindBy(xpath = "//span[.='Vehicle Odometer']")
    public WebElement vehicle_odometer_submodule;

    // #10. Vehicle submodule
    @FindBy(xpath = "//span[.='Vehicles']")
    public WebElement vehicle_submodule;

    //#11.Vehicle contracts
    @FindBy(xpath = "//span[.='Vehicle Contracts' and @class='title title-level-2']")
      public WebElement vehicle_contracts_submodule;

    //#12.Vehicles Models submodule
    @FindBy(xpath = "//span[normalize-space()='Vehicles Model' and contains(@class,'title title-level-2')]")
    public WebElement vehicle_models_submodule;

    //#13. calendarEventSubmodule
    @FindBy (xpath ="//span[.='Calendar Events']")
    public WebElement calendarEventSubmodule;

    //14. Learn How to use this space
    @FindBy (xpath = "//a[.='Learn how to use this space']")
    public WebElement pinbar;


    //#15 all main modules while login as a Sales or store managers
    @FindBy(xpath = "//span[@class='title title-level-1']")
    public List<WebElement> mainModulesForManagers;

    //#16 all main modules while login as a Driver
    @FindBy(xpath = "//span[@class='title title-level-1']")
    public List<WebElement> mainModulesForDrivers;





}
