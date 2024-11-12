package com.vrem.wifianalyzer.wifi.channelgraph;

import com.vrem.wifianalyzer.wifi.band.WiFiBand;
import com.vrem.wifianalyzer.wifi.graphutils.GraphViewWrapper;
import com.vrem.wifianalyzer.wifi.model.WiFiData;
import io.github.maples.jmockk.JMockK;
import kotlin.Pair;
import org.junit.Test;

public class ChannelGraphViewTestFailed {
   @Test
   public void test_selected_1_4840() {
      boolean var1 = ((ChannelGraphView)JMockK.spyk(new ChannelGraphView((WiFiBand)JMockK.mockk(WiFiBand.class, true), (Pair)JMockK.mockk(Pair.class, true), (DataManager)JMockK.mockk(DataManager.class, true), (GraphViewWrapper)JMockK.mockk(GraphViewWrapper.class, true)))).selected();
   }

   @Test
   public void test_update_WiFiData_1_4812() {
      ((ChannelGraphView)JMockK.spyk(new ChannelGraphView((WiFiBand)JMockK.mockk(WiFiBand.class, true), (Pair)JMockK.mockk(Pair.class, true), (DataManager)JMockK.mockk(DataManager.class, true), (GraphViewWrapper)JMockK.mockk(GraphViewWrapper.class, true)))).update((WiFiData)JMockK.mockk(WiFiData.class, true));
   }
}
