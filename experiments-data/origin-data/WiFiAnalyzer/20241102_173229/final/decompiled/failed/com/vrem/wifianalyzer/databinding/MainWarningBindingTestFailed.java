package com.vrem.wifianalyzer.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class MainWarningBindingTestFailed {
   @Test
   public void test_bind_View_1_329() {
      MainWarningBinding var1 = MainWarningBinding.bind((View)JMockK.mockk(View.class, true));
   }

   @Test
   public void test_inflate_LayoutInflater_1_309() {
      MainWarningBinding var1 = MainWarningBinding.inflate((LayoutInflater)JMockK.mockk(LayoutInflater.class, true));
   }

   @Test
   public void test_inflate_LayoutInflater_ViewGroup_boolean_1_317() {
      MainWarningBinding var1 = MainWarningBinding.inflate((LayoutInflater)JMockK.mockk(LayoutInflater.class, true), (ViewGroup)JMockK.mockk(ViewGroup.class, true), false);
   }

   @Test
   public void test_inflate_LayoutInflater_ViewGroup_boolean_2_321() {
      MainWarningBinding var1 = MainWarningBinding.inflate((LayoutInflater)JMockK.mockk(LayoutInflater.class, true), (ViewGroup)JMockK.mockk(ViewGroup.class, true), true);
   }
}