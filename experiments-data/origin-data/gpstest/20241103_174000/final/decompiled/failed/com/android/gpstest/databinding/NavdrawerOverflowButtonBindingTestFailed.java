package com.android.gpstest.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class NavdrawerOverflowButtonBindingTestFailed {
   @Test
   public void test_bind_View_1_1945() {
      NavdrawerOverflowButtonBinding var1 = NavdrawerOverflowButtonBinding.bind((View)JMockK.mockk(View.class, true));
   }

   @Test
   public void test_inflate_LayoutInflater_1_1925() {
      NavdrawerOverflowButtonBinding var1 = NavdrawerOverflowButtonBinding.inflate((LayoutInflater)JMockK.mockk(LayoutInflater.class, true));
   }

   @Test
   public void test_inflate_LayoutInflater_ViewGroup_boolean_1_1933() {
      NavdrawerOverflowButtonBinding var1 = NavdrawerOverflowButtonBinding.inflate((LayoutInflater)JMockK.mockk(LayoutInflater.class, true), (ViewGroup)JMockK.mockk(ViewGroup.class, true), false);
   }

   @Test
   public void test_inflate_LayoutInflater_ViewGroup_boolean_2_1937() {
      NavdrawerOverflowButtonBinding var1 = NavdrawerOverflowButtonBinding.inflate((LayoutInflater)JMockK.mockk(LayoutInflater.class, true), (ViewGroup)JMockK.mockk(ViewGroup.class, true), true);
   }
}
