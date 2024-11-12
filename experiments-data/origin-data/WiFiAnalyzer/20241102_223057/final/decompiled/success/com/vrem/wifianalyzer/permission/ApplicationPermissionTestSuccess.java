package com.vrem.wifianalyzer.permission;

import android.app.Activity;
import io.github.maples.jmockk.JMockK;
import org.junit.Assert;
import org.junit.Test;

public class ApplicationPermissionTestSuccess {
   @Test
   public void test_check_1_2548() {
      ((ApplicationPermission)JMockK.spyk(new ApplicationPermission((Activity)JMockK.mockk(Activity.class, true), (PermissionDialog)JMockK.mockk(PermissionDialog.class, true)))).check();
   }

   @Test
   public void test_granted_1_2580() {
      Object var1 = ((ApplicationPermission)JMockK.spyk(new ApplicationPermission((Activity)JMockK.mockk(Activity.class, true), (PermissionDialog)JMockK.mockk(PermissionDialog.class, true)))).granted();
      Assert.assertEquals(new Integer(1), var1);
   }

   @Test
   public void test_granted_int_int_1_2564() {
      ApplicationPermission var10000 = (ApplicationPermission)JMockK.spyk(new ApplicationPermission((Activity)JMockK.mockk(Activity.class, true), (PermissionDialog)JMockK.mockk(PermissionDialog.class, true)));
      int[] var1 = new int[]{-53, 35, 47, 46, 82, -18, -16, -66};
      boolean var2 = var10000.granted(-90, var1);
   }
}
