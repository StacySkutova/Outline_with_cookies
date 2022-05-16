package com.stv.factory.factorypages;

import com.stv.factory.factorytests.BasicFactoryTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
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


    @Given("^the main page is loaded$")
    public void setup() {
        getDriver().get(START_URL);
        getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        getDriver().manage().window().maximize();
    }


    @When("^the user click on US flag icon$")
    public void pressUSFlagIcon() {
        //reject cookies to download page
        new MainFactoryPage().pressRejectCookies();
        new MainFactoryPage().pressUSFlagIcon();
//        getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    @And("^choose destination to UK$")
    public void chooseDestinationUK() {
        new MainFactoryPage().chooseDestinationUK();
    }

    @And("^click update button$")
    public void clickUpdateButton() {
        new MainFactoryPage().clickUpdateButton();
    }

    @And("^check the US flag has bean changed to UK flag$")
    public void checkUKFlag() {
        new MainFactoryPage().checkUKFlag();
    }

    @Then("^click UK flag$")
    public void pressUKFlagIcon() {
        new MainFactoryPage().pressUKFlagIcon();
    }

    @And("^choose destination to US$")
    public void chooseDestinationUS() {
        new MainFactoryPage().chooseDestinationUS();
    }

    @And("^check the UK flag has bean changed to US flag$")
    public void checkUSFlag() {
        new MainFactoryPage().checkUSFlag();
    }

    @And("^check US dollars icon in the cart$")
    public void checkUSDollarsInCart() {
        new MainFactoryPage().checkUSDollarsInCart();
    }

}

