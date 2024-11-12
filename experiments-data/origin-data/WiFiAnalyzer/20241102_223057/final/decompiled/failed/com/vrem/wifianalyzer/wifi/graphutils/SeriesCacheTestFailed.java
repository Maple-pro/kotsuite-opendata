package com.vrem.wifianalyzer.wifi.graphutils;

import com.jjoe64.graphview.series.BaseSeries;
import com.jjoe64.graphview.series.Series;
import com.vrem.wifianalyzer.wifi.model.WiFiDetail;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class SeriesCacheTestFailed {
   @Test
   public void test_find_Series_1_4012() {
      WiFiDetail var1 = ((SeriesCache)JMockK.spyk(new SeriesCache())).find((Series)JMockK.mockk(Series.class, true));
   }

   @Test
   public void test_get_WiFiDetail_1_4036() {
      BaseSeries var1 = ((SeriesCache)JMockK.spyk(new SeriesCache())).get((WiFiDetail)JMockK.mockk(WiFiDetail.class, true));
   }

   @Test
   public void test_put_WiFiDetail_BaseSeries_1_4048() {
      BaseSeries var1 = ((SeriesCache)JMockK.spyk(new SeriesCache())).put((WiFiDetail)JMockK.mockk(WiFiDetail.class, true), (BaseSeries)JMockK.mockk(BaseSeries.class, true));
   }
}
