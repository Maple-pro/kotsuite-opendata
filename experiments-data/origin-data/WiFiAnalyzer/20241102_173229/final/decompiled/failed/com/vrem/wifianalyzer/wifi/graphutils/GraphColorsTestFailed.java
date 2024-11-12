package com.vrem.wifianalyzer.wifi.graphutils;

import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class GraphColorsTestFailed {
   @Test
   public void test_addColor_long_1_4176() {
      ((GraphColors)JMockK.spyk(new GraphColors())).addColor(-22L);
   }

   @Test
   public void test_graphColor_1_4168() {
      GraphColor var1 = ((GraphColors)JMockK.spyk(new GraphColors())).graphColor();
   }
}
