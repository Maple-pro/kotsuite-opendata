package com.vrem.wifianalyzer.wifi.filter;

import android.app.AlertDialog;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class FilterTestFailed {
   @Test
   public void test_show_1_2832() {
      ((Filter)JMockK.spyk(new Filter((AlertDialog)JMockK.mockk(AlertDialog.class, true)))).show();
   }
}
