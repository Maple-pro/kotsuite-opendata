package com.vrem.wifianalyzer.wifi.timegraph;

import com.vrem.wifianalyzer.wifi.band.WiFiBand;
import com.vrem.wifianalyzer.wifi.graphutils.GraphViewWrapper;
import com.vrem.wifianalyzer.wifi.model.WiFiData;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class TimeGraphViewTestFailed {
   @Test
   public void test_update_WiFiData_1_4224() {
      ((TimeGraphView)JMockK.spyk(new TimeGraphView((WiFiBand)JMockK.mockk(WiFiBand.class, true), (DataManager)JMockK.mockk(DataManager.class, true), (GraphViewWrapper)JMockK.mockk(GraphViewWrapper.class, true)))).update((WiFiData)JMockK.mockk(WiFiData.class, true));
   }
}
