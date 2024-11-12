package com.vrem.wifianalyzer.wifi.graphutils;

import android.content.Context;
import com.jjoe64.graphview.GraphView;
import com.vrem.wifianalyzer.settings.ThemeStyle;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class GraphViewBuilderTestFailed {
   @Test
   public void test_build_Context_1_4128() {
      GraphView var1 = ((GraphViewBuilder)JMockK.spyk(new GraphViewBuilder(-25, -86, (ThemeStyle)JMockK.mockk(ThemeStyle.class, true), false))).build((Context)JMockK.mockk(Context.class, true));
   }

   @Test
   public void test_getMaximumPortY_1_4156() {
      int var1 = ((GraphViewBuilder)JMockK.spyk(new GraphViewBuilder(63, 57, (ThemeStyle)JMockK.mockk(ThemeStyle.class, true), false))).getMaximumPortY();
   }

   @Test
   public void test_getNumVerticalLabels_1_4144() {
      int var1 = ((GraphViewBuilder)JMockK.spyk(new GraphViewBuilder(96, 49, (ThemeStyle)JMockK.mockk(ThemeStyle.class, true), false))).getNumVerticalLabels();
   }
}
