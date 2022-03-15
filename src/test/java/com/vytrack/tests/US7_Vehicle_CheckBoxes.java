package com.vytrack.tests;

import com.vytrack.tests.base.TestBase;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US7_Vehicle_CheckBoxes extends TestBase {
    @Test(priority = 1)
    public void all_checkBoxes_are_unselected() {
        //1- Open a chrome browser
        //2- Go to: hhttps://qa2.vytrack.com/user/login
        loginPage.gotoLoginPage();
        //3-Login with "sales_manager_username" credentials
        loginPage.login(ConfigurationReader.getProperty("sales_manager_username1"),
                ConfigurationReader.getProperty("sales_manager_password"));
        //4-Wait until "Dashboard" title will displayed
        BrowserUtils.waituntilTitleDisplay("Dashboard");
        //5-Hover the Fleet module
        BrowserUtils.hover( homePage.fleetModule);
        BrowserUtils.sleep(2);
        //6-Hover the Vehicle submodule under Fleet module
        BrowserUtils.hover(vehiclesPagePOM.vehicle_submodule);

        //7- Click the Vehicle submodule
        vehiclesPagePOM.vehicle_submodule.click();

        //8-Verify  if all checkboxes are unselected
        Assert.assertFalse(vehiclesPagePOM.all_check_boxes.isSelected());


    }

    @Test(priority = 2)
    public void all_checkBoxes_selected() {
        //1- Open a chrome browser
        //2- Go to: hhttps://qa2.vytrack.com/user/login
        loginPage.gotoLoginPage();
        //3-Login with "sales_manager_username" credentials
        loginPage.login(ConfigurationReader.getProperty("sales_manager_username1"),
                ConfigurationReader.getProperty("sales_manager_password"));
        //4-Wait until "Dashboard" title will displayed
        BrowserUtils.waituntilTitleDisplay("Dashboard");
        //5-Hover the Fleet module
        BrowserUtils.hover( homePage.fleetModule);
        BrowserUtils.sleep(2);
        //6-Hover the Vehicle submodule under Fleet module
        BrowserUtils.hover(vehiclesPagePOM.vehicle_submodule);
        //7- Click the Vehicle submodule
        vehiclesPagePOM.vehicle_submodule.click();

        //8-Click the first checkbox
        vehiclesPagePOM.first_check_box.click();
        //9-Verify if the all checkboxes are checked
        Assert.assertTrue(vehiclesPagePOM.all_check_boxes.isSelected());


    }

    @Test(priority = 3)
    public void select_one_checkBox() {
        //1- Open a chrome browser
        //2- Go to: hhttps://qa2.vytrack.com/user/login
        loginPage.gotoLoginPage();
        //3-Login with "sales_manager_username" credentials
        loginPage.login(ConfigurationReader.getProperty("sales_manager_username1"),
                ConfigurationReader.getProperty("sales_manager_password"));
        //4-Wait until "Dashboard" title will displayed
        BrowserUtils.waituntilTitleDisplay("Dashboard");
        //5-Hover the Fleet module
        BrowserUtils.hover(homePage.fleetModule);
        BrowserUtils.sleep(2);
        //6-Hover the Vehicle submodule under Fleet module
        BrowserUtils.hover( vehiclesPagePOM.vehicle_submodule);
        BrowserUtils.sleep(2);
        //7- Click the Vehicle submodule
        vehiclesPagePOM.vehicle_submodule.click();

        //8-Click one of the  checkbox
        vehiclesPagePOM.one_of_check_boxes.click();
        //9-Verify if the checkbox is checked
        Assert.assertTrue(vehiclesPagePOM.one_of_check_boxes.isSelected());


    }

    @Test(priority = 4)
    public void all_checkBoxes_are_unselected_1() {
        //1- Open a chrome browser
        //2- Go to: hhttps://qa2.vytrack.com/user/login
        loginPage.gotoLoginPage();
        //3-Login with "store_manager_username" credentials
        loginPage.login(ConfigurationReader.getProperty("store_manager_username1"),
                ConfigurationReader.getProperty("store_manager_password"));
        //4-Wait until "Dashboard" title will displayed
        BrowserUtils.waituntilTitleDisplay("Dashboard");
        //5-Hover the Fleet module
        BrowserUtils.hover(homePage.fleetModule);
        BrowserUtils.sleep(2);
        //6-Hover the Vehicle submodule under Fleet module
        BrowserUtils.hover( vehiclesPagePOM.vehicle_submodule);

        //7- Click the Vehicle submodule
        vehiclesPagePOM.vehicle_submodule.click();

        //8-Verify  if all checkboxes are unselected
        Assert.assertFalse(vehiclesPagePOM.all_check_boxes.isSelected());


    }

    @Test(priority = 5)
    public void all_checkBoxes_selected_5() {
        //1- Open a chrome browser
        //2- Go to: hhttps://qa2.vytrack.com/user/login
        loginPage.gotoLoginPage();
        //3-Login with "store_manager_username" credentials
        loginPage.login(ConfigurationReader.getProperty("store_manager_username1"),
                ConfigurationReader.getProperty("store_manager_password"));
        //4-Wait until "Dashboard" title will displayed
        BrowserUtils.waituntilTitleDisplay("Dashboard");
        //5-Hover the Fleet module
        BrowserUtils.hover( homePage.fleetModule);
        BrowserUtils.sleep(2);
        //6-Hover the Vehicle submodule under Fleet module
        BrowserUtils.hover(vehiclesPagePOM.vehicle_submodule);
        //7- Click the Vehicle submodule
        vehiclesPagePOM.vehicle_submodule.click();

        //8-Click the first checkbox
       vehiclesPagePOM.first_check_box.click();
        //9-Verify if the all checkboxes are checked
        Assert.assertTrue(vehiclesPagePOM.all_check_boxes.isSelected());


    }

    @Test(priority = 6)
    public void select_one_checkBox_1() {
        //1- Open a chrome browser
        //2- Go to: hhttps://qa2.vytrack.com/user/login
        loginPage.gotoLoginPage();
        //3-Login with "store_manager_username" credentials
        loginPage.login(ConfigurationReader.getProperty("store_manager_username1"),
                ConfigurationReader.getProperty("store_manager_password"));
        //4-Wait until "Dashboard" title will displayed
        BrowserUtils.waituntilTitleDisplay("Dashboard");
        //5-Hover the Fleet module
        BrowserUtils.hover(homePage.fleetModule);
        BrowserUtils.sleep(2);
        //6-Hover the Vehicle submodule under Fleet module
        BrowserUtils.hover(vehiclesPagePOM.vehicle_submodule);
        BrowserUtils.sleep(2);
        //7- Click the Vehicle submodule
        vehiclesPagePOM.vehicle_submodule.click();
        //8-Click one of the  checkbox
        vehiclesPagePOM.one_of_check_boxes.click();
        //9-Verify if the checkbox is checked
        Assert.assertTrue(vehiclesPagePOM.one_of_check_boxes.isSelected());

    }

}
