package com.android.gpstest.view;

import android.content.Context;
import io.github.maples.jmockk.JMockK;
import java.util.List;
import org.junit.Test;

public class GpsSkyViewTestFailed {
   @Test
   public void test_getCn0InViewAvg_1_1201() {
      float var1 = ((GpsSkyView)JMockK.spyk(new GpsSkyView((Context)JMockK.mockk(Context.class, true)))).getCn0InViewAvg();
   }

   @Test
   public void test_getCn0UsedAvg_1_1213() {
      float var1 = ((GpsSkyView)JMockK.spyk(new GpsSkyView((Context)JMockK.mockk(Context.class, true)))).getCn0UsedAvg();
   }

   @Test
   public void test_getSatelliteColor_float_1_1177() {
      int var1 = ((GpsSkyView)JMockK.spyk(new GpsSkyView((Context)JMockK.mockk(Context.class, true)))).getSatelliteColor(-39.17433F);
   }

   @Test
   public void test_onOrientationChanged_double_double_1_1189() {
      ((GpsSkyView)JMockK.spyk(new GpsSkyView((Context)JMockK.mockk(Context.class, true)))).onOrientationChanged(71.18665273497109, -7.933176966017143);
   }

   @Test
   public void test_setStarted_1_1137() {
      ((GpsSkyView)JMockK.spyk(new GpsSkyView((Context)JMockK.mockk(Context.class, true)))).setStarted();
   }

   @Test
   public void test_setStatus_List_1_1161() {
      ((GpsSkyView)JMockK.spyk(new GpsSkyView((Context)JMockK.mockk(Context.class, true)))).setStatus((List)JMockK.mockk(List.class, true));
   }

   @Test
   public void test_setStopped_1_1149() {
      ((GpsSkyView)JMockK.spyk(new GpsSkyView((Context)JMockK.mockk(Context.class, true)))).setStopped();
   }
}
