package com.android.gpstest.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class ClearAssistWarningBindingTestFailed {
   @Test
   public void test_bind_View_1_1861() {
      ClearAssistWarningBinding var1 = ClearAssistWarningBinding.bind((View)JMockK.mockk(View.class, true));
   }

   @Test
   public void test_inflate_LayoutInflater_1_1841() {
      ClearAssistWarningBinding var1 = ClearAssistWarningBinding.inflate((LayoutInflater)JMockK.mockk(LayoutInflater.class, true));
   }

   @Test
   public void test_inflate_LayoutInflater_ViewGroup_boolean_1_1849() {
      ClearAssistWarningBinding var1 = ClearAssistWarningBinding.inflate((LayoutInflater)JMockK.mockk(LayoutInflater.class, true), (ViewGroup)JMockK.mockk(ViewGroup.class, true), false);
   }
}
