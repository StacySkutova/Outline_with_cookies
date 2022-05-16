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

    @And("^check UK flag$")
    public void checkUKFlag() {
        new MainFactoryPage().checkUKFlag();
    }

    @Then("^flag click UK$")
    public void pressUKFlagIcon() {
        new MainFactoryPage().pressUKFlagIcon();
    }

    @And("^choose destination US$")
    public void chooseDestinationUS() {
        new MainFactoryPage().chooseDestinationUS();
    }

    @And("^check US flag$")
    public void checkUSFlag() {
        new MainFactoryPage().checkUSFlag();
    }

    @And("^check US dollars icon in cart$")
    public void checkUSDollarsInCart() {
        new MainFactoryPage().checkUSDollarsInCart();
    }

}

