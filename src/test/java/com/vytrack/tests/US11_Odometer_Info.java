package com.vytrack.tests;

import com.vytrack.tests.base.TestBase;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US11_Odometer_Info extends TestBase {
    @Test(priority = 1)
    public void error_message() {
        //1- Open a chrome browser
        //2- Go to: hhttps://qa2.vytrack.com/user/login
        loginPage.gotoLoginPage();
        //3-Login with "sales_manager_username" credentials
        loginPage.login(ConfigurationReader.getProperty("sales_manager_username"),
                ConfigurationReader.getProperty("sales_manager_password"));
        //4-Wait until "Dashboard" title will displayed
        BrowserUtils.waituntilTitleDisplay("Dashboard");
        //5-Hover the Fleet module
        BrowserUtils.hover( homePage.fleetModule);
        BrowserUtils.sleep(2);
        //6-Hover the VehicleOdometer submodule under Fleet module
        BrowserUtils.hover( vehicleOdometerPOM.vehicle_odometer_submodule);
        BrowserUtils.sleep(2);
        //7- Click the VehicleOdometer submodule
        vehicleOdometerPOM.vehicle_odometer_submodule.click();
        BrowserUtils.sleep(2);
        //Verify if  Store and Sales managers should see an error message
        // “You do not have permission to perform this action.”
        Assert.assertTrue(vehicleOdometerPOM.error_message.isDisplayed());

        String expectedResult = "You do not have permission to perform this action.";
        String actualResult = vehicleOdometerPOM.error_message.getText();

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test(priority = 2)
    public void default_page() {
        //1- Open a chrome browser
        //2- Go to: hhttps://qa2.vytrack.com/user/login
        loginPage.gotoLoginPage();
        //3-Login with "driver_username" credentials
        loginPage
                .login(ConfigurationReader.getProperty("driver_username"),
                        ConfigurationReader.getProperty("driver_password"));

        //4-Wait until "Dashboard" title will displayed
        BrowserUtils.waituntilTitleDisplay("Dashboard");
        //5-Hover the Fleet module
        BrowserUtils.hover( homePage.fleetModule);
        BrowserUtils.sleep(2);
        //6-Hover the VehicleOdometer submodule under Fleet module
        BrowserUtils.hover( vehicleOdometerPOM.vehicle_odometer_submodule);
        //7- Click the VehicleOdometer submodule
        vehicleOdometerPOM.vehicle_odometer_submodule.click();
        //8-Verify the default page number is 1

        Assert.assertTrue(vehicleOdometerPOM.default_page_1.isDisplayed());

        Assert.assertTrue(vehicleOdometerPOM.default_page_1.getAttribute("value").equals("1"));

    }

    @Test(priority = 3)
    public void view_per_page_25() {
        //1- Open a chrome browser
        //2- Go to: hhttps://qa2.vytrack.com/user/login
        loginPage.gotoLoginPage();
        //3-Login with "driver_username" credentials
        loginPage
                .login(ConfigurationReader.getProperty("driver_username"),
                        ConfigurationReader.getProperty("driver_password"));
        //4-Wait until "Dashboard" title will displayed
        BrowserUtils.waituntilTitleDisplay("Dashboard");
        //5-Hover the Fleet module
        BrowserUtils.hover( homePage.fleetModule);
        BrowserUtils.sleep(2);
        //6-Hover the VehicleOdometer submodule under Fleet module
        BrowserUtils.hover( vehicleOdometerPOM.vehicle_odometer_submodule);
        BrowserUtils.sleep(2);
        //7- Click the VehicleOdometer submodule
        vehicleOdometerPOM.vehicle_odometer_submodule.click();
        //8-Verify the default page number is 25
        Assert.assertTrue(vehicleOdometerPOM.page_25_by_default.isDisplayed());

        String expectedResult = "25";
        String actualResult = vehicleOdometerPOM.page_25_by_default.getText();

        Assert.assertEquals(expectedResult,actualResult);



    }



}
