package com.android.gpstest.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class ActivityMainLargeScreenBindingTestFailed {
   @Test
   public void test_bind_View_1_1749() {
      ActivityMainLargeScreenBinding var1 = ActivityMainLargeScreenBinding.bind((View)JMockK.mockk(View.class, true));
   }

   @Test
   public void test_inflate_LayoutInflater_1_1729() {
      ActivityMainLargeScreenBinding var1 = ActivityMainLargeScreenBinding.inflate((LayoutInflater)JMockK.mockk(LayoutInflater.class, true));
   }

   @Test
   public void test_inflate_LayoutInflater_ViewGroup_boolean_1_1737() {
      ActivityMainLargeScreenBinding var1 = ActivityMainLargeScreenBinding.inflate((LayoutInflater)JMockK.mockk(LayoutInflater.class, true), (ViewGroup)JMockK.mockk(ViewGroup.class, true), false);
   }
}
