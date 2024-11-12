package com.vrem.wifianalyzer.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class MainWifiThrottlingBindingTestFailed {
   @Test
   public void test_bind_View_1_917() {
      MainWifiThrottlingBinding var1 = MainWifiThrottlingBinding.bind((View)JMockK.mockk(View.class, true));
   }

   @Test
   public void test_inflate_LayoutInflater_1_897() {
      MainWifiThrottlingBinding var1 = MainWifiThrottlingBinding.inflate((LayoutInflater)JMockK.mockk(LayoutInflater.class, true));
   }

   @Test
   public void test_inflate_LayoutInflater_ViewGroup_boolean_1_905() {
      MainWifiThrottlingBinding var1 = MainWifiThrottlingBinding.inflate((LayoutInflater)JMockK.mockk(LayoutInflater.class, true), (ViewGroup)JMockK.mockk(ViewGroup.class, true), false);
   }
}
