package com.xs.stocksettings.utils;

import miui.os.SystemProperties;

/**
 * Created by xs on 15-7-26.
 */
public class DeviceInfo {

    private static final String MOD_DEVICE = SystemProperties.get("ro.product.mod_device");
    private static final String IsBacon = "bacon_xs";
    private static final String Is8297 = "8297_xs";

    public static boolean isBacon() {
        return MOD_DEVICE.equals(IsBacon);
    }

    public static boolean is8297() {
        return MOD_DEVICE.equals(Is8297);
    }
}
