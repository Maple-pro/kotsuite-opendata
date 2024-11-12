package com.vrem.wifianalyzer.wifi.channelgraph;

import com.jjoe64.graphview.Viewport;
import com.vrem.wifianalyzer.wifi.band.WiFiBand;
import io.github.maples.jmockk.JMockK;
import kotlin.Pair;
import org.junit.Assert;
import org.junit.Test;

public class ChannelAxisLabelTestSuccess {
   @Test
   public void test_formatLabel_double_boolean_1_4776() {
      Assert.assertEquals("-60", ((ChannelAxisLabel)JMockK.spyk(new ChannelAxisLabel((WiFiBand)JMockK.mockk(WiFiBand.class, true), (Pair)JMockK.mockk(Pair.class, true)))).formatLabel(-60.01363570288134, false));
   }

   @Test
   public void test_setViewport_Viewport_1_4792() {
      ((ChannelAxisLabel)JMockK.spyk(new ChannelAxisLabel((WiFiBand)JMockK.mockk(WiFiBand.class, true), (Pair)JMockK.mockk(Pair.class, true)))).setViewport((Viewport)JMockK.mockk(Viewport.class, true));
   }
}
