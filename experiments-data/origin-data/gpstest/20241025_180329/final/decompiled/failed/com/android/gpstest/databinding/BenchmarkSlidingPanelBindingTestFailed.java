package com.android.gpstest.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class BenchmarkSlidingPanelBindingTestFailed {
   @Test
   public void test_bind_View_1_1273() {
      BenchmarkSlidingPanelBinding var1 = BenchmarkSlidingPanelBinding.bind((View)JMockK.mockk(View.class, true));
   }

   @Test
   public void test_inflate_LayoutInflater_1_1253() {
      BenchmarkSlidingPanelBinding var1 = BenchmarkSlidingPanelBinding.inflate((LayoutInflater)JMockK.mockk(LayoutInflater.class, true));
   }

   @Test
   public void test_inflate_LayoutInflater_ViewGroup_boolean_1_1261() {
      BenchmarkSlidingPanelBinding var1 = BenchmarkSlidingPanelBinding.inflate((LayoutInflater)JMockK.mockk(LayoutInflater.class, true), (ViewGroup)JMockK.mockk(ViewGroup.class, true), true);
   }

   @Test
   public void test_inflate_LayoutInflater_ViewGroup_boolean_2_1265() {
      BenchmarkSlidingPanelBinding var1 = BenchmarkSlidingPanelBinding.inflate((LayoutInflater)JMockK.mockk(LayoutInflater.class, true), (ViewGroup)JMockK.mockk(ViewGroup.class, true), false);
   }
}
