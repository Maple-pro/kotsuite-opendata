package com.android.gpstest.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class BenchmarkCardBindingTestFailed {
   @Test
   public void test_bind_View_1_2029() {
      BenchmarkCardBinding var1 = BenchmarkCardBinding.bind((View)JMockK.mockk(View.class, true));
   }

   @Test
   public void test_inflate_LayoutInflater_1_2009() {
      BenchmarkCardBinding var1 = BenchmarkCardBinding.inflate((LayoutInflater)JMockK.mockk(LayoutInflater.class, true));
   }

   @Test
   public void test_inflate_LayoutInflater_ViewGroup_boolean_1_2017() {
      BenchmarkCardBinding var1 = BenchmarkCardBinding.inflate((LayoutInflater)JMockK.mockk(LayoutInflater.class, true), (ViewGroup)JMockK.mockk(ViewGroup.class, true), true);
   }
}
