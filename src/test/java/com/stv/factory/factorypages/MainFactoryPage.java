package com.stv.factory.factorypages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainFactoryPage extends FactoryPage {

    @FindBy(id = "accountLink")
    private WebElement accountLink;

    @FindBy(xpath = "//button[contains(text(),'Accept All Cookies')]")
    private WebElement trustButton;
    // my test дописать, чтобы переходило со страницы регистрации

    @FindBy(xpath = "//input[@id='DualRegisterEmailModel_Email']")
    private WebElement newCustomerEmail;

    @FindBy(xpath = "//button[@id='qa-dual-register']")
    private WebElement newCustomerButton;


    //my test
    public void clickNewCustomerButton() {
        newCustomerButton.click();
    }

    public void newCustomerEmail(String newEmail) {
        newCustomerEmail.sendKeys(newEmail);
    }


    public boolean isAccountLinkDisplayed() {
        return accountLink.isDisplayed();
    }

    public void clickOnAccountLink() {
        accountLink.click();
    }

    public void clickOnTrustButton() {
        trustButton.click();
    }


}
