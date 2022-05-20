package com.stv.factory.factorypages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends FactoryPage {

    @FindBy(className = "bem-checkout")
    private WebElement signInPage;

    @FindBy(className = "js-username")
    private WebElement emailInput;

    @FindBy(className = "js-password")
    private WebElement passwordInput;

    @FindBy(xpath = "//button[@id=\"qa-login\"]")
    private WebElement signInSecurely;

    public boolean isSignInPageDisplayed() {
        return signInPage.isDisplayed();
    }

    public void emailEntering(String email) {
        emailInput.sendKeys(email);
    }

    public void passwordEntering(String password) {
        passwordInput.sendKeys(password);
    }

    public void clickSignInSecurelyButton() {
        signInSecurely.click();
    }
}
