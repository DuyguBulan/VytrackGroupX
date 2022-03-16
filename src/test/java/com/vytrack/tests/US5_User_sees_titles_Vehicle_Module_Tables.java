package com.vytrack.tests;

import com.vytrack.pages.HomePage;
import com.vytrack.tests.base.TestBase;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import com.vytrack.utilities.VytrackUtils;
import com.vytrack.utilities.WebTableUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class US5_User_sees_titles_Vehicle_Module_Tables extends TestBase {


    @Test
    public void verify_columns_as_sales_manager(){

        //login
        VytrackUtils.loginAsSalesManager();

        //go to Fleet tab
        homePage = new HomePage();

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(homePage.fleetModule).perform();

        //String vehiclesModelModuleLocator = "//span[normalize-space()='Vehicles Model' and contains(@class,'title title-level-2')]";
        //WebElement vehiclesModelElement = Driver.getDriver().findElement(By.xpath(vehiclesModelModuleLocator));

        VytrackUtils.waitTillLoaderMaskDisappear();

        //go to Vehicle Models submodule
        homePage.vehicle_models_submodule.click();

        //vehiclesModelElement.click();

        BrowserUtils.sleep(2);

        List<String> actualTitlesFromVehicleModelsTable = WebTableUtils.getHeadersFromVehicleModelTable();
        List<String> expectedTitlesFromVehicleModelsTable = new ArrayList<>(Arrays.asList(
                "MODEL NAME",
                "MAKE",
                "CAN BE REQUESTED",
                "CVVI",
                "CO2 FEE (/MONTH)",
                "COST (DEPRECIATED)",
                "TOTAL COST (DEPRECIATED)",
                "CO2 EMISSIONS",
                "FUEL TYPE",
                "VENDORS"
        ));

        //verify
        Assert.assertEquals(actualTitlesFromVehicleModelsTable,expectedTitlesFromVehicleModelsTable);

    }

    @Test
    public void verify_columns_as_store_manager() {

        //login
        VytrackUtils.loginAsStoreManager();

        //go to Fleet tab
        homePage = new HomePage();

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(homePage.fleetModule).perform();

        //String vehiclesModelModuleLocator = "//span[normalize-space()='Vehicles Model' and contains(@class,'title title-level-2')]";
        //WebElement vehiclesModelElement = Driver.getDriver().findElement(By.xpath(vehiclesModelModuleLocator));

        VytrackUtils.waitTillLoaderMaskDisappear();

        //go to Vehicle Models submodule
        homePage.vehicle_models_submodule.click();

        //vehiclesModelElement.click();

        BrowserUtils.sleep(2);

        List<String> actualTitlesFromVehicleModelsTable = WebTableUtils.getHeadersFromVehicleModelTable();
        List<String> expectedTitlesFromVehicleModelsTable = new ArrayList<>(Arrays.asList(
                "MODEL NAME",
                "MAKE",
                "CAN BE REQUESTED",
                "CVVI",
                "CO2 FEE (/MONTH)",
                "COST (DEPRECIATED)",
                "TOTAL COST (DEPRECIATED)",
                "CO2 EMISSIONS",
                "FUEL TYPE",
                "VENDORS"
        ));

        //verify
        Assert.assertEquals(actualTitlesFromVehicleModelsTable,expectedTitlesFromVehicleModelsTable);

    }



/* DOES NOT PASS - BUG REPORT CREATED
    @Test
    public void verify_columns_as_truck_driver(){

        //login
        VytrackUtils.loginAsDriver();

        //go to Fleet tab
        homePage = new HomePage();

        BrowserUtils.sleep(2);

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(homePage.fleetModule).perform();

        //String vehiclesModelModuleLocator = "//span[normalize-space()='Vehicles Model' and contains(@class,'title title-level-2')]";
        //WebElement vehiclesModelElement = Driver.getDriver().findElement(By.xpath(vehiclesModelModuleLocator));

        //VytrackUtils.waitTillLoaderMaskDisappear();

        //BrowserUtils.sleep(2);

        //go to Vehicle Models submodule
        homePage.vehicle_models_submodule.click();
    }
 */


}
