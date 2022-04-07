package com.tmb.driver.factory;

import com.tmb.driver.LocalMobileDriverImpl;
import com.tmb.driver.LocalWebDriverImpl;
import com.tmb.driver.RemoteMobileDriverImpl;
import com.tmb.driver.RemoteWebDriverImpl;
import com.tmb.driver.intity.MobileDriverData;
import com.tmb.driver.intity.WebDriverData;
import com.tmb.enums.RunModeType;
import org.openqa.selenium.WebDriver;

public final class DriverFactory {

    private DriverFactory(){}

    public static WebDriver getDriverForWeb(WebDriverData driverData){
        return driverData.getRunModeType() == RunModeType.LOCAL
                ? new LocalWebDriverImpl().getDriver(driverData)
                : new RemoteWebDriverImpl().getDriver(driverData);
    }
    public static WebDriver getDriverForMobile(MobileDriverData driverData){
        return driverData.getRunModeType() == RunModeType.LOCAL
                ? new LocalMobileDriverImpl().getDriver(driverData)
                : new RemoteMobileDriverImpl().getDriver(driverData);
    }
}