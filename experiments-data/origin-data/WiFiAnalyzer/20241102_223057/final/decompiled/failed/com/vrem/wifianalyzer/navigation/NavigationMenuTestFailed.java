package com.vrem.wifianalyzer.navigation;

import kotlin.enums.EnumEntries;
import org.junit.Test;

public class NavigationMenuTestFailed {
   @Test
   public void test_getEntries_1_2100() {
      EnumEntries var1 = NavigationMenu.getEntries();
   }

   @Test
   public void test_valueOf_String_1_2096() {
      NavigationMenu var1 = NavigationMenu.valueOf("9TQ1zZNuFmPm3zklBzYahmsjOHn5KP");
   }

   @Test
   public void test_values_1_2092() {
      NavigationMenu[] var1 = NavigationMenu.values();
   }
}
