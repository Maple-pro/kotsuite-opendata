package com.android.gpstest.ui;

import androidx.drawerlayout.widget.DrawerLayout;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class NavigationDrawerFragmentTestFailed {
   @Test
   public void test_selectItem_int_1_533() {
      ((NavigationDrawerFragment)JMockK.spyk(new NavigationDrawerFragment())).selectItem(-4);
   }

   @Test
   public void test_setSavedPosition_int_1_541() {
      ((NavigationDrawerFragment)JMockK.spyk(new NavigationDrawerFragment())).setSavedPosition(-64);
   }

   @Test
   public void test_setUp_int_DrawerLayout_1_521() {
      ((NavigationDrawerFragment)JMockK.spyk(new NavigationDrawerFragment())).setUp(62, (DrawerLayout)JMockK.mockk(DrawerLayout.class, true));
   }
}
