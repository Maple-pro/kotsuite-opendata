package com.vrem.wifianalyzer.wifi.timegraph;

import com.jjoe64.graphview.Viewport;
import io.github.maples.jmockk.JMockK;
import org.junit.Assert;
import org.junit.Test;

public class TimeAxisLabelTestSuccess {
   @Test
   public void test_formatLabel_double_boolean_1_3356() {
      Assert.assertEquals("-17", ((TimeAxisLabel)JMockK.spyk(new TimeAxisLabel())).formatLabel(-17.42830360591114, false));
   }

   @Test
   public void test_formatLabel_double_boolean_2_3359() {
      Assert.assertEquals("80", ((TimeAxisLabel)JMockK.spyk(new TimeAxisLabel())).formatLabel(79.96962614415722, true));
   }

   @Test
   public void test_setViewport_Viewport_1_3364() {
      ((TimeAxisLabel)JMockK.spyk(new TimeAxisLabel())).setViewport((Viewport)JMockK.mockk(Viewport.class, true));
   }
}
