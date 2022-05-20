package com.stv.bdd_framework.steps;

import com.stv.factory.factorypages.MainFactoryPage;
import com.stv.factory.factorypages.SignInPage;
import com.stv.factory.factorypages.NewCustomerPage;
import com.stv.factory.factorytests.BasicFactoryTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.NoSuchElementException;

import java.util.concurrent.TimeUnit;

import static com.stv.framework.core.lib.WigglePageURLs.START_URL;

public class emailAndPasswordSteps extends BasicFactoryTest {

    @Given("^the Wiggle main page is loaded$")
    public void setup() {
        getDriver().get(START_URL);
        getDriver().manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
        getDriver().manage().window().maximize();
    }

    @When("^the user clicks on the Your account link$")
    public void theUserClicksOnTheYourAccountLink() {
        try {
            new MainFactoryPage().isRejectCookiesExist();
            new MainFactoryPage().pressRejectCookiesButton();
            new MainFactoryPage().clickOnAccountLink();
        } catch (NoSuchElementException e) {
            new MainFactoryPage().clickOnAccountLink();
        }
    }

    @And("^the user goes to the Sign In page$")
    public void theUserGoesToSignInPage() {
        getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        new SignInPage().isSignInPageDisplayed();
    }

    @And("the user enter Email Address as {string} and Password as {string}")
    public void theUserEnterEmailAddressAsAndPasswordAs(String email, String password) {
        new SignInPage().emailEntering(email);
        getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        new SignInPage().passwordEntering(password);
        getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @And("^click Sign in securely$")
    public void clickSignInSecurely() {
        new SignInPage().clickSignInSecurelyButton();
    }

    @Then("^the user goes to New customer page$")
    public void theUserGoesToNewCustomerPage() {
        getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        new NewCustomerPage().isNewCustomerPageDisplayed();
        new NewCustomerPage().openMainPage();
    }
}
