package com.stv.factory.factorypages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyResetPasswordPage extends FactoryPage {
    @FindBy(className = "bem-checkout")
    private WebElement resetPasswordContainer;

    public boolean isResetPasswordContainerDisplayed() {
        return resetPasswordContainer.isDisplayed();
    }


}
