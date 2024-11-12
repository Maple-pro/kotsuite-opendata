package com.vrem.wifianalyzer.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class AccessPointViewCompleteBindingTestFailed {
   @Test
   public void test_bind_View_1_217() {
      AccessPointViewCompleteBinding var1 = AccessPointViewCompleteBinding.bind((View)JMockK.mockk(View.class, true));
   }

   @Test
   public void test_inflate_LayoutInflater_1_197() {
      AccessPointViewCompleteBinding var1 = AccessPointViewCompleteBinding.inflate((LayoutInflater)JMockK.mockk(LayoutInflater.class, true));
   }

   @Test
   public void test_inflate_LayoutInflater_ViewGroup_boolean_1_205() {
      AccessPointViewCompleteBinding var1 = AccessPointViewCompleteBinding.inflate((LayoutInflater)JMockK.mockk(LayoutInflater.class, true), (ViewGroup)JMockK.mockk(ViewGroup.class, true), true);
   }

   @Test
   public void test_inflate_LayoutInflater_ViewGroup_boolean_2_209() {
      AccessPointViewCompleteBinding var1 = AccessPointViewCompleteBinding.inflate((LayoutInflater)JMockK.mockk(LayoutInflater.class, true), (ViewGroup)JMockK.mockk(ViewGroup.class, true), false);
   }
}
