package com.vrem.wifianalyzer.wifi.graphutils;

import kotlin.enums.EnumEntries;
import org.junit.Test;

public class GraphLegendTestSuccess {
   @Test
   public void test_getEntries_1_2064() {
      EnumEntries var1 = GraphLegend.getEntries();
   }

   @Test
   public void test_values_1_2056() {
      GraphLegend[] var1 = GraphLegend.values();
   }
}
