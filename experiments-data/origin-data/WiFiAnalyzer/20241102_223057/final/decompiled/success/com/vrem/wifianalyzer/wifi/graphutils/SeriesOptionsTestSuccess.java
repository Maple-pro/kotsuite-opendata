package com.vrem.wifianalyzer.wifi.graphutils;

import com.jjoe64.graphview.series.BaseSeries;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class SeriesOptionsTestSuccess {
   @Test
   public void test_drawBackground_BaseSeries_boolean_1_4096() {
      ((SeriesOptions)JMockK.spyk(new SeriesOptions((GraphColors)JMockK.mockk(GraphColors.class, true)))).drawBackground((BaseSeries)JMockK.mockk(BaseSeries.class, true), false);
   }

   @Test
   public void test_highlightConnected_BaseSeries_boolean_1_4064() {
      ((SeriesOptions)JMockK.spyk(new SeriesOptions((GraphColors)JMockK.mockk(GraphColors.class, true)))).highlightConnected((BaseSeries)JMockK.mockk(BaseSeries.class, true), true);
   }

   @Test
   public void test_removeSeriesColor_BaseSeries_1_4112() {
      ((SeriesOptions)JMockK.spyk(new SeriesOptions((GraphColors)JMockK.mockk(GraphColors.class, true)))).removeSeriesColor((BaseSeries)JMockK.mockk(BaseSeries.class, true));
   }

   @Test
   public void test_setSeriesColor_BaseSeries_1_4080() {
      ((SeriesOptions)JMockK.spyk(new SeriesOptions((GraphColors)JMockK.mockk(GraphColors.class, true)))).setSeriesColor((BaseSeries)JMockK.mockk(BaseSeries.class, true));
   }
}
