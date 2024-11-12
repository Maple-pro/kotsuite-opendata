package com.vrem.wifianalyzer.wifi.accesspoint;

import kotlin.enums.EnumEntries;
import org.junit.Test;

public class ConnectionViewTypeTestSuccess {
   @Test
   public void test_getEntries_1_2049() {
      EnumEntries var1 = ConnectionViewType.getEntries();
   }

   @Test
   public void test_values_1_2041() {
      ConnectionViewType[] var1 = ConnectionViewType.values();
   }
}
