package com.vytrack.tests.base;

import com.vytrack.pages.*;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class TestBase {
    protected VytrackLoginPage loginPage;
    protected DashboardPage dashboardPage;
    protected HomePage homePage;
    protected VehiclesPagePOM vehiclesPagePOM;
    protected VehicleOdometerPOM vehicleOdometerPOM;
    protected CreateCalendarEventPage createCalendarEventPage;
    protected CalendarEventsPage calendarEventsPage;

    @BeforeMethod
    public void setUp() {
        // Driver.getDriver().get(ConfigurationReader.getProperty("env1"));
        loginPage = new VytrackLoginPage();
        dashboardPage = new DashboardPage();
        homePage = new HomePage();
        vehiclesPagePOM = new VehiclesPagePOM();
        vehicleOdometerPOM = new VehicleOdometerPOM();
        createCalendarEventPage=new CreateCalendarEventPage();
        calendarEventsPage=new CalendarEventsPage();

    }

    @AfterMethod
    public void tearDown() {
        Driver.closeDriver();
    }

}
