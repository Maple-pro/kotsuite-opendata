package com.vrem.wifianalyzer.wifi.band;

import io.github.maples.jmockk.JMockK;
import java.util.List;
import kotlin.Pair;
import org.junit.Assert;
import org.junit.Test;

public class WiFiChannelsGHZ6TestSuccess {
   @Test
   public void test_availableChannels_String_1_3284() {
      List var1 = ((WiFiChannelsGHZ6)JMockK.spyk(new WiFiChannelsGHZ6())).availableChannels("yd+4I57oAMpc5wJPbJDEtOf1irEPwFbq7FK6euLNQLOLcfGevxco0QJzw-mqBwliIWu4Ab3ufkgIOg");
   }

   @Test
   public void test_channelAvailable_String_int_1_3292() {
      Object var1 = ((WiFiChannelsGHZ6)JMockK.spyk(new WiFiChannelsGHZ6())).channelAvailable("2d7", -51);
      Assert.assertEquals(new Integer(0), var1);
   }

   @Test
   public void test_wiFiChannelByFrequency_int_Pair_1_3300() {
      WiFiChannel var1 = ((WiFiChannelsGHZ6)JMockK.spyk(new WiFiChannelsGHZ6())).wiFiChannelByFrequency(-12, (Pair)JMockK.mockk(Pair.class, true));
   }

   @Test
   public void test_wiFiChannelPairFirst_String_1_3276() {
      Pair var1 = ((WiFiChannelsGHZ6)JMockK.spyk(new WiFiChannelsGHZ6())).wiFiChannelPairFirst("40");
   }

   @Test
   public void test_wiFiChannelPairs_1_3268() {
      List var1 = ((WiFiChannelsGHZ6)JMockK.spyk(new WiFiChannelsGHZ6())).wiFiChannelPairs();
   }
}
