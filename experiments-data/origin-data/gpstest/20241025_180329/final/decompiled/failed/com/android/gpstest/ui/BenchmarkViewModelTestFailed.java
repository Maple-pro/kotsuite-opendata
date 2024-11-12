package com.android.gpstest.ui;

import android.app.Application;
import android.location.Location;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class BenchmarkViewModelTestFailed {
   @Test
   public void test_reset_1_509() {
      ((BenchmarkViewModel)JMockK.spyk(new BenchmarkViewModel((Application)JMockK.mockk(Application.class, true)))).reset();
   }

   @Test
   public void test_setAllowGroundTruthEdit_boolean_1_409() {
      ((BenchmarkViewModel)JMockK.spyk(new BenchmarkViewModel((Application)JMockK.mockk(Application.class, true)))).setAllowGroundTruthEdit(false);
   }

   @Test
   public void test_setGroundTruthLocation_Location_1_381() {
      ((BenchmarkViewModel)JMockK.spyk(new BenchmarkViewModel((Application)JMockK.mockk(Application.class, true)))).setGroundTruthLocation((Location)JMockK.mockk(Location.class, true));
   }
}
