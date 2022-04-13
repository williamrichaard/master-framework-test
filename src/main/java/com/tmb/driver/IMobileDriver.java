package com.tmb.driver;

import com.tmb.driver.intity.MobileDriverData;
import org.openqa.selenium.WebDriver;

public interface IMobileDriver {

    WebDriver getDriver(MobileDriverData driverData);
}
