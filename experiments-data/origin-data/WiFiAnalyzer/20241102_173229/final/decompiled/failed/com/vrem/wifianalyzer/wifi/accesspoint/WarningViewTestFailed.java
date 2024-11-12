package com.vrem.wifianalyzer.wifi.accesspoint;

import com.vrem.wifianalyzer.MainActivity;
import com.vrem.wifianalyzer.wifi.model.WiFiData;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class WarningViewTestFailed {
   @Test
   public void test_update_WiFiData_1_2904() {
      boolean var1 = ((WarningView)JMockK.spyk(new WarningView((MainActivity)JMockK.mockk(MainActivity.class, true)))).update((WiFiData)JMockK.mockk(WiFiData.class, true));
   }
}
