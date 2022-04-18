package com.tmb.driver;

import com.tmb.driver.factory.DriverFactory;
import com.tmb.driver.intity.MobileDriverData;
import com.tmb.driver.intity.WebDriverData;
import com.tmb.enums.MobilePlatformType;
import org.openqa.selenium.WebDriver;

import java.util.Objects;

import static com.tmb.config.factory.ConfigFactory.*;

public final class Driver {

    private Driver(){}

    public static void initDriverForWeb(){
        if(Objects.isNull(DriverManager.getDriver())) {
            WebDriverData driverData = new WebDriverData(getConfig().browser(), getConfig().browserRemoteMode());

            WebDriver driver = DriverFactory
                    .getDriverForWeb(getConfig().browserRunMode())
                    .getDriver(driverData);
            DriverManager.setDriver(driver);
        }
    }
    public static void initDriverForMobile(){
        MobileDriverData driverData = new MobileDriverData(MobilePlatformType.IOS
                ,getConfig().mobileRemoteMode());
        WebDriver driver = DriverFactory
                .getDriverForMobile(getConfig().mobileRunMode())
                .getDriver(driverData);
        DriverManager.setDriver(driver);
    }
    public static void quitDriver(){
        if(Objects.nonNull(DriverManager.getDriver())) {
            DriverManager.getDriver()
                    .quit();
            DriverManager.unload();
        }
    }
}