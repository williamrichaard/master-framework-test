package com.tmb.driver.impl.web;

import com.tmb.driver.IWebDriver;
import com.tmb.driver.factory.web.local.LocalDriverFactory;
import com.tmb.driver.intity.WebDriverData;
import org.openqa.selenium.WebDriver;

public class LocalWebDriverImpl implements IWebDriver {

    @Override
    public WebDriver getDriver(WebDriverData driverData) {
        return LocalDriverFactory.getDriver(driverData.getBrowserType());
    }
}
