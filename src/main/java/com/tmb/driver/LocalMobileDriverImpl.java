package com.tmb.driver;

import com.tmb.driver.factory.mobile.local.LocalMobileDriverFactory;
import com.tmb.driver.intity.MobileDriverData;
import org.openqa.selenium.WebDriver;

public class LocalMobileDriverImpl implements IMobileDriver{

    @Override
    public WebDriver getDriver(MobileDriverData driverData) {
        return LocalMobileDriverFactory.getDriver(driverData.getMobilePlatformType());
    }
}
