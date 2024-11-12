package com.android.gpstest.ui;

import android.app.Application;
import android.location.Location;
import androidx.lifecycle.LiveData;
import io.github.maples.jmockk.JMockK;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class BenchmarkViewModelTestSuccess {
   @Test
   public void test_addLocation_Location_1_493() {
      ((BenchmarkViewModel)JMockK.spyk(new BenchmarkViewModel((Application)JMockK.mockk(Application.class, true)))).addLocation((Location)JMockK.mockk(Location.class, true));
   }

   @Test
   public void test_getAllowGroundTruthEdit_1_421() {
      LiveData var1 = ((BenchmarkViewModel)JMockK.spyk(new BenchmarkViewModel((Application)JMockK.mockk(Application.class, true)))).getAllowGroundTruthEdit();
   }

   @Test
   public void test_getAvgError_1_457() {
      LiveData var1 = ((BenchmarkViewModel)JMockK.spyk(new BenchmarkViewModel((Application)JMockK.mockk(Application.class, true)))).getAvgError();
   }

   @Test
   public void test_getBenchmarkCardCollapsed_1_445() {
      Object var1 = ((BenchmarkViewModel)JMockK.spyk(new BenchmarkViewModel((Application)JMockK.mockk(Application.class, true)))).getBenchmarkCardCollapsed();
      Assert.assertEquals(new Integer(0), var1);
   }

   @Test
   public void test_getGroundTruthLocation_1_397() {
      LiveData var1 = ((BenchmarkViewModel)JMockK.spyk(new BenchmarkViewModel((Application)JMockK.mockk(Application.class, true)))).getGroundTruthLocation();
   }

   @Test
   public void test_getLocationErrorPair_1_469() {
      LiveData var1 = ((BenchmarkViewModel)JMockK.spyk(new BenchmarkViewModel((Application)JMockK.mockk(Application.class, true)))).getLocationErrorPair();
   }

   @Test
   public void test_getLocationErrorPairs_1_481() {
      List var1 = ((BenchmarkViewModel)JMockK.spyk(new BenchmarkViewModel((Application)JMockK.mockk(Application.class, true)))).getLocationErrorPairs();
   }

   @Test
   public void test_setBenchmarkCardCollapsed_boolean_1_433() {
      ((BenchmarkViewModel)JMockK.spyk(new BenchmarkViewModel((Application)JMockK.mockk(Application.class, true)))).setBenchmarkCardCollapsed(false);
   }
}
