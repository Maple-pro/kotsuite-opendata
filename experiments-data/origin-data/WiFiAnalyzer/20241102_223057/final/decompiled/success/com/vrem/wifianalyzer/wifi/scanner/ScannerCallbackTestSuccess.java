package com.vrem.wifianalyzer.wifi.scanner;

import com.vrem.wifianalyzer.wifi.manager.WiFiManagerWrapper;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class ScannerCallbackTestSuccess {
   @Test
   public void test_onSuccess_1_4760() {
      ((ScannerCallback)JMockK.spyk(new ScannerCallback((WiFiManagerWrapper)JMockK.mockk(WiFiManagerWrapper.class, true), (Cache)JMockK.mockk(Cache.class, true)))).onSuccess();
   }
}
