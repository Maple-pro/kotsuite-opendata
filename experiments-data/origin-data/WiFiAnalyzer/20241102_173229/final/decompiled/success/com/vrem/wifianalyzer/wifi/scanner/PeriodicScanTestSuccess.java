package com.vrem.wifianalyzer.wifi.scanner;

import android.os.Handler;
import com.vrem.wifianalyzer.settings.Settings;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class PeriodicScanTestSuccess {
   @Test
   public void test_run_1_4420() {
      ((PeriodicScan)JMockK.spyk(new PeriodicScan((ScannerService)JMockK.mockk(ScannerService.class, true), (Handler)JMockK.mockk(Handler.class, true), (Settings)JMockK.mockk(Settings.class, true)))).run();
   }

   @Test
   public void test_startWithDelay_1_4400() {
      ((PeriodicScan)JMockK.spyk(new PeriodicScan((ScannerService)JMockK.mockk(ScannerService.class, true), (Handler)JMockK.mockk(Handler.class, true), (Settings)JMockK.mockk(Settings.class, true)))).startWithDelay();
   }

   @Test
   public void test_start_1_4380() {
      ((PeriodicScan)JMockK.spyk(new PeriodicScan((ScannerService)JMockK.mockk(ScannerService.class, true), (Handler)JMockK.mockk(Handler.class, true), (Settings)JMockK.mockk(Settings.class, true)))).start();
   }

   @Test
   public void test_stop_1_4360() {
      ((PeriodicScan)JMockK.spyk(new PeriodicScan((ScannerService)JMockK.mockk(ScannerService.class, true), (Handler)JMockK.mockk(Handler.class, true), (Settings)JMockK.mockk(Settings.class, true)))).stop();
   }
}
