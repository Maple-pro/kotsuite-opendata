package com.android.gpstest.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class GpsSkySignalMeterBindingTestFailed {
   @Test
   public void test_bind_View_1_1049() {
      GpsSkySignalMeterBinding var1 = GpsSkySignalMeterBinding.bind((View)JMockK.mockk(View.class, true));
   }

   @Test
   public void test_inflate_LayoutInflater_1_1029() {
      GpsSkySignalMeterBinding var1 = GpsSkySignalMeterBinding.inflate((LayoutInflater)JMockK.mockk(LayoutInflater.class, true));
   }

   @Test
   public void test_inflate_LayoutInflater_ViewGroup_boolean_1_1037() {
      GpsSkySignalMeterBinding var1 = GpsSkySignalMeterBinding.inflate((LayoutInflater)JMockK.mockk(LayoutInflater.class, true), (ViewGroup)JMockK.mockk(ViewGroup.class, true), true);
   }

   @Test
   public void test_inflate_LayoutInflater_ViewGroup_boolean_2_1041() {
      GpsSkySignalMeterBinding var1 = GpsSkySignalMeterBinding.inflate((LayoutInflater)JMockK.mockk(LayoutInflater.class, true), (ViewGroup)JMockK.mockk(ViewGroup.class, true), false);
   }
}
