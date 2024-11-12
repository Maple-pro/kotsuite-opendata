package com.vrem.wifianalyzer.wifi.graphutils;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.BaseSeries;
import com.vrem.wifianalyzer.settings.ThemeStyle;
import com.vrem.wifianalyzer.wifi.model.WiFiDetail;
import io.github.maples.jmockk.JMockK;
import java.util.List;
import java.util.Set;
import org.junit.Assert;
import org.junit.Test;

public class GraphViewWrapperTestSuccess {
   @Test
   public void test_addSeries_BaseSeries_1_3784() {
      ((GraphViewWrapper)JMockK.spyk(new GraphViewWrapper((GraphView)JMockK.mockk(GraphView.class, true), (GraphLegend)JMockK.mockk(GraphLegend.class, true), (ThemeStyle)JMockK.mockk(ThemeStyle.class, true), (SeriesCache)JMockK.mockk(SeriesCache.class, true), (SeriesOptions)JMockK.mockk(SeriesOptions.class, true)))).addSeries((BaseSeries)JMockK.mockk(BaseSeries.class, true));
   }

   @Test
   public void test_addSeries_WiFiDetail_BaseSeries_boolean_1_3564() {
      Object var1 = ((GraphViewWrapper)JMockK.spyk(new GraphViewWrapper((GraphView)JMockK.mockk(GraphView.class, true), (GraphLegend)JMockK.mockk(GraphLegend.class, true), (ThemeStyle)JMockK.mockk(ThemeStyle.class, true), (SeriesCache)JMockK.mockk(SeriesCache.class, true), (SeriesOptions)JMockK.mockk(SeriesOptions.class, true)))).addSeries((WiFiDetail)JMockK.mockk(WiFiDetail.class, true), (BaseSeries)JMockK.mockk(BaseSeries.class, true), false);
      Assert.assertEquals(new Integer(1), var1);
   }

   @Test
   public void test_appendToSeries_WiFiDetail_GraphDataPoint_int_boolean_1_3632() {
      Object var1 = ((GraphViewWrapper)JMockK.spyk(new GraphViewWrapper((GraphView)JMockK.mockk(GraphView.class, true), (GraphLegend)JMockK.mockk(GraphLegend.class, true), (ThemeStyle)JMockK.mockk(ThemeStyle.class, true), (SeriesCache)JMockK.mockk(SeriesCache.class, true), (SeriesOptions)JMockK.mockk(SeriesOptions.class, true)))).appendToSeries((WiFiDetail)JMockK.mockk(WiFiDetail.class, true), (GraphDataPoint)JMockK.mockk(GraphDataPoint.class, true), -17, true);
      Assert.assertEquals(new Integer(0), var1);
   }

   @Test
   public void test_calculateGraphType_1_3848() {
      Object var1 = ((GraphViewWrapper)JMockK.spyk(new GraphViewWrapper((GraphView)JMockK.mockk(GraphView.class, true), (GraphLegend)JMockK.mockk(GraphLegend.class, true), (ThemeStyle)JMockK.mockk(ThemeStyle.class, true), (SeriesCache)JMockK.mockk(SeriesCache.class, true), (SeriesOptions)JMockK.mockk(SeriesOptions.class, true)))).calculateGraphType();
      Assert.assertEquals(new Integer(1147798476), var1);
   }

   @Test
   public void test_differenceSeries_Set_1_3532() {
      List var1 = ((GraphViewWrapper)JMockK.spyk(new GraphViewWrapper((GraphView)JMockK.mockk(GraphView.class, true), (GraphLegend)JMockK.mockk(GraphLegend.class, true), (ThemeStyle)JMockK.mockk(ThemeStyle.class, true), (SeriesCache)JMockK.mockk(SeriesCache.class, true), (SeriesOptions)JMockK.mockk(SeriesOptions.class, true)))).differenceSeries((Set)JMockK.mockk(Set.class, true));
   }

   @Test
   public void test_getViewportCntX_1_3756() {
      Object var1 = ((GraphViewWrapper)JMockK.spyk(new GraphViewWrapper((GraphView)JMockK.mockk(GraphView.class, true), (GraphLegend)JMockK.mockk(GraphLegend.class, true), (ThemeStyle)JMockK.mockk(ThemeStyle.class, true), (SeriesCache)JMockK.mockk(SeriesCache.class, true), (SeriesOptions)JMockK.mockk(SeriesOptions.class, true)))).getViewportCntX();
      Assert.assertEquals(new Integer(-1), var1);
   }

   @Test
   public void test_newSeries_WiFiDetail_1_3668() {
      Object var1 = ((GraphViewWrapper)JMockK.spyk(new GraphViewWrapper((GraphView)JMockK.mockk(GraphView.class, true), (GraphLegend)JMockK.mockk(GraphLegend.class, true), (ThemeStyle)JMockK.mockk(ThemeStyle.class, true), (SeriesCache)JMockK.mockk(SeriesCache.class, true), (SeriesOptions)JMockK.mockk(SeriesOptions.class, true)))).newSeries((WiFiDetail)JMockK.mockk(WiFiDetail.class, true));
      Assert.assertEquals(new Integer(1), var1);
   }

   @Test
   public void test_removeSeries_Set_1_3500() {
      ((GraphViewWrapper)JMockK.spyk(new GraphViewWrapper((GraphView)JMockK.mockk(GraphView.class, true), (GraphLegend)JMockK.mockk(GraphLegend.class, true), (ThemeStyle)JMockK.mockk(ThemeStyle.class, true), (SeriesCache)JMockK.mockk(SeriesCache.class, true), (SeriesOptions)JMockK.mockk(SeriesOptions.class, true)))).removeSeries((Set)JMockK.mockk(Set.class, true));
   }

   @Test
   public void test_setHorizontalLabelsVisible_boolean_1_3876() {
      ((GraphViewWrapper)JMockK.spyk(new GraphViewWrapper((GraphView)JMockK.mockk(GraphView.class, true), (GraphLegend)JMockK.mockk(GraphLegend.class, true), (ThemeStyle)JMockK.mockk(ThemeStyle.class, true), (SeriesCache)JMockK.mockk(SeriesCache.class, true), (SeriesOptions)JMockK.mockk(SeriesOptions.class, true)))).setHorizontalLabelsVisible(false);
   }

   @Test
   public void test_setViewport_1_3700() {
      ((GraphViewWrapper)JMockK.spyk(new GraphViewWrapper((GraphView)JMockK.mockk(GraphView.class, true), (GraphLegend)JMockK.mockk(GraphLegend.class, true), (ThemeStyle)JMockK.mockk(ThemeStyle.class, true), (SeriesCache)JMockK.mockk(SeriesCache.class, true), (SeriesOptions)JMockK.mockk(SeriesOptions.class, true)))).setViewport();
   }

   @Test
   public void test_setViewport_int_int_1_3728() {
      ((GraphViewWrapper)JMockK.spyk(new GraphViewWrapper((GraphView)JMockK.mockk(GraphView.class, true), (GraphLegend)JMockK.mockk(GraphLegend.class, true), (ThemeStyle)JMockK.mockk(ThemeStyle.class, true), (SeriesCache)JMockK.mockk(SeriesCache.class, true), (SeriesOptions)JMockK.mockk(SeriesOptions.class, true)))).setViewport(-4, 93);
   }

   @Test
   public void test_size_int_1_3932() {
      Object var1 = ((GraphViewWrapper)JMockK.spyk(new GraphViewWrapper((GraphView)JMockK.mockk(GraphView.class, true), (GraphLegend)JMockK.mockk(GraphLegend.class, true), (ThemeStyle)JMockK.mockk(ThemeStyle.class, true), (SeriesCache)JMockK.mockk(SeriesCache.class, true), (SeriesOptions)JMockK.mockk(SeriesOptions.class, true)))).size(-83);
      Assert.assertEquals(new Integer(1024), var1);
   }

   @Test
   public void test_updateSeries_WiFiDetail_GraphDataPoint_boolean_1_3600() {
      boolean var1 = ((GraphViewWrapper)JMockK.spyk(new GraphViewWrapper((GraphView)JMockK.mockk(GraphView.class, true), (GraphLegend)JMockK.mockk(GraphLegend.class, true), (ThemeStyle)JMockK.mockk(ThemeStyle.class, true), (SeriesCache)JMockK.mockk(SeriesCache.class, true), (SeriesOptions)JMockK.mockk(SeriesOptions.class, true)))).updateSeries((WiFiDetail)JMockK.mockk(WiFiDetail.class, true), new GraphDataPoint[0], false);
   }

   @Test
   public void test_visibility_int_1_3904() {
      ((GraphViewWrapper)JMockK.spyk(new GraphViewWrapper((GraphView)JMockK.mockk(GraphView.class, true), (GraphLegend)JMockK.mockk(GraphLegend.class, true), (ThemeStyle)JMockK.mockk(ThemeStyle.class, true), (SeriesCache)JMockK.mockk(SeriesCache.class, true), (SeriesOptions)JMockK.mockk(SeriesOptions.class, true)))).visibility(-6);
   }
}
