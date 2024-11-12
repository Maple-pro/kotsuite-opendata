package com.android.gpstest.ui;

import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class NavigationDrawerFragmentTestSuccess {
   @Test
   public void test_populateNavDrawer_1_549() {
      ((NavigationDrawerFragment)JMockK.spyk(new NavigationDrawerFragment())).populateNavDrawer();
   }
}
