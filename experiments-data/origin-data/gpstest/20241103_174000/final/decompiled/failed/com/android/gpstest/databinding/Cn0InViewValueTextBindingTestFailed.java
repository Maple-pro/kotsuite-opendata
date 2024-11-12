package com.android.gpstest.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class Cn0InViewValueTextBindingTestFailed {
   @Test
   public void test_bind_View_1_1497() {
      Cn0InViewValueTextBinding var1 = Cn0InViewValueTextBinding.bind((View)JMockK.mockk(View.class, true));
   }

   @Test
   public void test_inflate_LayoutInflater_1_1477() {
      Cn0InViewValueTextBinding var1 = Cn0InViewValueTextBinding.inflate((LayoutInflater)JMockK.mockk(LayoutInflater.class, true));
   }

   @Test
   public void test_inflate_LayoutInflater_ViewGroup_boolean_1_1485() {
      Cn0InViewValueTextBinding var1 = Cn0InViewValueTextBinding.inflate((LayoutInflater)JMockK.mockk(LayoutInflater.class, true), (ViewGroup)JMockK.mockk(ViewGroup.class, true), false);
   }

   @Test
   public void test_inflate_LayoutInflater_ViewGroup_boolean_2_1489() {
      Cn0InViewValueTextBinding var1 = Cn0InViewValueTextBinding.inflate((LayoutInflater)JMockK.mockk(LayoutInflater.class, true), (ViewGroup)JMockK.mockk(ViewGroup.class, true), true);
   }
}
