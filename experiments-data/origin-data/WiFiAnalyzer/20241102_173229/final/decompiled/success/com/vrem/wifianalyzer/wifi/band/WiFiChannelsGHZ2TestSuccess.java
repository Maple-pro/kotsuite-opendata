package com.vrem.wifianalyzer.wifi.band;

import io.github.maples.jmockk.JMockK;
import java.util.List;
import kotlin.Pair;
import org.junit.Assert;
import org.junit.Test;

public class WiFiChannelsGHZ2TestSuccess {
   @Test
   public void test_availableChannels_String_1_3328() {
      List var1 = ((WiFiChannelsGHZ2)JMockK.spyk(new WiFiChannelsGHZ2())).availableChannels("DJTuHigysafSdNdzrvV-wY2gew5ucFLJcxgD8tNK0+JNUtLkvgy2RnS8Kn6ZnFGxWoqFogvbCAo8QPFrSv5j1z8cQdk9dt");
   }

   @Test
   public void test_channelAvailable_String_int_1_3336() {
      Object var1 = ((WiFiChannelsGHZ2)JMockK.spyk(new WiFiChannelsGHZ2())).channelAvailable("G4X-suDJqB795A1ZoqgrjTXCHCV88zV3fG7LZsrIZqfrqjG+0fnd2oCvxLAL9NZxeSUGJBtdOH6UM1oya4bXlCnxwPvo", 40);
      Assert.assertEquals(new Integer(0), var1);
   }

   @Test
   public void test_wiFiChannelByFrequency_int_Pair_1_3344() {
      WiFiChannel var1 = ((WiFiChannelsGHZ2)JMockK.spyk(new WiFiChannelsGHZ2())).wiFiChannelByFrequency(-1, (Pair)JMockK.mockk(Pair.class, true));
   }

   @Test
   public void test_wiFiChannelPairFirst_String_1_3320() {
      Pair var1 = ((WiFiChannelsGHZ2)JMockK.spyk(new WiFiChannelsGHZ2())).wiFiChannelPairFirst("lLmYumtfLoEJJGKoO5xCjsN02Dyd8VPX1eusqUdfTsYjOtZi2w4rbd1dUOA9Eg");
   }

   @Test
   public void test_wiFiChannelPairs_1_3312() {
      List var1 = ((WiFiChannelsGHZ2)JMockK.spyk(new WiFiChannelsGHZ2())).wiFiChannelPairs();
   }
}
