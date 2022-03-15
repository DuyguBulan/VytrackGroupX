package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehiclesPagePOM {
    public VehiclesPagePOM(){

        PageFactory.initElements(Driver.getDriver(),this);
    }
    //Vehicle submodule
    @FindBy(xpath = "//span[.='Vehicles']")
    public WebElement vehicle_submodule;

    //all checkboxes
    @FindBy(xpath = "//input[@data-role='select-row-cell']")
    public WebElement all_check_boxes;

    //first checkbox

    @FindBy(xpath = "(//button[@class='btn btn-default btn-small dropdown-toggle']/input)[1]")
    public WebElement first_check_box;

    //one of check boxes
    @FindBy(xpath = "(//input[@data-role='select-row-cell'])[7]")
    public WebElement one_of_check_boxes;
}

