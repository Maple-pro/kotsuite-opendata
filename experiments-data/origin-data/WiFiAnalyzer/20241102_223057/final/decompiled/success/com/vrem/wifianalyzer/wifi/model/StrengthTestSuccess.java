package com.vrem.wifianalyzer.wifi.model;

import kotlin.enums.EnumEntries;
import org.junit.Test;

public class StrengthTestSuccess {
   @Test
   public void test_getEntries_1_2399() {
      EnumEntries var1 = Strength.getEntries();
   }

   @Test
   public void test_values_1_2391() {
      Strength[] var1 = Strength.values();
   }
}
