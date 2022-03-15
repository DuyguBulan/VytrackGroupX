package com.vytrack.tests;

import com.vytrack.tests.base.TestBase;
import com.vytrack.utilities.Driver;
import com.vytrack.utilities.VytrackUtils;
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
    public void TC68_verifying_modules_as_sales_and_store_manager(){

        // log in as a sales manager
        VytrackUtils.loginAsSalesManager();

        // verifying all 8 module texts

        List<WebElement> modules = Driver.getDriver().findElements(By.xpath("//span[@class='title title-level-1']"));

        // Expected module name: Dashboards, Fleet, Customers, Sales, Activities, Marketing, Reports & Segments, System
        List<String> expectedModulesNames = new ArrayList<>(Arrays.asList(
                "Dashboards", "Fleet", "Customers", "Sales", "Activities", "Marketing", "Reports & Segments", "System"));

        // actual modules name
        List <String> actualModulesNames = new ArrayList<>();

        for (WebElement eachModule : modules) {
            actualModulesNames.add( eachModule.getText());
        }

        Assert.assertEquals(actualModulesNames, expectedModulesNames);

    }


    @Test
    public void TC68_verifying_modules_as_driver(){

        // log in as a driver
        VytrackUtils.loginAsDriver();

        // verifying all 8 modules' names

        List<WebElement> modules = Driver.getDriver().findElements(By.xpath("//span[@class='title title-level-1']"));

        // Expected modules' names: Fleet, Customers, Activities, System
        List<String> expectedModulesNames = new ArrayList<>(Arrays.asList(
                "Fleet", "Customers", "Activities", "System"));

        // actual modules' names
        List <String> actualModulesNames = new ArrayList<>();

        for (WebElement eachModule : modules) {
            actualModulesNames.add( eachModule.getText());
        }

        Assert.assertEquals(actualModulesNames, expectedModulesNames);

    }


}
