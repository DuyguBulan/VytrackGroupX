package com.vytrack.tests;


import com.vytrack.tests.base.TestBase;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US03_How_to_use_Pinbar extends TestBase {

        @Test
        public void StoreManager_see_text_on_pinbar(){
            //User go to the login page
            loginPage.gotoLoginPage();
            // User login as a Store Manager
            loginPage.login(ConfigurationReader.getProperty("store_manager_username1"),ConfigurationReader.getProperty("store_manager_password"));

            //Find and click "Learn how to use this space b
            homePage.pinbar.click();
            BrowserUtils.sleep(2);


            //find the actual texts
            String actualHeaderText = pinbarPage.pinbarHeader.getText();
            String actualText=pinbarPage.pinbarText.getText();

            // expected text
            String expectedHeaderText = "How To Use Pinbar";
            String expectedText = "Use pin icon on the right top corner of page to create fast access link in the pinbar.";

            //verify
            Assert.assertEquals(actualHeaderText,expectedHeaderText);
            Assert.assertEquals(actualText,expectedText);

            Driver.closeDriver();

        }

        @Test
        public void user_verified_image(){
            //User go to the login page
            loginPage.gotoLoginPage();
            // User login as a Store Manager
            loginPage.login(ConfigurationReader.getProperty("store_manager_username1"),ConfigurationReader.getProperty("store_manager_password"));

            //Find and click "Learn how to use this space b
            homePage.pinbar.click();
            BrowserUtils.sleep(2);


            String expectedImagePath = "https://qa2.vytrack.com/bundles/oronavigation/images/pinbar-location.jpg";
            //verify

            //find actual imagine path
            String actualImaginePath = pinbarPage.image_Pinbar.getAttribute("src");

            Assert.assertEquals(actualImaginePath,expectedImagePath);
            Driver.closeDriver();

        }

    }
