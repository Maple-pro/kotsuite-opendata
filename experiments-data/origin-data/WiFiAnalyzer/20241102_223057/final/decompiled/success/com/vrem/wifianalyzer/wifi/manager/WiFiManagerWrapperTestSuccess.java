package com.vrem.wifianalyzer.wifi.manager;

import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import io.github.maples.jmockk.JMockK;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class WiFiManagerWrapperTestSuccess {
   @Test
   public void test_disableWiFi_1_1433() {
      Object var1 = ((WiFiManagerWrapper)JMockK.spyk(new WiFiManagerWrapper((WifiManager)JMockK.mockk(WifiManager.class, true), (WiFiSwitch)JMockK.mockk(WiFiSwitch.class, true)))).disableWiFi();
      Assert.assertEquals(new Integer(1), var1);
   }

   @Test
   public void test_enableWiFi_1_1417() {
      Object var1 = ((WiFiManagerWrapper)JMockK.spyk(new WiFiManagerWrapper((WifiManager)JMockK.mockk(WifiManager.class, true), (WiFiSwitch)JMockK.mockk(WiFiSwitch.class, true)))).enableWiFi();
      Assert.assertEquals(new Integer(0), var1);
   }

   @Test
   public void test_is5GHzBandSupported_1_1497() {
      Object var1 = ((WiFiManagerWrapper)JMockK.spyk(new WiFiManagerWrapper((WifiManager)JMockK.mockk(WifiManager.class, true), (WiFiSwitch)JMockK.mockk(WiFiSwitch.class, true)))).is5GHzBandSupported();
      Assert.assertEquals(new Integer(0), var1);
   }

   @Test
   public void test_is6GHzBandSupported_1_1513() {
      Object var1 = ((WiFiManagerWrapper)JMockK.spyk(new WiFiManagerWrapper((WifiManager)JMockK.mockk(WifiManager.class, true), (WiFiSwitch)JMockK.mockk(WiFiSwitch.class, true)))).is6GHzBandSupported();
      Assert.assertEquals(new Integer(0), var1);
   }

   @Test
   public void test_isScanThrottleEnabled_1_1529() {
      Object var1 = ((WiFiManagerWrapper)JMockK.spyk(new WiFiManagerWrapper((WifiManager)JMockK.mockk(WifiManager.class, true), (WiFiSwitch)JMockK.mockk(WiFiSwitch.class, true)))).isScanThrottleEnabled();
      Assert.assertEquals(new Integer(0), var1);
   }

   @Test
   public void test_minVersionR_1_1545() {
      Object var1 = ((WiFiManagerWrapper)JMockK.spyk(new WiFiManagerWrapper((WifiManager)JMockK.mockk(WifiManager.class, true), (WiFiSwitch)JMockK.mockk(WiFiSwitch.class, true)))).minVersionR();
      Assert.assertEquals(new Integer(0), var1);
   }

   @Test
   public void test_scanResults_1_1465() {
      List var1 = ((WiFiManagerWrapper)JMockK.spyk(new WiFiManagerWrapper((WifiManager)JMockK.mockk(WifiManager.class, true), (WiFiSwitch)JMockK.mockk(WiFiSwitch.class, true)))).scanResults();
   }

   @Test
   public void test_startScan_1_1449() {
      Object var1 = ((WiFiManagerWrapper)JMockK.spyk(new WiFiManagerWrapper((WifiManager)JMockK.mockk(WifiManager.class, true), (WiFiSwitch)JMockK.mockk(WiFiSwitch.class, true)))).startScan();
      Assert.assertEquals(new Integer(0), var1);
   }

   @Test
   public void test_wiFiEnabled_1_1401() {
      Object var1 = ((WiFiManagerWrapper)JMockK.spyk(new WiFiManagerWrapper((WifiManager)JMockK.mockk(WifiManager.class, true), (WiFiSwitch)JMockK.mockk(WiFiSwitch.class, true)))).wiFiEnabled();
      Assert.assertEquals(new Integer(0), var1);
   }

   @Test
   public void test_wiFiInfo_1_1481() {
      WifiInfo var1 = ((WiFiManagerWrapper)JMockK.spyk(new WiFiManagerWrapper((WifiManager)JMockK.mockk(WifiManager.class, true), (WiFiSwitch)JMockK.mockk(WiFiSwitch.class, true)))).wiFiInfo();
   }
}
