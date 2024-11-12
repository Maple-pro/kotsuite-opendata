package com.vrem.wifianalyzer.wifi.band;

import io.github.maples.jmockk.JMockK;
import java.util.SortedSet;
import org.junit.Test;

public class WiFiChannelCountryGHZ2TestSuccess {
   @Test
   public void test_findChannels_String_1_2524() {
      SortedSet var1 = ((WiFiChannelCountryGHZ2)JMockK.spyk(new WiFiChannelCountryGHZ2())).findChannels("bZYqqRBiWX7uFgZUaep4yycZo4gqIMPmOLThC510a3uxaZUT7Kqm65jpuKYt2Rbqid68UtQnODdhXX75NN");
   }
}
