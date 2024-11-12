package com.vrem.wifianalyzer.wifi.band;

import io.github.maples.jmockk.JMockK;
import java.util.List;
import kotlin.Pair;
import org.junit.Assert;
import org.junit.Test;

public class WiFiChannelsGHZ2TestSuccess {
   @Test
   public void test_availableChannels_String_1_3328() {
      List var1 = ((WiFiChannelsGHZ2)JMockK.spyk(new WiFiChannelsGHZ2())).availableChannels("cdItG8sNWC8DFXccmVN0ZFOisXO");
   }

   @Test
   public void test_channelAvailable_String_int_1_3336() {
      Object var1 = ((WiFiChannelsGHZ2)JMockK.spyk(new WiFiChannelsGHZ2())).channelAvailable("ki8-IEkpuVwhy3J1XO28KlIGUYmJDHRpttNm9KwV37lZB-uJGQZY-UoDh", 72);
      Assert.assertEquals(new Integer(0), var1);
   }

   @Test
   public void test_wiFiChannelByFrequency_int_Pair_1_3344() {
      WiFiChannel var1 = ((WiFiChannelsGHZ2)JMockK.spyk(new WiFiChannelsGHZ2())).wiFiChannelByFrequency(16, (Pair)JMockK.mockk(Pair.class, true));
   }

   @Test
   public void test_wiFiChannelPairFirst_String_1_3320() {
      Pair var1 = ((WiFiChannelsGHZ2)JMockK.spyk(new WiFiChannelsGHZ2())).wiFiChannelPairFirst("ts51PMJgm5csukWAbH9st8jVKoYSUyTvHiSl3bSvbEJv3-GpqPKdNO0yrSEW");
   }

   @Test
   public void test_wiFiChannelPairs_1_3312() {
      List var1 = ((WiFiChannelsGHZ2)JMockK.spyk(new WiFiChannelsGHZ2())).wiFiChannelPairs();
   }
}
