package com.android.gpstest.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class AppBarMainBindingTestFailed {
   @Test
   public void test_bind_View_1_1637() {
      AppBarMainBinding var1 = AppBarMainBinding.bind((View)JMockK.mockk(View.class, true));
   }

   @Test
   public void test_inflate_LayoutInflater_1_1617() {
      AppBarMainBinding var1 = AppBarMainBinding.inflate((LayoutInflater)JMockK.mockk(LayoutInflater.class, true));
   }

   @Test
   public void test_inflate_LayoutInflater_ViewGroup_boolean_1_1625() {
      AppBarMainBinding var1 = AppBarMainBinding.inflate((LayoutInflater)JMockK.mockk(LayoutInflater.class, true), (ViewGroup)JMockK.mockk(ViewGroup.class, true), false);
   }

   @Test
   public void test_inflate_LayoutInflater_ViewGroup_boolean_2_1629() {
      AppBarMainBinding var1 = AppBarMainBinding.inflate((LayoutInflater)JMockK.mockk(LayoutInflater.class, true), (ViewGroup)JMockK.mockk(ViewGroup.class, true), true);
   }
}
