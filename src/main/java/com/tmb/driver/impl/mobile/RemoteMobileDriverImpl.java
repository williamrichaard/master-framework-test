package com.tmb.driver.impl.mobile;

import com.tmb.driver.IMobileDriver;
import com.tmb.driver.factory.mobile.remote.RemoteMobileDriverFactory;
import com.tmb.driver.intity.MobileDriverData;
import org.openqa.selenium.WebDriver;

public class RemoteMobileDriverImpl implements IMobileDriver {

    @Override
    public WebDriver getDriver(MobileDriverData driverData) {
        return RemoteMobileDriverFactory.getDriver(driverData.getMobileRemoteModeType()
                ,driverData.getMobilePlatformType());
    }
}
