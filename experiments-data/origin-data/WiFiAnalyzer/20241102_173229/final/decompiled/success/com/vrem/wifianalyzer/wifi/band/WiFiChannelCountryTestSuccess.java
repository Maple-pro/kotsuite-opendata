package com.vrem.wifianalyzer.wifi.band;

import io.github.maples.jmockk.JMockK;
import java.util.Locale;
import java.util.SortedSet;
import org.junit.Assert;
import org.junit.Test;

public class WiFiChannelCountryTestSuccess {
   @Test
   public void test_channelAvailableGHZ2_int_1_2488() {
      Object var1 = ((WiFiChannelCountry)JMockK.spyk(new WiFiChannelCountry((Locale)JMockK.mockk(Locale.class, true)))).channelAvailableGHZ2(-17);
      Assert.assertEquals(new Integer(0), var1);
   }

   @Test
   public void test_channelAvailableGHZ5_int_1_2500() {
      Object var1 = ((WiFiChannelCountry)JMockK.spyk(new WiFiChannelCountry((Locale)JMockK.mockk(Locale.class, true)))).channelAvailableGHZ5(29);
      Assert.assertEquals(new Integer(0), var1);
   }

   @Test
   public void test_channelAvailableGHZ6_int_1_2512() {
      Object var1 = ((WiFiChannelCountry)JMockK.spyk(new WiFiChannelCountry((Locale)JMockK.mockk(Locale.class, true)))).channelAvailableGHZ6(76);
      Assert.assertEquals(new Integer(0), var1);
   }

   @Test
   public void test_channelsGHZ2_1_2452() {
      SortedSet var1 = ((WiFiChannelCountry)JMockK.spyk(new WiFiChannelCountry((Locale)JMockK.mockk(Locale.class, true)))).channelsGHZ2();
   }

   @Test
   public void test_channelsGHZ5_1_2464() {
      SortedSet var1 = ((WiFiChannelCountry)JMockK.spyk(new WiFiChannelCountry((Locale)JMockK.mockk(Locale.class, true)))).channelsGHZ5();
   }

   @Test
   public void test_channelsGHZ6_1_2476() {
      SortedSet var1 = ((WiFiChannelCountry)JMockK.spyk(new WiFiChannelCountry((Locale)JMockK.mockk(Locale.class, true)))).channelsGHZ6();
   }

   @Test
   public void test_countryCode_1_2424() {
      String var1 = ((WiFiChannelCountry)JMockK.spyk(new WiFiChannelCountry((Locale)JMockK.mockk(Locale.class, true)))).countryCode();
   }

   @Test
   public void test_countryName_Locale_1_2436() {
      Assert.assertEquals("-Unknown", ((WiFiChannelCountry)JMockK.spyk(new WiFiChannelCountry((Locale)JMockK.mockk(Locale.class, true)))).countryName((Locale)JMockK.mockk(Locale.class, true)));
   }
}
