package com.vrem.wifianalyzer.wifi.band;

import io.github.maples.jmockk.JMockK;
import java.util.SortedSet;
import org.junit.Test;

public class WiFiChannelCountryGHZ6TestSuccess {
   @Test
   public void test_findChannels_1_2540() {
      SortedSet var1 = ((WiFiChannelCountryGHZ6)JMockK.spyk(new WiFiChannelCountryGHZ6())).findChannels();
   }
}
