package com.android.gpstest.ui;

import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class MainActivityTestFailed {
   @Test
   public void test_onNavigationDrawerItemSelected_int_1_625() {
      ((MainActivity)JMockK.spyk(new MainActivity())).onNavigationDrawerItemSelected(-94);
   }
}
