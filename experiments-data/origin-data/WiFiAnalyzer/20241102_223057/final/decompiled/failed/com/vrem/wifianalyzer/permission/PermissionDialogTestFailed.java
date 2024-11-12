package com.vrem.wifianalyzer.permission;

import android.app.Activity;
import android.view.View;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class PermissionDialogTestFailed {
   @Test
   public void test_show_1_2820() {
      View var1 = ((PermissionDialog)JMockK.spyk(new PermissionDialog((Activity)JMockK.mockk(Activity.class, true)))).show();
   }
}
