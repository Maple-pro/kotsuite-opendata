package com.vrem.wifianalyzer.wifi.band;

import io.github.maples.jmockk.JMockK;
import java.util.List;
import kotlin.Pair;
import org.junit.Assert;
import org.junit.Test;

public class WiFiChannelsGHZ5TestSuccess {
   @Test
   public void test_availableChannels_String_1_3240() {
      List var1 = ((WiFiChannelsGHZ5)JMockK.spyk(new WiFiChannelsGHZ5())).availableChannels("b4j437XV9YtkzFDJ7ErVs9Vs6cWZV5IxhzUnvqrnCSvToY0Xjqo");
   }

   @Test
   public void test_channelAvailable_String_int_1_3248() {
      Object var1 = ((WiFiChannelsGHZ5)JMockK.spyk(new WiFiChannelsGHZ5())).channelAvailable("tdJmg2WXRavcVpHVy", -8);
      Assert.assertEquals(new Integer(0), var1);
   }

   @Test
   public void test_wiFiChannelByFrequency_int_Pair_1_3256() {
      WiFiChannel var1 = ((WiFiChannelsGHZ5)JMockK.spyk(new WiFiChannelsGHZ5())).wiFiChannelByFrequency(-94, (Pair)JMockK.mockk(Pair.class, true));
   }

   @Test
   public void test_wiFiChannelPairFirst_String_1_3232() {
      Pair var1 = ((WiFiChannelsGHZ5)JMockK.spyk(new WiFiChannelsGHZ5())).wiFiChannelPairFirst("t36DU1985rFERNChvh-NKWi47n6CAzMzV8sb1xIP1PrRjXA7E6w");
   }

   @Test
   public void test_wiFiChannelPairs_1_3224() {
      List var1 = ((WiFiChannelsGHZ5)JMockK.spyk(new WiFiChannelsGHZ5())).wiFiChannelPairs();
   }
}