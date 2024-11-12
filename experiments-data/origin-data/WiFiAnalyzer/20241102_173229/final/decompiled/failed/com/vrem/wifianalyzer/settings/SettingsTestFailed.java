package com.vrem.wifianalyzer.settings;

import com.vrem.wifianalyzer.navigation.NavigationMenu;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class SettingsTestFailed {
   @Test
   public void test_saveSelectedMenu_NavigationMenu_1_1273() {
      ((Settings)JMockK.spyk(new Settings((Repository)JMockK.mockk(Repository.class, true)))).saveSelectedMenu((NavigationMenu)JMockK.mockk(NavigationMenu.class, true));
   }

   @Test
   public void test_selectedMenu_1_1261() {
      NavigationMenu var1 = ((Settings)JMockK.spyk(new Settings((Repository)JMockK.mockk(Repository.class, true)))).selectedMenu();
   }
}
