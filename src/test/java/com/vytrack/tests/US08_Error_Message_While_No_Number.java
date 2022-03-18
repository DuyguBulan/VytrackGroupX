package com.vytrack.tests;

import com.vytrack.tests.base.TestBase;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.tests.base.TestBase;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US08_Error_Message_While_No_Number extends TestBase {

    @Test
    public void TC1_users_see_1_by_default(){

        // Users go to home page
        loginPage.gotoLoginPage();
        loginPage.login(ConfigurationReader.getProperty("driver_username"), ConfigurationReader.getProperty("driver_password"));

        // Users are able to see and click Create Calendar Event button after clicking Activities module
        BrowserUtils.waitUntilVisibilityOfElement(homePage.activitiesModule, 10);
        BrowserUtils.hover(homePage.activitiesModule);

        BrowserUtils.waitUntilVisibilityOfElement(homePage.calendarEventSubmodule, 10);
        BrowserUtils.hover(homePage.calendarEventSubmodule);
        homePage.calendarEventSubmodule.click();

        BrowserUtils.hover(calendarEventsPage.createCalendarEventButton);
        calendarEventsPage.createCalendarEventButton.click();

        // Users should be able to see number "1" by default in Calendar event repeat field.
        BrowserUtils.hover(createCalendarEventPage.repeatCheckbox);
        createCalendarEventPage.repeatCheckbox.click();

        createCalendarEventPage.repeatEveryInput.isDisplayed();
        // Expected number: "1"
        Assert.assertEquals(createCalendarEventPage.repeatEveryInput.getAttribute("value"), "1");

    }

    @Test
    public void TC2_users_see_an_error_message_while_field_is_cleared(){

        // Users go to home page
        loginPage.gotoLoginPage();
        loginPage.login(ConfigurationReader.getProperty("driver_username"), ConfigurationReader.getProperty("driver_password"));

        // Users able to click Activities module
        BrowserUtils.waitUntilVisibilityOfElement(homePage.activitiesModule, 10);
        BrowserUtils.hover(homePage.activitiesModule);

        // Users are able to click Calendar Event submodule
        BrowserUtils.waitUntilVisibilityOfElement(homePage.calendarEventSubmodule, 10);
        BrowserUtils.hover(homePage.calendarEventSubmodule);
        homePage.calendarEventSubmodule.click();

        // Users able to click Create calendar Event Button
        BrowserUtils.hover(calendarEventsPage.createCalendarEventButton);
        calendarEventsPage.createCalendarEventButton.click();

        // Users are able to click Repeat checkbox
        BrowserUtils.hover(createCalendarEventPage.repeatCheckbox);
        createCalendarEventPage.repeatCheckbox.click();

        //Users should see an error message after clearing repeat field
        createCalendarEventPage.repeatEveryInput.clear();

        //Expected error message : "This value should not be blank."
        Assert.assertTrue(createCalendarEventPage.errorMessage.isDisplayed());
        Assert.assertTrue(createCalendarEventPage.errorMessage.getText().equals("This value should not be blank."));




    }



}
