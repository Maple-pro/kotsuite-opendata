package com.vrem.wifianalyzer.permission;

import android.app.Activity;
import io.github.maples.jmockk.JMockK;
import org.junit.Assert;
import org.junit.Test;

public class PermissionServiceTestSuccess {
   @Test
   public void test_check_1_1601() {
      ((PermissionService)JMockK.spyk(new PermissionService((Activity)JMockK.mockk(Activity.class, true), (LocationPermission)JMockK.mockk(LocationPermission.class, true), (ApplicationPermission)JMockK.mockk(ApplicationPermission.class, true)))).check();
   }

   @Test
   public void test_enabled_1_1561() {
      Object var1 = ((PermissionService)JMockK.spyk(new PermissionService((Activity)JMockK.mockk(Activity.class, true), (LocationPermission)JMockK.mockk(LocationPermission.class, true), (ApplicationPermission)JMockK.mockk(ApplicationPermission.class, true)))).enabled();
      Assert.assertEquals(new Integer(0), var1);
   }

   @Test
   public void test_granted_int_int_1_1621() {
      PermissionService var10000 = (PermissionService)JMockK.spyk(new PermissionService((Activity)JMockK.mockk(Activity.class, true), (LocationPermission)JMockK.mockk(LocationPermission.class, true), (ApplicationPermission)JMockK.mockk(ApplicationPermission.class, true)));
      int[] var1 = new int[]{78, -3, -30, 92};
      boolean var2 = var10000.granted(-71, var1);
   }

   @Test
   public void test_locationEnabled_1_1581() {
      Object var1 = ((PermissionService)JMockK.spyk(new PermissionService((Activity)JMockK.mockk(Activity.class, true), (LocationPermission)JMockK.mockk(LocationPermission.class, true), (ApplicationPermission)JMockK.mockk(ApplicationPermission.class, true)))).locationEnabled();
      Assert.assertEquals(new Integer(0), var1);
   }

   @Test
   public void test_permissionGranted_1_1641() {
      Object var1 = ((PermissionService)JMockK.spyk(new PermissionService((Activity)JMockK.mockk(Activity.class, true), (LocationPermission)JMockK.mockk(LocationPermission.class, true), (ApplicationPermission)JMockK.mockk(ApplicationPermission.class, true)))).permissionGranted();
      Assert.assertEquals(new Integer(0), var1);
   }
}
