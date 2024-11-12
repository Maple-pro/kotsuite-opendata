package com.vrem.wifianalyzer;

import android.view.MenuItem;
import com.google.android.material.navigation.NavigationView;
import com.vrem.wifianalyzer.navigation.NavigationMenu;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class MainActivityTestFailed {
   @Test
   public void test_closeDrawer_1_945() {
      boolean var1 = ((MainActivity)JMockK.spyk(new MainActivity())).closeDrawer();
   }

   @Test
   public void test_currentMenuItem_1_961() {
      MenuItem var1 = ((MainActivity)JMockK.spyk(new MainActivity())).currentMenuItem();
   }

   @Test
   public void test_currentNavigationMenu_1_969() {
      NavigationMenu var1 = ((MainActivity)JMockK.spyk(new MainActivity())).currentNavigationMenu();
   }

   @Test
   public void test_currentNavigationMenu_NavigationMenu_1_977() {
      ((MainActivity)JMockK.spyk(new MainActivity())).currentNavigationMenu((NavigationMenu)JMockK.mockk(NavigationMenu.class, true));
   }

   @Test
   public void test_mainConnectionVisibility_int_1_997() {
      ((MainActivity)JMockK.spyk(new MainActivity())).mainConnectionVisibility(-66);
   }

   @Test
   public void test_navigationView_1_989() {
      NavigationView var1 = ((MainActivity)JMockK.spyk(new MainActivity())).navigationView();
   }

   @Test
   public void test_onNavigationItemSelected_MenuItem_1_933() {
      boolean var1 = ((MainActivity)JMockK.spyk(new MainActivity())).onNavigationItemSelected((MenuItem)JMockK.mockk(MenuItem.class, true));
   }

   @Test
   public void test_updateActionBar_1_953() {
      ((MainActivity)JMockK.spyk(new MainActivity())).updateActionBar();
   }

   @Test
   public void test_update_1_925() {
      ((MainActivity)JMockK.spyk(new MainActivity())).update();
   }
}
