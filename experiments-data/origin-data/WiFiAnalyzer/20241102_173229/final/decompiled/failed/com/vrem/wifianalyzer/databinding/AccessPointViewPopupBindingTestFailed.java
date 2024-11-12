package com.vrem.wifianalyzer.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class AccessPointViewPopupBindingTestFailed {
   @Test
   public void test_bind_View_1_301() {
      AccessPointViewPopupBinding var1 = AccessPointViewPopupBinding.bind((View)JMockK.mockk(View.class, true));
   }

   @Test
   public void test_inflate_LayoutInflater_1_281() {
      AccessPointViewPopupBinding var1 = AccessPointViewPopupBinding.inflate((LayoutInflater)JMockK.mockk(LayoutInflater.class, true));
   }

   @Test
   public void test_inflate_LayoutInflater_ViewGroup_boolean_1_289() {
      AccessPointViewPopupBinding var1 = AccessPointViewPopupBinding.inflate((LayoutInflater)JMockK.mockk(LayoutInflater.class, true), (ViewGroup)JMockK.mockk(ViewGroup.class, true), true);
   }
}
