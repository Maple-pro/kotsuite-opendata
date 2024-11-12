package com.vrem.wifianalyzer.wifi.accesspoint;

import com.vrem.wifianalyzer.wifi.model.WiFiData;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class AccessPointsAdapterTestFailed {
   @Test
   public void test_update_WiFiData_1_3120() {
      ((AccessPointsAdapter)JMockK.spyk(new AccessPointsAdapter((AccessPointsAdapterData)JMockK.mockk(AccessPointsAdapterData.class, true), (AccessPointDetail)JMockK.mockk(AccessPointDetail.class, true), (AccessPointPopup)JMockK.mockk(AccessPointPopup.class, true)))).update((WiFiData)JMockK.mockk(WiFiData.class, true));
   }
}
