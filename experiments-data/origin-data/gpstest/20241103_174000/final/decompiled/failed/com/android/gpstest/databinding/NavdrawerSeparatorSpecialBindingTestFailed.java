package com.android.gpstest.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class NavdrawerSeparatorSpecialBindingTestFailed {
   @Test
   public void test_bind_View_1_1917() {
      NavdrawerSeparatorSpecialBinding var1 = NavdrawerSeparatorSpecialBinding.bind((View)JMockK.mockk(View.class, true));
   }

   @Test
   public void test_inflate_LayoutInflater_1_1897() {
      NavdrawerSeparatorSpecialBinding var1 = NavdrawerSeparatorSpecialBinding.inflate((LayoutInflater)JMockK.mockk(LayoutInflater.class, true));
   }

   @Test
   public void test_inflate_LayoutInflater_ViewGroup_boolean_1_1905() {
      NavdrawerSeparatorSpecialBinding var1 = NavdrawerSeparatorSpecialBinding.inflate((LayoutInflater)JMockK.mockk(LayoutInflater.class, true), (ViewGroup)JMockK.mockk(ViewGroup.class, true), true);
   }

   @Test
   public void test_inflate_LayoutInflater_ViewGroup_boolean_2_1909() {
      NavdrawerSeparatorSpecialBinding var1 = NavdrawerSeparatorSpecialBinding.inflate((LayoutInflater)JMockK.mockk(LayoutInflater.class, true), (ViewGroup)JMockK.mockk(ViewGroup.class, true), false);
   }
}
