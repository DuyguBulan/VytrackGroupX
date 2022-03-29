package com.vytrack.tests;

import com.vytrack.tests.base.TestBase;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import com.vytrack.utilities.VytrackUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class US06_user_to_see_edit_car_info_icons_on_vehicle_page  extends TestBase {

    @Test
    public void user_filter_customer_info_on_the_account_page() {

        loginPage.gotoLoginPage();
        loginPage.login(ConfigurationReader.getProperty("sales_manager_username2"), ConfigurationReader.getProperty("sales_manager_password"));
        BrowserUtils.waitUntilVisibilityOfElement(homePage.activitiesModule, 10);

        // Click the Vehicles under the Fleet
        BrowserUtils.waitUntilVisibilityOfElement(homePage.fleetModule, 10);
        BrowserUtils.hover(homePage.fleetModule);
        BrowserUtils.waitUntilVisibilityOfElement(homePage.vehicle_submodule, 10);
        BrowserUtils.hover(homePage.vehicle_submodule);
        homePage.vehicle_submodule.click();


        //Verify any car info has 3 dots “...”, and there are “view, edit, delete” icons.

        List<WebElement> links = Driver.getDriver().findElements(By.xpath("//td[@class='action-cell grid-cell grid-body-cell']"));
        List<WebElement> dots=Driver.getDriver().findElements(By.xpath("//tr//div[@class='more-bar-holder']/div"));
        Wait wait = new WebDriverWait(Driver.getDriver(),5);//tr//td[21]

        for (int i = 0; i < links.size(); i++) {
            Actions actions1 = new Actions(Driver.getDriver());
            wait.until(ExpectedConditions.visibilityOfAllElements(links));
            actions1.moveToElement(links.get(i)).click().perform();
            links.get(i).click();

        }

        int count=0;
        List<WebElement> dots1=Driver.getDriver().findElements(By.xpath("" +
                "a"));
        for (WebElement eachDot : dots1) {
            count++;
            System.out.println(count+":-"+eachDot.getAttribute("title")); //get attribute from tittle
        }
        System.out.println(dots1.size());

       // Driver.closeDriver();
    }
}