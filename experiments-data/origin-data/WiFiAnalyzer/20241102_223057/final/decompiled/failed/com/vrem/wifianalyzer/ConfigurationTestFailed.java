package com.vrem.wifianalyzer;

import com.vrem.wifianalyzer.wifi.band.WiFiBand;
import io.github.maples.jmockk.JMockK;
import kotlin.Pair;
import org.junit.Test;

public class ConfigurationTestFailed {
   @Test
   public void test_wiFiChannelPair_WiFiBand_1_1705() {
      Pair var1 = ((Configuration)JMockK.spyk(new Configuration(false))).wiFiChannelPair((WiFiBand)JMockK.mockk(WiFiBand.class, true));
   }
}
