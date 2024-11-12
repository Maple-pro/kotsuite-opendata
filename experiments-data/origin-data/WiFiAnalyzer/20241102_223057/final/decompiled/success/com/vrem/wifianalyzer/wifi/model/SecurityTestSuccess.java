package com.vrem.wifianalyzer.wifi.model;

import kotlin.enums.EnumEntries;
import org.junit.Test;

public class SecurityTestSuccess {
   @Test
   public void test_getEntries_1_2384() {
      EnumEntries var1 = Security.getEntries();
   }

   @Test
   public void test_values_1_2376() {
      Security[] var1 = Security.values();
   }
}
