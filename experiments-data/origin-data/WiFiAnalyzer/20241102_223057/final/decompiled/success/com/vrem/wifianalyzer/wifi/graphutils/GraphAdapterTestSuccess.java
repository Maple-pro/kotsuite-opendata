package com.vrem.wifianalyzer.wifi.graphutils;

import com.vrem.wifianalyzer.wifi.model.WiFiData;
import io.github.maples.jmockk.JMockK;
import java.util.List;
import org.junit.Test;

public class GraphAdapterTestSuccess {
   @Test
   public void test_graphViewNotifiers_1_4212() {
      List var1 = ((GraphAdapter)JMockK.spyk(new GraphAdapter((List)JMockK.mockk(List.class, true)))).graphViewNotifiers();
   }

   @Test
   public void test_graphViews_1_4184() {
      List var1 = ((GraphAdapter)JMockK.spyk(new GraphAdapter((List)JMockK.mockk(List.class, true)))).graphViews();
   }

   @Test
   public void test_update_WiFiData_1_4196() {
      ((GraphAdapter)JMockK.spyk(new GraphAdapter((List)JMockK.mockk(List.class, true)))).update((WiFiData)JMockK.mockk(WiFiData.class, true));
   }
}
