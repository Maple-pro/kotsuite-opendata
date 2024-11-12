package com.vrem.wifianalyzer.wifi.channelgraph;

import com.vrem.wifianalyzer.wifi.band.WiFiBand;
import io.github.maples.jmockk.JMockK;
import kotlin.Pair;
import org.junit.Test;

public class ChannelAxisLabelTestFailed {
   @Test
   public void test_formatLabel_double_boolean_1_4776() {
      String var1 = ((ChannelAxisLabel)JMockK.spyk(new ChannelAxisLabel((WiFiBand)JMockK.mockk(WiFiBand.class, true), (Pair)JMockK.mockk(Pair.class, true)))).formatLabel(-81.89609170868009, true);
   }
}
