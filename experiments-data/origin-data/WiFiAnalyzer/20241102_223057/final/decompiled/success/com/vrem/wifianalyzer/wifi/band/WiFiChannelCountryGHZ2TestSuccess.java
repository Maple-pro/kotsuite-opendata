package com.vrem.wifianalyzer.wifi.band;

import io.github.maples.jmockk.JMockK;
import java.util.SortedSet;
import org.junit.Test;

public class WiFiChannelCountryGHZ2TestSuccess {
   @Test
   public void test_findChannels_String_1_2524() {
      SortedSet var1 = ((WiFiChannelCountryGHZ2)JMockK.spyk(new WiFiChannelCountryGHZ2())).findChannels("QWZk3Uf9zyKCO6rFJ9S5UQYZyR5ySZQppH2rXezveQgcMA72ClHTD1ExvWoKKA5LWHzLVSl");
   }
}
