package com.stv.factory.factorypages;

import com.stv.factory.factorytests.BasicFactoryTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewCustomerPage extends FactoryPage {
    @FindBy(className = "bem-checkout")
    private WebElement newCustomerPageContainer;

    public boolean isNewCustomerPageContainerDisplayed() {
        return newCustomerPageContainer.isDisplayed();
    }
}
