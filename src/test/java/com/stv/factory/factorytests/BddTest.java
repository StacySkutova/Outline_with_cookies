package com.stv.factory.factorytests;

import com.stv.factory.factorypages.MainFactoryPage;
import com.stv.factory.factorypages.MyResetPasswordPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class BddTest extends BasicFactoryTest {
    MainFactoryPage mainFactoryPage = new MainFactoryPage();
    MyResetPasswordPage myResetPasswordPage = new MyResetPasswordPage();

    @Test(description = "Redirect to another page")
    public void clickForgottenYourPassword() {

        getDriver().get("https://www.wiggle.co.uk/secure/myaccount/logon?returnUrl=%2Fsecure%2Faccount");
        getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        getDriver().manage().window().maximize();
        mainFactoryPage.clickForgottenYourPassword();
        myResetPasswordPage.isResetPasswordContainerDisplayed();
        Assert.assertEquals(new MyResetPasswordPage().isResetPasswordContainerDisplayed(),
                true, " page isn't loaded properly");
    }
}
