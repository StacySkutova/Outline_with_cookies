package com.stv.factory.factorypages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
// Делал по аналогии добавил класс со страницей перехода на https://www.wiggle.com/secure/myaccount/logon?returnUrl=%2Fsecure%2Faccount&checkout=False&forceRegister=True&email=test%40gmail.com
public class NewUserPage extends FactoryPage {

        @FindBy(className = "bem-checkout")
        private WebElement loginContainer;

        public boolean isLoginContainerDisplayed(){
            return loginContainer.isDisplayed();
        }
    }



