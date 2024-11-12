package com.vrem.wifianalyzer.wifi.band;

import io.github.maples.jmockk.JMockK;
import java.util.SortedSet;
import org.junit.Test;

public class WiFiChannelCountryGHZ5TestSuccess {
   @Test
   public void test_findChannels_String_1_2532() {
      SortedSet var1 = ((WiFiChannelCountryGHZ5)JMockK.spyk(new WiFiChannelCountryGHZ5())).findChannels("9x7aAcijvv-gQFYUImBOZmSHd-kgd5urnQgTmvIkwoVweSGDWAhb0h-W");
   }
}
