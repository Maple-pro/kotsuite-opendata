package com.vrem.wifianalyzer.wifi.timegraph;

import com.jjoe64.graphview.Viewport;
import io.github.maples.jmockk.JMockK;
import org.junit.Assert;
import org.junit.Test;

public class TimeAxisLabelTestSuccess {
   @Test
   public void test_formatLabel_double_boolean_1_3356() {
      Assert.assertEquals("-80", ((TimeAxisLabel)JMockK.spyk(new TimeAxisLabel())).formatLabel(-80.16477452354387, false));
   }

   @Test
   public void test_formatLabel_double_boolean_2_3359() {
      String var1 = ((TimeAxisLabel)JMockK.spyk(new TimeAxisLabel())).formatLabel(46.80070974562935, false);
   }

   @Test
   public void test_setViewport_Viewport_1_3364() {
      ((TimeAxisLabel)JMockK.spyk(new TimeAxisLabel())).setViewport((Viewport)JMockK.mockk(Viewport.class, true));
   }
}
