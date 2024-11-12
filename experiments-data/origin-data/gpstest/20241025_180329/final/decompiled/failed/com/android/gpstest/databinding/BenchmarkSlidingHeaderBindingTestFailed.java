package com.android.gpstest.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class BenchmarkSlidingHeaderBindingTestFailed {
   @Test
   public void test_bind_View_1_1329() {
      BenchmarkSlidingHeaderBinding var1 = BenchmarkSlidingHeaderBinding.bind((View)JMockK.mockk(View.class, true));
   }

   @Test
   public void test_inflate_LayoutInflater_1_1309() {
      BenchmarkSlidingHeaderBinding var1 = BenchmarkSlidingHeaderBinding.inflate((LayoutInflater)JMockK.mockk(LayoutInflater.class, true));
   }

   @Test
   public void test_inflate_LayoutInflater_ViewGroup_boolean_1_1317() {
      BenchmarkSlidingHeaderBinding var1 = BenchmarkSlidingHeaderBinding.inflate((LayoutInflater)JMockK.mockk(LayoutInflater.class, true), (ViewGroup)JMockK.mockk(ViewGroup.class, true), true);
   }
}
