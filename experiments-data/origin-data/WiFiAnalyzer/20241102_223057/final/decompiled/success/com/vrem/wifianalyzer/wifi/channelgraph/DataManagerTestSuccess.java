package com.vrem.wifianalyzer.wifi.channelgraph;

import com.vrem.wifianalyzer.wifi.graphutils.GraphDataPoint;
import com.vrem.wifianalyzer.wifi.graphutils.GraphViewWrapper;
import com.vrem.wifianalyzer.wifi.model.WiFiDetail;
import io.github.maples.jmockk.JMockK;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import org.junit.Test;

public class DataManagerTestSuccess {
   @Test
   public void test_addSeriesData_GraphViewWrapper_Set_int_1_4944() {
      ((DataManager)JMockK.spyk(new DataManager())).addSeriesData((GraphViewWrapper)JMockK.mockk(GraphViewWrapper.class, true), (Set)JMockK.mockk(Set.class, true), -74);
   }

   @Test
   public void test_graphDataPoints_WiFiDetail_int_1_4932() {
      GraphDataPoint[] var1 = ((DataManager)JMockK.spyk(new DataManager())).graphDataPoints((WiFiDetail)JMockK.mockk(WiFiDetail.class, true), 36);
   }

   @Test
   public void test_newSeries_List_Pair_1_4916() {
      Set var1 = ((DataManager)JMockK.spyk(new DataManager())).newSeries((List)JMockK.mockk(List.class, true), (Pair)JMockK.mockk(Pair.class, true));
   }
}
