package com.stv.factory.factorypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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

    // for new cucumber test (created find+click method)
    @FindBy(css = "div a#forgotten-password")
    private WebElement forgottenYourPassword;

    public void clickForgottenYourPassword() {
        forgottenYourPassword.click();
    }


    //// cucumber 2 test!!!!!!!!!!///////////


    @FindBy(xpath = "//button[@class=\"truste-button4\"]")
    private WebElement rejectCookies;

    public boolean ifRejectCookiesIsExist() {
        if (rejectCookies.isDisplayed()) {
            return rejectCookies.isDisplayed();
        } else return false;
    }

    public void pressRejectCookies() {
        rejectCookies.click();
    }

    // flag icon US
    @FindBy(xpath = "//span[@class='flag flag-US']")
    private WebElement language_selector_US;

    public void pressUSFlagIcon() {
        language_selector_US.click();
    }

    //    @FindBy(xpath = "//select/option[.='United Kingdom']")
    @FindBy(xpath = "//select/option[.='United Kingdom']")
    private WebElement deliveryDestinationUK;

    public void chooseDestinationUK() {
        deliveryDestinationUK.click();
    }

    //update ButtonClick
    @FindBy(xpath = "//button[@type=\"submit\"]")
    private WebElement updateButton;

    public void clickUpdateButton() {
        updateButton.click();
    }

    //check UKFlag
    @FindBy(xpath = "//span[@class='flag flag-GB']")
    private WebElement UKFlag;

    public void checkUKFlag() {
        UKFlag.isDisplayed();
    }

    //choose destination UK
    @FindBy(xpath = "//span[@class='flag flag-GB']")
    private WebElement language_selector_UK;

    public void pressUKFlagIcon() {
        language_selector_UK.click();
    }

    //choose destination US
    @FindBy(xpath = "//select/option[.='USA']")
    private WebElement deliveryDestinationUS;

    public void chooseDestinationUS() {
        deliveryDestinationUS.click();
    }

    //check USFlag
    @FindBy(xpath = "//span[@class='flag flag-US']")
    private WebElement USFlag;

    public void checkUSFlag() {
        USFlag.isDisplayed();
    }

    //check USDollar
    @FindBy(xpath = "//span[@class=\"bem-mini-basket__summary-amount\"][contains(text(),'$')]")
    private WebElement USDollar;

    public void checkUSDollarsInCart() {
        USDollar.isDisplayed();
    }
///////////////// OUTLINE Scenario

    @FindBy(xpath = "//a[@id=\"accountLink\"]")
    private WebElement yourAccountLink;

    public void yourAccountLinkClick() {
        yourAccountLink.click();
    }

    @FindBy(xpath = "//button[@id=\"qa-login\"]")
    private WebElement signInSecurelyButton;

    public void signInSecurelyButtonClick() {
        signInSecurelyButton.click();
    }

    @FindBy(xpath = "//input[@class=\"bem-forms__form-control js-username\"]")
    private WebElement emailField;

    public void emailFieldSenKeys(String email) {
        emailField.sendKeys();
    }

    @FindBy(xpath = "//input[@class=\"bem-forms__form-control js-password\"]")
    private WebElement passwordField;

    public void passwordFieldSenKeys(String password) {
        passwordField.sendKeys();
    }

//    WebDriver driver = null;
//        driver.findElement(By.xpath("//input[@class=\"bem-forms__form-control js-username\"]")).sendKeys(arg1);
//        driver.findElement(By.xpath("//input[@class=\"bem-forms__form-control js-password\"]")).sendKeys(arg2);

    //button[@id="qa-login"]


//    @FindBy(xpath = "//select[@class='bem-language-selector__control'][@id='countryId']")
//    private WebElement delivery_destination_selector;

    //select[@class='bem-language-selector__control'][@id='countryId'][@text='']
    //button[@type="submit"]
    //select/option[.='United Kingdom']
    //select/option[.='USA']
    //button[@class="bem-language-selector__button"]
    //span[@class='flag flag-GB']
    //span[@class='flag flag-US']
    //span[contains(text(),'$')]
    //span[@class="bem-mini-basket__summary-amount"][contains(text(),'$')]
    //span[@class="bem-mini-basket__summary-amount"][contains(text(),'£')]
//    @FindBy(xpath = "//a[@href='/internationaloptions/update?returnUrl=%2F']")
//    @FindBy(xpath = "//a [@class=\"bem-header__language-selector\"]")
//    @FindBy(xpath = "//li [@class=\"bem-header__list-item\"][3]")
    //button[@class="truste-button4"]
    //reject cookies

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
