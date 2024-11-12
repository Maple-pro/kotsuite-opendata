package com.vrem.wifianalyzer.wifi.channelgraph;

import com.jjoe64.graphview.GraphView;
import com.vrem.wifianalyzer.settings.Settings;
import com.vrem.wifianalyzer.wifi.band.WiFiBand;
import com.vrem.wifianalyzer.wifi.graphutils.GraphViewWrapper;
import io.github.maples.jmockk.JMockK;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import org.junit.Test;

public class ChannelGraphViewTestSuccess {
   @Test
   public void test_graphView_1_4892() {
      GraphView var1 = ((ChannelGraphView)JMockK.spyk(new ChannelGraphView((WiFiBand)JMockK.mockk(WiFiBand.class, true), (Pair)JMockK.mockk(Pair.class, true), (DataManager)JMockK.mockk(DataManager.class, true), (GraphViewWrapper)JMockK.mockk(GraphViewWrapper.class, true)))).graphView();
   }

   @Test
   public void test_predicate_Settings_1_4864() {
      Function1 var1 = ((ChannelGraphView)JMockK.spyk(new ChannelGraphView((WiFiBand)JMockK.mockk(WiFiBand.class, true), (Pair)JMockK.mockk(Pair.class, true), (DataManager)JMockK.mockk(DataManager.class, true), (GraphViewWrapper)JMockK.mockk(GraphViewWrapper.class, true)))).predicate((Settings)JMockK.mockk(Settings.class, true));
   }
}
