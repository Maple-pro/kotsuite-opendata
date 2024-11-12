package com.vrem.wifianalyzer.wifi.graphutils;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.LegendRenderer;
import com.vrem.wifianalyzer.settings.ThemeStyle;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class GraphViewWrapperTestFailed {
   @Test
   public void test_newLegendRenderer_1_3960() {
      LegendRenderer var1 = ((GraphViewWrapper)JMockK.spyk(new GraphViewWrapper((GraphView)JMockK.mockk(GraphView.class, true), (GraphLegend)JMockK.mockk(GraphLegend.class, true), (ThemeStyle)JMockK.mockk(ThemeStyle.class, true), (SeriesCache)JMockK.mockk(SeriesCache.class, true), (SeriesOptions)JMockK.mockk(SeriesOptions.class, true)))).newLegendRenderer();
   }

   @Test
   public void test_updateLegend_GraphLegend_1_3816() {
      ((GraphViewWrapper)JMockK.spyk(new GraphViewWrapper((GraphView)JMockK.mockk(GraphView.class, true), (GraphLegend)JMockK.mockk(GraphLegend.class, true), (ThemeStyle)JMockK.mockk(ThemeStyle.class, true), (SeriesCache)JMockK.mockk(SeriesCache.class, true), (SeriesOptions)JMockK.mockk(SeriesOptions.class, true)))).updateLegend((GraphLegend)JMockK.mockk(GraphLegend.class, true));
   }
}
