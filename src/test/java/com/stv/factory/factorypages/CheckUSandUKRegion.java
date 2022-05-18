package com.stv.factory.factorypages;

import com.stv.factory.factorypages.MainFactoryPage;
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
    public void pressUSFlagIcon() throws InterruptedException {
        //reject cookies to download page
        new MainFactoryPage().pressRejectCookies();
        new MainFactoryPage().pressUSFlagIcon();
        Thread.sleep(2000);
//        getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    @And("^choose destination to UK$")
    public void chooseDestinationUK() throws InterruptedException {
        new MainFactoryPage().chooseDestinationUK();
        Thread.sleep(2000);
    }

    @And("^click update button$")
    public void clickUpdateButton() throws InterruptedException {
        new MainFactoryPage().clickUpdateButton();
        Thread.sleep(2000);
    }

    @And("^check the US flag has bean changed to UK flag$")
    public void checkUKFlag() throws InterruptedException {
        new MainFactoryPage().checkUKFlag();
        Thread.sleep(2000);
    }

    @Then("^click UK flag$")
    public void pressUKFlagIcon() throws InterruptedException {
        new MainFactoryPage().pressUKFlagIcon();
        Thread.sleep(2000);
    }

    @And("^choose destination to US$")
    public void chooseDestinationUS() throws InterruptedException {
        new MainFactoryPage().chooseDestinationUS();
        Thread.sleep(2000);
    }

    @And("^check the UK flag has bean changed to US flag$")
    public void checkUSFlag() throws InterruptedException {
        new MainFactoryPage().checkUSFlag();
        Thread.sleep(2000);
    }

    @And("^check US dollars icon in the cart$")
    public void checkUSDollarsInCart() throws InterruptedException {
        new MainFactoryPage().checkUSDollarsInCart();
        Thread.sleep(2000);
    }

}

