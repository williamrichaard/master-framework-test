package com.tmb.driver.intity;

import com.tmb.enums.MobilePlatformType;
import com.tmb.enums.MobileRemoteModeType;
import com.tmb.enums.RunModeType;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class MobileDriverData {

    private MobilePlatformType mobilePlatformType;
    private MobileRemoteModeType mobileRemoteModeType;
    private RunModeType runModeType;
}
