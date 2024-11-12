package com.vrem.wifianalyzer.wifi.graphutils;

import com.vrem.wifianalyzer.wifi.model.WiFiDetail;
import io.github.maples.jmockk.JMockK;
import java.util.List;
import java.util.Set;
import org.junit.Assert;
import org.junit.Test;

public class SeriesCacheTestSuccess {
   @Test
   public void test_contains_WiFiDetail_1_4024() {
      Object var1 = ((SeriesCache)JMockK.spyk(new SeriesCache())).contains((WiFiDetail)JMockK.mockk(WiFiDetail.class, true));
      Assert.assertEquals(new Integer(0), var1);
   }

   @Test
   public void test_difference_Set_1_3988() {
      List var1 = ((SeriesCache)JMockK.spyk(new SeriesCache())).difference((Set)JMockK.mockk(Set.class, true));
   }

   @Test
   public void test_remove_List_1_4000() {
      List var1 = ((SeriesCache)JMockK.spyk(new SeriesCache())).remove((List)JMockK.mockk(List.class, true));
   }
}
