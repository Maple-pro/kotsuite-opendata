package com.vrem.wifianalyzer;

import kotlin.enums.EnumEntries;
import org.junit.Test;

public class MainContextTestSuccess {
   @Test
   public void test_getEntries_1_1033() {
      EnumEntries var1 = MainContext.getEntries();
   }

   @Test
   public void test_values_1_1025() {
      MainContext[] var1 = MainContext.values();
   }
}
