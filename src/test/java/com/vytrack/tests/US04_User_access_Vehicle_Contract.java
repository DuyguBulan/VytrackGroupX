package com.vytrack.tests;

import com.vytrack.pages.VytrackLoginPage;
import com.vytrack.tests.base.TestBase;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US04_User_access_Vehicle_Contract extends TestBase {


    @Test
    public void sales_managers_access_the_vehicle_contract_page(){
        // Go to the login page
        loginPage.gotoLoginPage();

        //User login with sales manager user and password
        loginPage.login(ConfigurationReader.getProperty("sales_manager_username"), ConfigurationReader.getProperty("sales_manager_password"));

        BrowserUtils.waituntilTitleDisplay("Dashboard");


        //Hover to Fleet Module
        BrowserUtils.sleep(2);
        BrowserUtils.hover(homePage.fleetModule);

        //Hover to subModule Driver contract
        BrowserUtils.hover(homePage.vehicle_contracts_submodule);

        //Click Driver contract
        homePage.vehicle_contracts_submodule.click();
        BrowserUtils.sleep(2);
        //Compare expected and actual result
        String expectedTitle = "All - Vehicle Contract - Entities - System - Car - Entities - System";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(expectedTitle,actualTitle);
    }

    @Test
    public void Store_managers_access_the_vehicle_contract_page(){
        // Go to the login page
        loginPage.gotoLoginPage();

        //User login with sales manager user and password
        loginPage.login(ConfigurationReader.getProperty("store_manager_username"), ConfigurationReader.getProperty("store_manager_password"));

        BrowserUtils.waituntilTitleDisplay("Dashboard");


        //Hover to Fleet Module
        BrowserUtils.sleep(2);
        BrowserUtils.hover(homePage.fleetModule);

        //Hover to subModule Driver contract
        BrowserUtils.hover(homePage.vehicle_contracts_submodule);

        //Click Driver contract
        homePage.vehicle_contracts_submodule.click();
        BrowserUtils.sleep(2);
        //Compare expected and actual result
        String expectedTitle = "All - Vehicle Contract - Entities - System - Car - Entities - System";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(expectedTitle,actualTitle);
    }


}
