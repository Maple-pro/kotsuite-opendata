package com.vrem.wifianalyzer.wifi.timegraph;

import com.jjoe64.graphview.GraphView;
import com.vrem.wifianalyzer.settings.Settings;
import com.vrem.wifianalyzer.wifi.band.WiFiBand;
import com.vrem.wifianalyzer.wifi.graphutils.GraphViewWrapper;
import io.github.maples.jmockk.JMockK;
import kotlin.jvm.functions.Function1;
import org.junit.Test;

public class TimeGraphViewTestSuccess {
   @Test
   public void test_graphView_1_4272() {
      GraphView var1 = ((TimeGraphView)JMockK.spyk(new TimeGraphView((WiFiBand)JMockK.mockk(WiFiBand.class, true), (DataManager)JMockK.mockk(DataManager.class, true), (GraphViewWrapper)JMockK.mockk(GraphViewWrapper.class, true)))).graphView();
   }

   @Test
   public void test_predicate_Settings_1_4248() {
      Function1 var1 = ((TimeGraphView)JMockK.spyk(new TimeGraphView((WiFiBand)JMockK.mockk(WiFiBand.class, true), (DataManager)JMockK.mockk(DataManager.class, true), (GraphViewWrapper)JMockK.mockk(GraphViewWrapper.class, true)))).predicate((Settings)JMockK.mockk(Settings.class, true));
   }
}
