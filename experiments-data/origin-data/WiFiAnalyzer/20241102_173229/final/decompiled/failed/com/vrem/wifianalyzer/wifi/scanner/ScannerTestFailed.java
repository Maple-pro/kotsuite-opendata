package com.vrem.wifianalyzer.wifi.scanner;

import com.vrem.wifianalyzer.permission.PermissionService;
import com.vrem.wifianalyzer.settings.Settings;
import com.vrem.wifianalyzer.wifi.manager.WiFiManagerWrapper;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class ScannerTestFailed {
   @Test
   public void test_pause_1_4592() {
      ((Scanner)JMockK.spyk(new Scanner((WiFiManagerWrapper)JMockK.mockk(WiFiManagerWrapper.class, true), (Settings)JMockK.mockk(Settings.class, true), (PermissionService)JMockK.mockk(PermissionService.class, true), (Transformer)JMockK.mockk(Transformer.class, true)))).pause();
   }

   @Test
   public void test_resumeWithDelay_1_4664() {
      ((Scanner)JMockK.spyk(new Scanner((WiFiManagerWrapper)JMockK.mockk(WiFiManagerWrapper.class, true), (Settings)JMockK.mockk(Settings.class, true), (PermissionService)JMockK.mockk(PermissionService.class, true), (Transformer)JMockK.mockk(Transformer.class, true)))).resumeWithDelay();
   }

   @Test
   public void test_resume_1_4640() {
      ((Scanner)JMockK.spyk(new Scanner((WiFiManagerWrapper)JMockK.mockk(WiFiManagerWrapper.class, true), (Settings)JMockK.mockk(Settings.class, true), (PermissionService)JMockK.mockk(PermissionService.class, true), (Transformer)JMockK.mockk(Transformer.class, true)))).resume();
   }

   @Test
   public void test_running_1_4616() {
      boolean var1 = ((Scanner)JMockK.spyk(new Scanner((WiFiManagerWrapper)JMockK.mockk(WiFiManagerWrapper.class, true), (Settings)JMockK.mockk(Settings.class, true), (PermissionService)JMockK.mockk(PermissionService.class, true), (Transformer)JMockK.mockk(Transformer.class, true)))).running();
   }

   @Test
   public void test_stop_1_4688() {
      ((Scanner)JMockK.spyk(new Scanner((WiFiManagerWrapper)JMockK.mockk(WiFiManagerWrapper.class, true), (Settings)JMockK.mockk(Settings.class, true), (PermissionService)JMockK.mockk(PermissionService.class, true), (Transformer)JMockK.mockk(Transformer.class, true)))).stop();
   }

   @Test
   public void test_toggle_1_4712() {
      ((Scanner)JMockK.spyk(new Scanner((WiFiManagerWrapper)JMockK.mockk(WiFiManagerWrapper.class, true), (Settings)JMockK.mockk(Settings.class, true), (PermissionService)JMockK.mockk(PermissionService.class, true), (Transformer)JMockK.mockk(Transformer.class, true)))).toggle();
   }
}
