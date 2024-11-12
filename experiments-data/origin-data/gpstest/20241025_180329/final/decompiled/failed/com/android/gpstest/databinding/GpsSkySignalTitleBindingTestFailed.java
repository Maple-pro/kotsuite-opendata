package com.android.gpstest.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class GpsSkySignalTitleBindingTestFailed {
   @Test
   public void test_bind_View_1_1441() {
      GpsSkySignalTitleBinding var1 = GpsSkySignalTitleBinding.bind((View)JMockK.mockk(View.class, true));
   }

   @Test
   public void test_inflate_LayoutInflater_1_1421() {
      GpsSkySignalTitleBinding var1 = GpsSkySignalTitleBinding.inflate((LayoutInflater)JMockK.mockk(LayoutInflater.class, true));
   }

   @Test
   public void test_inflate_LayoutInflater_ViewGroup_boolean_1_1429() {
      GpsSkySignalTitleBinding var1 = GpsSkySignalTitleBinding.inflate((LayoutInflater)JMockK.mockk(LayoutInflater.class, true), (ViewGroup)JMockK.mockk(ViewGroup.class, true), false);
   }
}
