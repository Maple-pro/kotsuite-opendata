package com.vrem.wifianalyzer.navigation.options;

import kotlin.enums.EnumEntries;
import org.junit.Test;

public class OptionActionTestSuccess {
   @Test
   public void test_getEntries_1_5000() {
      EnumEntries var1 = OptionAction.getEntries();
   }

   @Test
   public void test_values_1_4992() {
      OptionAction[] var1 = OptionAction.values();
   }
}
