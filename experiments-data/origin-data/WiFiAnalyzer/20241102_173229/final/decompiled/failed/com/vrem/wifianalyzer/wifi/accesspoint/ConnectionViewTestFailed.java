package com.vrem.wifianalyzer.wifi.accesspoint;

import com.vrem.wifianalyzer.MainActivity;
import com.vrem.wifianalyzer.wifi.model.WiFiData;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class ConnectionViewTestFailed {
   @Test
   public void test_update_WiFiData_1_2284() {
      ((ConnectionView)JMockK.spyk(new ConnectionView((MainActivity)JMockK.mockk(MainActivity.class, true), (AccessPointDetail)JMockK.mockk(AccessPointDetail.class, true), (AccessPointPopup)JMockK.mockk(AccessPointPopup.class, true), (WarningView)JMockK.mockk(WarningView.class, true)))).update((WiFiData)JMockK.mockk(WiFiData.class, true));
   }
}
