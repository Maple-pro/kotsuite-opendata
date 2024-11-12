package com.vrem.wifianalyzer.wifi.manager;

import android.net.wifi.WifiManager;
import io.github.maples.jmockk.JMockK;
import org.junit.Assert;
import org.junit.Test;

public class WiFiSwitchTestSuccess {
   @Test
   public void test_minVersionQ_1_2632() {
      Object var1 = ((WiFiSwitch)JMockK.spyk(new WiFiSwitch((WifiManager)JMockK.mockk(WifiManager.class, true)))).minVersionQ();
      Assert.assertEquals(new Integer(0), var1);
   }

   @Test
   public void test_off_1_2608() {
      Object var1 = ((WiFiSwitch)JMockK.spyk(new WiFiSwitch((WifiManager)JMockK.mockk(WifiManager.class, true)))).off();
      Assert.assertEquals(new Integer(0), var1);
   }

   @Test
   public void test_on_1_2596() {
      Object var1 = ((WiFiSwitch)JMockK.spyk(new WiFiSwitch((WifiManager)JMockK.mockk(WifiManager.class, true)))).on();
      Assert.assertEquals(new Integer(0), var1);
   }
}
