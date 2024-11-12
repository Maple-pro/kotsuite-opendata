package com.vrem.wifianalyzer;

import com.vrem.wifianalyzer.wifi.band.WiFiBand;
import io.github.maples.jmockk.JMockK;
import kotlin.Pair;
import org.junit.Test;

public class ConfigurationTestSuccess {
   @Test
   public void test_wiFiChannelPair_String_1_1697() {
      ((Configuration)JMockK.spyk(new Configuration(true))).wiFiChannelPair("1jQLuydqMU8byItT1SXJ3cMr34VAXWKV9A9SgZE1wjwS35pF6F5mf4Vm5yS5IOx+Odft36tjvChIpA");
   }

   @Test
   public void test_wiFiChannelPair_WiFiBand_Pair_1_1717() {
      ((Configuration)JMockK.spyk(new Configuration(false))).wiFiChannelPair((WiFiBand)JMockK.mockk(WiFiBand.class, true), (Pair)JMockK.mockk(Pair.class, true));
   }
}
