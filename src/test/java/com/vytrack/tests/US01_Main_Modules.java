package com.vytrack.tests;

import com.vytrack.tests.base.TestBase;
import com.vytrack.utilities.*;
import com.vytrack.tests.base.TestBase;
import com.vytrack.utilities.Driver;
import com.vytrack.utilities.VytrackUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class US01_Main_Modules extends TestBase {

    @Test
    public void TC1_verifying_modules_as_sales_and_store_managers() {

        // log in as a sales manager
        loginPage.gotoLoginPage();
        loginPage.login(ConfigurationReader.getProperty("sales_manager_username2"), ConfigurationReader.getProperty("sales_manager_password"));
        BrowserUtils.waitUntilVisibilityOfElement(homePage.activitiesModule, 10);

        // verifying all 8 module texts
        // Expected module name: Dashboards, Fleet, Customers, Sales, Activities, Marketing, Reports & Segments, System
        List<String> expectedModulesNames = new ArrayList<>(Arrays.asList(
                "Dashboards", "Fleet", "Customers", "Sales", "Activities", "Marketing", "Reports & Segments", "System"));

        // get actual modules names
        List<String> actualModulesNames = new ArrayList<>();

        for (WebElement eachModule : homePage.mainModulesForManagers) {
            actualModulesNames.add(eachModule.getText());
            System.out.println(eachModule.getText());
        }

        Assert.assertEquals(actualModulesNames, expectedModulesNames);

    }


    @Test
    public void TC2_verifying_modules_as_driver(){

        // log in as a driver
        loginPage.gotoLoginPage();
        loginPage.login(ConfigurationReader.getProperty("driver_username1"), ConfigurationReader.getProperty("driver_password"));
        BrowserUtils.waitUntilVisibilityOfElement(homePage.activitiesModule, 10);

        // verifying all 4 modules' names
        // Expected modules' names: Fleet, Customers, Activities, System
        List<String> expectedModulesNames = new ArrayList<>(Arrays.asList(
                "Fleet", "Customers", "Activities", "System"));

        // actual modules' names
        List <String> actualModulesNames = new ArrayList<>();

        for (WebElement eachModule : homePage.mainModulesForDrivers) {
            actualModulesNames.add(eachModule.getText());
        }

        Assert.assertEquals(actualModulesNames, expectedModulesNames);

    }


}
