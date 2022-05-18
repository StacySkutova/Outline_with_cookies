package com.stv.factory.factorypages;

import com.stv.factory.factorypages.FactoryPage;
import com.stv.factory.factorypages.MainFactoryPage;
import com.stv.factory.factorypages.MySignInPage;
import com.stv.factory.factorypages.NewCustomerPage;
import com.stv.factory.factorytests.BasicFactoryTest;
import com.stv.framework.core.drivers.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class OutlineTest extends BasicFactoryTest {
    public static final String START_URL = "https://www.wiggle.com/";
//    public static final String START_URL = "https://www.wiggle.com/secure/myaccount/logon?returnUrl=%2Fsecure%2Faccount";
    WebDriver driver = null;

    @Given("^the Wiggle main page is loaded$")
    public void setup() {
        getDriver().get(START_URL);
        getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        getDriver().manage().window().maximize();
    }

    @When("^the user clicks on the Your account link$")
    public void theUserClicksOnTheYourAccountLink() {
        if (new MainFactoryPage().ifRejectCookiesIsExist()){
            new MainFactoryPage().pressRejectCookies();
        }
//        new MainFactoryPage().pressRejectCookies();
        new MainFactoryPage().yourAccountLinkClick();
    }


    @Then("^the user goes to the Sign In page$")
    public void theUserGoesToSignInPage() {
        getDriver().manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
        Assert.assertEquals(new MySignInPage().isSignInPageContainerDisplayed(),
                true, " page isn't loaded properly");
    }


        @And("the user enter Email Address as {string} and Password as {string}")
    public void theUserEnterEmailAddressAsAndPasswordAs(String arg1, String arg2) throws InterruptedException {
        //        new MainFactoryPage().emailFieldSenKeys(arg1);
//        new MainFactoryPage().passwordFieldSenKeys(arg2);
//        driver.findElement(By.xpath("//input[@class=\"bem-forms__form-control js-username\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@class=\"bem-forms__form-control js-username\"]")).sendKeys(arg1);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@class=\"bem-forms__form-control js-password\"]")).sendKeys(arg2);
        Thread.sleep(2000);
        //        driver.findElement(By.xpath("//button[@id=\"qa-login\"]")).click();
    }



    @And("^click Sign in securely$")
    public void clickSignInSecurely() {
        new MainFactoryPage().signInSecurelyButtonClick();
    }


    @Then("^the user goes to New customer page$")
    public void theUserGoesToNewCustomerPage() {
        getDriver().manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
        Assert.assertEquals(new NewCustomerPage().isNewCustomerPageContainerDisplayed(),
                true, " page isn't loaded properly");
    }


}

