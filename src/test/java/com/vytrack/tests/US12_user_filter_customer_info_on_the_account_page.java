package com.vytrack.tests;

import com.vytrack.utilities.Driver;
import com.vytrack.utilities.VytrackUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class US12_user_filter_customer_info_on_the_account_page {

    // instead of creating multiple methods for each elements I've used @DataProvider to
    @DataProvider(name="filters")
    public Object[][] dpMethod(){

        List<String> expectedFilters = Arrays.asList("Account Name","Contact Name","Contact Email","Contact Phone",
                "Owner","Business Unit","Created At","Updated At");

        // these are the syntax that I need to use for this method
        Object[][] objData = new Object[1][1];
        objData[0][0]= expectedFilters;

        return objData;
    }


    //in this test I used DataProvider annotation that I've created
    @Test(dataProvider = "filters")

    //expected filers I used as an argument List of expected filters in my test method which I determined in my data providers
    public void user_filter_customer_info_on_the_account_page (List<String> expectedFilters) {

        //
        VytrackUtils.loginAsStoreManager();

        //
        VytrackUtils.waitTillLoaderMaskDisappear();

        //VytrackUtils.navigateToModule("Customers","Accounts");

        // I located the customers tab
        WebElement customers = Driver.getDriver().findElement(By.xpath("(//li[@class='dropdown dropdown-level-1'])[2]"));
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(customers).perform();
        Driver.getDriver().findElement(By.xpath("//span[.='Accounts']")).click();

        Driver.getDriver().findElement(By.xpath("//a[@title='Filters']")).click();

        // each filters tab will come for all 8 filter options list of filters
        List<WebElement> filters = Driver.getDriver().findElements(By.xpath("//div[@class='filter-item oro-drop']"));

      //  I used for loop  to use split method
        for (int i = 0; i < expectedFilters.size(); i++) {
            System.out.println(filters.get(i).getText());
            String[] filter = filters.get(i).getText().split(":");
            String actualFilter = filter[0].toString();
            Assert.assertEquals(actualFilter, expectedFilters.get(i));

        }
    }
    }