package com.tmb.driver;

import com.tmb.driver.factory.DriverFactory;
import com.tmb.driver.intity.MobileDriverData;
import com.tmb.driver.intity.WebDriverData;
import com.tmb.enums.MobilePlatformType;
import org.openqa.selenium.WebDriver;

import static com.tmb.config.factory.ConfigFactory.getConfig;

public final class Driver {

    private Driver(){}
    //local web , remote web, local mobile , remote mobile

    public static void initDriverForWeb() {
        WebDriverData driverData = WebDriverData.builder()
                .browserType(getConfig().browser())
                .browserRemoteModeType(getConfig().browserRemoteMode())
                .runModeType(getConfig().browserRunMode())
                .build();
        WebDriver driver = DriverFactory.getDriverForWeb(driverData);
        driver.quit();
    }
    public static void initDriverForMobile(){
        MobileDriverData driverData = MobileDriverData.builder()
                .mobilePlatformType(MobilePlatformType.ANDROID)
                .mobileRemoteModeType(getConfig().mobileRemoteMode())
                .runModeType(getConfig().mobileRunMode())
                .build();
        WebDriver driver = DriverFactory.getDriverForMobile(driverData);
        driver.quit();
    }
    public static void quitDriver(){
        /*

         */
    }
}
