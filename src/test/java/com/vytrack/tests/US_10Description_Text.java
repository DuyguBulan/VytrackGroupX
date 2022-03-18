package com.vytrack.tests;


import com.vytrack.tests.base.TestBase;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import com.vytrack.utilities.VytrackUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;


public class US_10Description_Text extends TestBase  {
    @Test
    public  void write_Description_SalesManager() {
        //Users are on the homepage
        loginPage.gotoLoginPage();
        loginPage.login(ConfigurationReader.getProperty("sales_manager_username1"),ConfigurationReader.getProperty("sales_manager_password"));
    // BrowserUtils.sleep(2);
      //go to activities Module
        BrowserUtils.waitUntilVisibilityOfElement(homePage.activitiesModule,5);
       BrowserUtils.hover(homePage.activitiesModule);
       homePage.activitiesModule.click();
       // BrowserUtils.sleep(5);
        //Click the “Create Calendar Event” button
        BrowserUtils.hover(homePage.calendarEventSubmodule);
        homePage.calendarEventSubmodule.click();
        VytrackUtils.waitTillLoaderMaskDisappear();
        //click on create calendar button
        BrowserUtils.scrollToElement(calendarEventsPage.createCalendarEventButton);
        calendarEventsPage.createCalendarEventButton.click();
        //check the repeat checkBox
        BrowserUtils.hover(createCalendarEventPage.repeatCheckbox);
        createCalendarEventPage.repeatCheckbox.click();
        //Switched to another frame
        Driver.getDriver().switchTo().frame(createCalendarEventPage.iframeOfDescription);
        createCalendarEventPage.descriptionBody.sendKeys("Meeting!");
        //Write a message in the Description field
        BrowserUtils.scrollToElement(createCalendarEventPage.descriptionBody);
        String expectedDescriptionBody = "Meeting!";
        //Verify the message is written in the input box
        Assert.assertEquals(createCalendarEventPage.descriptionBody.getText(), expectedDescriptionBody);
    }

    @Test
    public  void write_Description_as_StoreManager() {
        loginPage.gotoLoginPage();
        loginPage.login(ConfigurationReader.getProperty("store_manager_username1"),ConfigurationReader.getProperty("store_manager_password"));
        // BrowserUtils.sleep(2);
        BrowserUtils.waitUntilVisibilityOfElement(homePage.activitiesModule,5);
        //go to activities Module
        BrowserUtils.hover(homePage.activitiesModule);
        homePage.activitiesModule.click();
        // BrowserUtils.sleep(5);
        //Click the “Create Calendar Event” button
        BrowserUtils.hover(homePage.calendarEventSubmodule);
        homePage.calendarEventSubmodule.click();
        VytrackUtils.waitTillLoaderMaskDisappear();
        //click on create calendar button
        BrowserUtils.scrollToElement(calendarEventsPage.createCalendarEventButton);
        calendarEventsPage.createCalendarEventButton.click();
        //check the repeat checkBox
        BrowserUtils.hover(createCalendarEventPage.repeatCheckbox);
        createCalendarEventPage.repeatCheckbox.click();
        //Switched to another frame
        Driver.getDriver().switchTo().frame(createCalendarEventPage.iframeOfDescription);
        createCalendarEventPage.descriptionBody.sendKeys("Meeting!");
        //Write a message in the Description field
        BrowserUtils.scrollToElement(createCalendarEventPage.descriptionBody);
        String expectedDescriptionBody = "Meeting!";
        //Verify the message is written in the input box
        Assert.assertEquals(createCalendarEventPage.descriptionBody.getText(), expectedDescriptionBody);

    }
    @Test
    public  void write_Description_as_Driver() {
        loginPage.gotoLoginPage();
        loginPage.login(ConfigurationReader.getProperty("driver_username1"),ConfigurationReader.getProperty("driver_password"));
        // BrowserUtils.sleep(2);
        BrowserUtils.waitUntilVisibilityOfElement(homePage.activitiesModule,5);
        //go to activities Module
        BrowserUtils.hover(homePage.activitiesModule);
        homePage.activitiesModule.click();
        // BrowserUtils.sleep(5);
        //Click the “Create Calendar Event” button
        BrowserUtils.hover(homePage.calendarEventSubmodule);
        homePage.calendarEventSubmodule.click();
        VytrackUtils.waitTillLoaderMaskDisappear();
        //click on create calendar button
        BrowserUtils.scrollToElement(calendarEventsPage.createCalendarEventButton);
        calendarEventsPage.createCalendarEventButton.click();
        //check the repeat checkBox
        BrowserUtils.hover(createCalendarEventPage.repeatCheckbox);
        createCalendarEventPage.repeatCheckbox.click();
        //Switched to another frame
        Driver.getDriver().switchTo().frame(createCalendarEventPage.iframeOfDescription);
        createCalendarEventPage.descriptionBody.sendKeys("Meeting!");
        //Write a message in the Description field
        BrowserUtils.scrollToElement(createCalendarEventPage.descriptionBody);
        String expectedDescriptionBody = "Meeting!";
        //Verify the message is written in the input box
        Assert.assertEquals(createCalendarEventPage.descriptionBody.getText(), expectedDescriptionBody);

    }
}




