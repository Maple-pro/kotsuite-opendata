package com.vrem.wifianalyzer.wifi.scanner;

import com.vrem.wifianalyzer.permission.PermissionService;
import com.vrem.wifianalyzer.settings.Settings;
import com.vrem.wifianalyzer.wifi.manager.WiFiManagerWrapper;
import com.vrem.wifianalyzer.wifi.model.WiFiData;
import io.github.maples.jmockk.JMockK;
import org.junit.Assert;
import org.junit.Test;

public class ScannerTestSuccess {
   @Test
   public void test_register_UpdateNotifier_1_4536() {
      Object var1 = ((Scanner)JMockK.spyk(new Scanner((WiFiManagerWrapper)JMockK.mockk(WiFiManagerWrapper.class, true), (Settings)JMockK.mockk(Settings.class, true), (PermissionService)JMockK.mockk(PermissionService.class, true), (Transformer)JMockK.mockk(Transformer.class, true)))).register((UpdateNotifier)JMockK.mockk(UpdateNotifier.class, true));
      Assert.assertEquals(new Integer(1), var1);
   }

   @Test
   public void test_registered_1_4736() {
      Object var1 = ((Scanner)JMockK.spyk(new Scanner((WiFiManagerWrapper)JMockK.mockk(WiFiManagerWrapper.class, true), (Settings)JMockK.mockk(Settings.class, true), (PermissionService)JMockK.mockk(PermissionService.class, true), (Transformer)JMockK.mockk(Transformer.class, true)))).registered();
      Assert.assertEquals(new Integer(0), var1);
   }

   @Test
   public void test_unregister_UpdateNotifier_1_4564() {
      Object var1 = ((Scanner)JMockK.spyk(new Scanner((WiFiManagerWrapper)JMockK.mockk(WiFiManagerWrapper.class, true), (Settings)JMockK.mockk(Settings.class, true), (PermissionService)JMockK.mockk(PermissionService.class, true), (Transformer)JMockK.mockk(Transformer.class, true)))).unregister((UpdateNotifier)JMockK.mockk(UpdateNotifier.class, true));
      Assert.assertEquals(new Integer(0), var1);
   }

   @Test
   public void test_update_1_4488() {
      ((Scanner)JMockK.spyk(new Scanner((WiFiManagerWrapper)JMockK.mockk(WiFiManagerWrapper.class, true), (Settings)JMockK.mockk(Settings.class, true), (PermissionService)JMockK.mockk(PermissionService.class, true), (Transformer)JMockK.mockk(Transformer.class, true)))).update();
   }

   @Test
   public void test_wiFiData_1_4512() {
      WiFiData var1 = ((Scanner)JMockK.spyk(new Scanner((WiFiManagerWrapper)JMockK.mockk(WiFiManagerWrapper.class, true), (Settings)JMockK.mockk(Settings.class, true), (PermissionService)JMockK.mockk(PermissionService.class, true), (Transformer)JMockK.mockk(Transformer.class, true)))).wiFiData();
   }
}
