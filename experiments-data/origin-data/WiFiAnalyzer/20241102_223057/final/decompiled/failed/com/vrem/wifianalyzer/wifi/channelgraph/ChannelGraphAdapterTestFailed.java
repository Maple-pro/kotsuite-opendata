package com.vrem.wifianalyzer.wifi.channelgraph;

import com.vrem.wifianalyzer.wifi.model.WiFiData;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class ChannelGraphAdapterTestFailed {
   @Test
   public void test_update_WiFiData_1_4960() {
      ((ChannelGraphAdapter)JMockK.spyk(new ChannelGraphAdapter((ChannelGraphNavigation)JMockK.mockk(ChannelGraphNavigation.class, true)))).update((WiFiData)JMockK.mockk(WiFiData.class, true));
   }
}
