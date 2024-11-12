package com.android.gpstest.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class GpsSkyLegendCardBindingTestFailed {
   @Test
   public void test_bind_View_1_1077() {
      GpsSkyLegendCardBinding var1 = GpsSkyLegendCardBinding.bind((View)JMockK.mockk(View.class, true));
   }

   @Test
   public void test_inflate_LayoutInflater_1_1057() {
      GpsSkyLegendCardBinding var1 = GpsSkyLegendCardBinding.inflate((LayoutInflater)JMockK.mockk(LayoutInflater.class, true));
   }

   @Test
   public void test_inflate_LayoutInflater_ViewGroup_boolean_1_1065() {
      GpsSkyLegendCardBinding var1 = GpsSkyLegendCardBinding.inflate((LayoutInflater)JMockK.mockk(LayoutInflater.class, true), (ViewGroup)JMockK.mockk(ViewGroup.class, true), true);
   }

   @Test
   public void test_inflate_LayoutInflater_ViewGroup_boolean_2_1069() {
      GpsSkyLegendCardBinding var1 = GpsSkyLegendCardBinding.inflate((LayoutInflater)JMockK.mockk(LayoutInflater.class, true), (ViewGroup)JMockK.mockk(ViewGroup.class, true), false);
   }
}
