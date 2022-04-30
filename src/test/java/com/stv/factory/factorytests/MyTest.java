package com.stv.factory.factorytests;

import com.stv.factory.factorypages.MainFactoryPage;
import com.stv.factory.factorypages.MyResetPasswordPage;
import com.stv.factory.factorypages.NewUserPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTest extends BasicFactoryTest{
    MainFactoryPage mainFactoryPage = new MainFactoryPage();
    MyResetPasswordPage myResetPasswordPage = new MyResetPasswordPage();
        // new tests
//    @Test(description = "Assert the login page is loaded", dependsOnMethods = "assertLoginPageOpened")
    @Test(description = "Assert the login page is loaded")
    public void assertGoNewUser() {
        mainFactoryPage.clickOnTrustButton();
        mainFactoryPage.clickOnAccountLink();
        mainFactoryPage.newCustomerEmail("aaa@mail.ru");
        mainFactoryPage.clickNewCustomerButton();
//        mainFactoryPage.clickForgottenYourPassword();
//        Assert.assertEquals(new LoginPage().isLoginContainerDisplayed(), true, "Login page isn't loaded properly");
        // Добавил свой тестик
        Assert.assertEquals(new NewUserPage().isLoginContainerDisplayed(), true, "Login page isn't loaded properly");

    }

}
