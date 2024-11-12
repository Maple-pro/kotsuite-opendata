package com.vrem.wifianalyzer.permission;

import android.app.Activity;
import io.github.maples.jmockk.JMockK;
import org.junit.Assert;
import org.junit.Test;

public class LocationPermissionTestSuccess {
   @Test
   public void test_enabled_1_2644() {
      Object var1 = ((LocationPermission)JMockK.spyk(new LocationPermission((Activity)JMockK.mockk(Activity.class, true)))).enabled();
      Assert.assertEquals(new Integer(1), var1);
   }
}
