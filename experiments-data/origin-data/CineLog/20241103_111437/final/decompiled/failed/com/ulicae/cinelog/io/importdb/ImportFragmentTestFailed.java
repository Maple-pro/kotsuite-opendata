package com.ulicae.cinelog.io.importdb;

import android.view.View;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class ImportFragmentTestFailed {
   @Test
   public void test_onClick_View_1_5110() {
      ((ImportFragment)JMockK.spyk(new ImportFragment())).onClick((View)JMockK.mockk(View.class, true));
   }
}
