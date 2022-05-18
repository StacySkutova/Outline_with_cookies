package com.stv.factory.factorypages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MySignInPage extends FactoryPage{
    @FindBy(className = "bem-checkout")
    private WebElement signInPageContainer;

    public boolean isSignInPageContainerDisplayed() {
        return signInPageContainer.isDisplayed();
    }
    @FindBy(xpath = "//button[@id=\"qa-login\"]")
    private WebElement signInSecurely;

    public void clickSignInSecurelyButtonClick() {
        signInSecurely.click();
    }

}
