package com.stv.factory.factorypages;

import com.stv.factory.factorytests.BasicFactoryTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class CheckUSandUKRegion extends BasicFactoryTest {
    public static final String START_URL = "https://www.wiggle.com/";
//    public static final String POINT_URL = "https://www.wiggle.co.uk/secure/myaccount/RecoverPassword?email=";

    @Given("^the main page is loaded$")
    public void setup() {
        getDriver().get(START_URL);
        getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        getDriver().manage().window().maximize();
    }


    @When("^flag click$")
    public void pressUSFlagIcon() {
        new MainFactoryPage().pressRejectCookies();
        new MainFactoryPage().pressUSFlagIcon();
//        getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    @And("^choose destination UK$")
    public void chooseDestinationUK() {
        new MainFactoryPage().chooseDestinationUK();
    }

    @And("^choose update click$")
    public void clickUpdateButton() {
        new MainFactoryPage().clickUpdateButton();
    }
}

