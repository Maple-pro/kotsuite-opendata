package com.vrem.wifianalyzer.navigation;

import android.view.MenuItem;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class NavigationMenuControllerTestFailed {
   @Test
   public void test_currentMenuItem_1_2192() {
      MenuItem var1 = ((NavigationMenuController)JMockK.spyk(new NavigationMenuController((NavigationMenuControl)JMockK.mockk(NavigationMenuControl.class, true), (NavigationView)JMockK.mockk(NavigationView.class, true), (BottomNavigationView)JMockK.mockk(BottomNavigationView.class, true)))).currentMenuItem();
   }

   @Test
   public void test_currentNavigationMenu_1_2212() {
      NavigationMenu var1 = ((NavigationMenuController)JMockK.spyk(new NavigationMenuController((NavigationMenuControl)JMockK.mockk(NavigationMenuControl.class, true), (NavigationView)JMockK.mockk(NavigationView.class, true), (BottomNavigationView)JMockK.mockk(BottomNavigationView.class, true)))).currentNavigationMenu();
   }

   @Test
   public void test_currentNavigationMenu_NavigationMenu_1_2232() {
      ((NavigationMenuController)JMockK.spyk(new NavigationMenuController((NavigationMenuControl)JMockK.mockk(NavigationMenuControl.class, true), (NavigationView)JMockK.mockk(NavigationView.class, true), (BottomNavigationView)JMockK.mockk(BottomNavigationView.class, true)))).currentNavigationMenu((NavigationMenu)JMockK.mockk(NavigationMenu.class, true));
   }
}
