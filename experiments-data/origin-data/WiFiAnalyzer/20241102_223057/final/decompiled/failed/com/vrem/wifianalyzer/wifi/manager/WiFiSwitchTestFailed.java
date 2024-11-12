package com.vrem.wifianalyzer.wifi.manager;

import android.net.wifi.WifiManager;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class WiFiSwitchTestFailed {
   @Test
   public void test_startWiFiSettings_1_2620() {
      ((WiFiSwitch)JMockK.spyk(new WiFiSwitch((WifiManager)JMockK.mockk(WifiManager.class, true)))).startWiFiSettings();
   }
}
