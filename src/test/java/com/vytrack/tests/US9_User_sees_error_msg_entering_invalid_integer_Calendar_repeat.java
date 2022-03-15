package com.vytrack.tests;

import com.vytrack.pages.CalendarEventsPage;
import com.vytrack.pages.CreateCalendarEventPage;
import com.vytrack.pages.HomePage;
import com.vytrack.tests.base.TestBase;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import com.vytrack.utilities.VytrackUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US9_User_sees_error_msg_entering_invalid_integer_Calendar_repeat extends TestBase {


    @Test
    public void less_than_zero_integer_test_as_store_manager(){
        //login
        VytrackUtils.loginAsStoreManager();

        //hover over Activities module
        homePage = new HomePage();
        BrowserUtils.hover(homePage.activitiesModule);

        VytrackUtils.waitTillLoaderMaskDisappear();
        BrowserUtils.sleep(2);

        //click on Calendar Events module
        calendarEventsPage = new CalendarEventsPage();
        calendarEventsPage.allCalendarEvents.click();

        VytrackUtils.waitTillLoaderMaskDisappear();

        //create Calendar Event
        calendarEventsPage.createCalendarEventButton.click();

        //click on Repeat checkbox
        BrowserUtils.sleep(2);

        createCalendarEventPage = new CreateCalendarEventPage();
        createCalendarEventPage.repeatCheckbox.click();

        //clear and enter invalid -1 number into Repeat Every day input box
        createCalendarEventPage.repeatEveryInputContainsXpath.clear();
        createCalendarEventPage.repeatEveryInputContainsXpath.sendKeys("-1");

        //assert warning message "The value have not to be less than 1."
        WebElement tempWarningText = Driver.getDriver().findElement(By.xpath("//span[contains(@id,'temp-validation-name-')]"));
        Assert.assertTrue(tempWarningText.getText().equals("The value have not to be less than 1."));

        BrowserUtils.sleep(2);

        //clear and enter invalid 100 number into Repear Every day input box
        createCalendarEventPage.repeatEveryInputContainsXpath.clear();
        createCalendarEventPage.repeatEveryInputContainsXpath.sendKeys("100");

        //assert warning message "The value have not to be more than 99."
        Assert.assertTrue(tempWarningText.getText().equals("The value have not to be more than 99."));

    }

    @Test
    public void less_than_zero_integer_test_as_sales_manager(){
        //login
        VytrackUtils.loginAsSalesManager();

        //hover over Activities module
        homePage = new HomePage();
        BrowserUtils.hover(homePage.activitiesModule);

        VytrackUtils.waitTillLoaderMaskDisappear();
        BrowserUtils.sleep(2);

        //click on Calendar Events module
        calendarEventsPage = new CalendarEventsPage();
        calendarEventsPage.allCalendarEvents.click();

        VytrackUtils.waitTillLoaderMaskDisappear();

        //create Calendar Event
        calendarEventsPage.createCalendarEventButton.click();

        //click on Repeat checkbox
        BrowserUtils.sleep(2);

        createCalendarEventPage = new CreateCalendarEventPage();
        createCalendarEventPage.repeatCheckbox.click();

        //clear and enter invalid -1 number into Repeat Every day input box
        createCalendarEventPage.repeatEveryInputContainsXpath.clear();
        createCalendarEventPage.repeatEveryInputContainsXpath.sendKeys("-1");

        //assert warning message "The value have not to be less than 1."
        WebElement tempWarningText = Driver.getDriver().findElement(By.xpath("//span[contains(@id,'temp-validation-name-')]"));
        Assert.assertTrue(tempWarningText.getText().equals("The value have not to be less than 1."));

        BrowserUtils.sleep(2);

        //clear and enter invalid 100 number into Repear Every day input box
        createCalendarEventPage.repeatEveryInputContainsXpath.clear();
        createCalendarEventPage.repeatEveryInputContainsXpath.sendKeys("100");

        //assert warning message "The value have not to be more than 99."
        Assert.assertTrue(tempWarningText.getText().equals("The value have not to be more than 99."));

    }

    @Test
    public void less_than_zero_integer_test_as_truck_driver(){
        //login
        VytrackUtils.loginAsDriver();

        VytrackUtils.waitTillLoaderMaskDisappear();

        //hover over Activities module
        homePage = new HomePage();
        BrowserUtils.hover(homePage.activitiesModule);

        BrowserUtils.sleep(3);

        //click on Calendar Events module
        calendarEventsPage = new CalendarEventsPage();
        calendarEventsPage.allCalendarEvents.click();

        VytrackUtils.waitTillLoaderMaskDisappear();

        //create Calendar Event
        calendarEventsPage.createCalendarEventButton.click();

        //click on Repeat checkbox
        BrowserUtils.sleep(2);

        createCalendarEventPage = new CreateCalendarEventPage();
        createCalendarEventPage.repeatCheckbox.click();

        //clear and enter invalid -1 number into Repeat Every day input box
        createCalendarEventPage.repeatEveryInputContainsXpath.clear();
        createCalendarEventPage.repeatEveryInputContainsXpath.sendKeys("-1");

        //assert warning message "The value have not to be less than 1."
        WebElement tempWarningText = Driver.getDriver().findElement(By.xpath("//span[contains(@id,'temp-validation-name-')]"));
        Assert.assertTrue(tempWarningText.getText().equals("The value have not to be less than 1."));

        BrowserUtils.sleep(2);

        //clear and enter invalid 100 number into Repear Every day input box
        createCalendarEventPage.repeatEveryInputContainsXpath.clear();
        createCalendarEventPage.repeatEveryInputContainsXpath.sendKeys("100");

        //assert warning message "The value have not to be more than 99."
        Assert.assertTrue(tempWarningText.getText().equals("The value have not to be more than 99."));

    }
}
