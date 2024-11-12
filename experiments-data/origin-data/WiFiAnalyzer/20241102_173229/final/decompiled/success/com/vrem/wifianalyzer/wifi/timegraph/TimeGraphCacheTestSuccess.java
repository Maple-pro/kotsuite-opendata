package com.vrem.wifianalyzer.wifi.timegraph;

import com.vrem.wifianalyzer.wifi.model.WiFiDetail;
import io.github.maples.jmockk.JMockK;
import java.util.Set;
import org.junit.Test;

public class TimeGraphCacheTestSuccess {
   @Test
   public void test_active_1_3452() {
      Set var1 = ((TimeGraphCache)JMockK.spyk(new TimeGraphCache())).active();
   }

   @Test
   public void test_add_WiFiDetail_1_3468() {
      ((TimeGraphCache)JMockK.spyk(new TimeGraphCache())).add((WiFiDetail)JMockK.mockk(WiFiDetail.class, true));
   }

   @Test
   public void test_clear_1_3460() {
      ((TimeGraphCache)JMockK.spyk(new TimeGraphCache())).clear();
   }

   @Test
   public void test_getWiFiDetails_1_3492() {
      Set var1 = ((TimeGraphCache)JMockK.spyk(new TimeGraphCache())).getWiFiDetails();
   }

   @Test
   public void test_reset_WiFiDetail_1_3480() {
      ((TimeGraphCache)JMockK.spyk(new TimeGraphCache())).reset((WiFiDetail)JMockK.mockk(WiFiDetail.class, true));
   }
}
