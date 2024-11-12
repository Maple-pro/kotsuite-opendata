package com.ulicae.cinelog.io.exportdb;

import android.view.View;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class ExportFragmentTestFailed {
   @Test
   public void test_onClick_View_1_4974() {
      ((ExportFragment)JMockK.spyk(new ExportFragment())).onClick((View)JMockK.mockk(View.class, true));
   }
}
