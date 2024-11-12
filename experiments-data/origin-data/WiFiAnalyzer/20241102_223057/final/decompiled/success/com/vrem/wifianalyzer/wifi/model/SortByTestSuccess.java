package com.vrem.wifianalyzer.wifi.model;

import kotlin.enums.EnumEntries;
import org.junit.Test;

public class SortByTestSuccess {
   @Test
   public void test_getEntries_1_2013() {
      EnumEntries var1 = SortBy.getEntries();
   }

   @Test
   public void test_values_1_2005() {
      SortBy[] var1 = SortBy.values();
   }
}
