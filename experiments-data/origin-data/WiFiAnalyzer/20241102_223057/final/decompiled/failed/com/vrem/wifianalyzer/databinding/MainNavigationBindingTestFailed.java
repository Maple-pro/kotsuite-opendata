package com.vrem.wifianalyzer.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class MainNavigationBindingTestFailed {
   @Test
   public void test_bind_View_1_889() {
      MainNavigationBinding var1 = MainNavigationBinding.bind((View)JMockK.mockk(View.class, true));
   }

   @Test
   public void test_inflate_LayoutInflater_1_869() {
      MainNavigationBinding var1 = MainNavigationBinding.inflate((LayoutInflater)JMockK.mockk(LayoutInflater.class, true));
   }

   @Test
   public void test_inflate_LayoutInflater_ViewGroup_boolean_1_877() {
      MainNavigationBinding var1 = MainNavigationBinding.inflate((LayoutInflater)JMockK.mockk(LayoutInflater.class, true), (ViewGroup)JMockK.mockk(ViewGroup.class, true), false);
   }

   @Test
   public void test_inflate_LayoutInflater_ViewGroup_boolean_2_881() {
      MainNavigationBinding var1 = MainNavigationBinding.inflate((LayoutInflater)JMockK.mockk(LayoutInflater.class, true), (ViewGroup)JMockK.mockk(ViewGroup.class, true), true);
   }
}
