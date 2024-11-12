package com.vrem.wifianalyzer.wifi.model;

import com.vrem.wifianalyzer.wifi.band.WiFiChannel;
import io.github.maples.jmockk.JMockK;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class ChannelRatingTestSuccess {
   @Test
   public void test_bestChannels_List_1_3212() {
      List var1 = ((ChannelRating)JMockK.spyk(new ChannelRating())).bestChannels((List)JMockK.mockk(List.class, true));
   }

   @Test
   public void test_count_WiFiChannel_1_3168() {
      Object var1 = ((ChannelRating)JMockK.spyk(new ChannelRating())).count((WiFiChannel)JMockK.mockk(WiFiChannel.class, true));
      Assert.assertEquals(new Integer(0), var1);
   }

   @Test
   public void test_strength_WiFiChannel_1_3180() {
      Strength var1 = ((ChannelRating)JMockK.spyk(new ChannelRating())).strength((WiFiChannel)JMockK.mockk(WiFiChannel.class, true));
   }

   @Test
   public void test_wiFiDetails_1_3192() {
      List var1 = ((ChannelRating)JMockK.spyk(new ChannelRating())).wiFiDetails();
   }

   @Test
   public void test_wiFiDetails_List_1_3200() {
      ((ChannelRating)JMockK.spyk(new ChannelRating())).wiFiDetails((List)JMockK.mockk(List.class, true));
   }
}
