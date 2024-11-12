package com.vrem.wifianalyzer.wifi.band;

import kotlin.enums.EnumEntries;
import org.junit.Test;

public class WiFiBandTestSuccess {
   @Test
   public void test_getEntries_1_2001() {
      EnumEntries var1 = WiFiBand.getEntries();
   }

   @Test
   public void test_values_1_1993() {
      WiFiBand[] var1 = WiFiBand.values();
   }
}
