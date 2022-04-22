package com.tmb.driver.impl.web;

import com.tmb.driver.IWebDriver;
import com.tmb.driver.factory.web.local.LocalDriverFactory;
import com.tmb.driver.factory.web.remote.RemoteDriverFactory;
import com.tmb.driver.intity.WebDriverData;
import org.openqa.selenium.WebDriver;

public class RemoteWebDriverImpl implements IWebDriver {

    @Override
    public WebDriver getDriver(WebDriverData driverData) {
        return RemoteDriverFactory.getDriver(driverData.getBrowserRemoteModeType()
                ,driverData.getBrowserType());
    }
}
