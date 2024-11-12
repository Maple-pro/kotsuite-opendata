package com.vrem.wifianalyzer.wifi.timegraph;

import com.vrem.wifianalyzer.wifi.graphutils.GraphViewWrapper;
import com.vrem.wifianalyzer.wifi.model.WiFiDetail;
import io.github.maples.jmockk.JMockK;
import java.util.List;
import java.util.Set;
import org.junit.Test;

public class DataManagerTestSuccess {
   @Test
   public void test_addData_GraphViewWrapper_WiFiDetail_int_1_3432() {
      ((DataManager)JMockK.spyk(new DataManager((TimeGraphCache)JMockK.mockk(TimeGraphCache.class, true)))).addData((GraphViewWrapper)JMockK.mockk(GraphViewWrapper.class, true), (WiFiDetail)JMockK.mockk(WiFiDetail.class, true), 63);
   }

   @Test
   public void test_addSeriesData_GraphViewWrapper_List_int_1_3376() {
      Set var1 = ((DataManager)JMockK.spyk(new DataManager((TimeGraphCache)JMockK.mockk(TimeGraphCache.class, true)))).addSeriesData((GraphViewWrapper)JMockK.mockk(GraphViewWrapper.class, true), (List)JMockK.mockk(List.class, true), -89);
   }

   @Test
   public void test_adjustData_GraphViewWrapper_Set_1_3396() {
      ((DataManager)JMockK.spyk(new DataManager((TimeGraphCache)JMockK.mockk(TimeGraphCache.class, true)))).adjustData((GraphViewWrapper)JMockK.mockk(GraphViewWrapper.class, true), (Set)JMockK.mockk(Set.class, true));
   }

   @Test
   public void test_newSeries_Set_1_3416() {
      Set var1 = ((DataManager)JMockK.spyk(new DataManager((TimeGraphCache)JMockK.mockk(TimeGraphCache.class, true)))).newSeries((Set)JMockK.mockk(Set.class, true));
   }
}
