package bdd_framework.steps;


import com.stv.factory.factorypages.MainFactoryPage;
import com.stv.factory.factorypages.MyResetPasswordPage;
import com.stv.factory.factorytests.BasicFactoryTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.concurrent.TimeUnit;

public class RecoveryPage extends BasicFactoryTest {
    MyResetPasswordPage myResetPasswordPage = new MyResetPasswordPage();
    MainFactoryPage mainFactoryPage = new MainFactoryPage();

    public static final String START_URL = "https://www.wiggle.co.uk/secure/myaccount/logon?returnUrl=%2Fsecure%2Faccount";
//    public static final String POINT_URL = "https://www.wiggle.co.uk/secure/myaccount/RecoverPassword?email=";

    @Given("^the page is loaded$")
    public void setup() throws Throwable {
        getDriver().get(START_URL);
        getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        getDriver().manage().window().maximize();
    }

    @When("^the user clicks on the link Forgotten the password$")

    public void pressForgottenYourPasswordLink() {
        new MainFactoryPage().clickForgottenYourPassword();
    }

    @Then("^the user goes to the reset password page$")
    public void goesToResetMyPasswordPage() {
        getDriver().manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
        new MyResetPasswordPage().isResetPasswordContainerDisplayed();
    }

}
