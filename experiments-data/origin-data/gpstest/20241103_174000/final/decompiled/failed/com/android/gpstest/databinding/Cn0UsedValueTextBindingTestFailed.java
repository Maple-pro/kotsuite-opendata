package com.android.gpstest.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class Cn0UsedValueTextBindingTestFailed {
   @Test
   public void test_bind_View_1_1469() {
      Cn0UsedValueTextBinding var1 = Cn0UsedValueTextBinding.bind((View)JMockK.mockk(View.class, true));
   }

   @Test
   public void test_inflate_LayoutInflater_1_1449() {
      Cn0UsedValueTextBinding var1 = Cn0UsedValueTextBinding.inflate((LayoutInflater)JMockK.mockk(LayoutInflater.class, true));
   }

   @Test
   public void test_inflate_LayoutInflater_ViewGroup_boolean_1_1457() {
      Cn0UsedValueTextBinding var1 = Cn0UsedValueTextBinding.inflate((LayoutInflater)JMockK.mockk(LayoutInflater.class, true), (ViewGroup)JMockK.mockk(ViewGroup.class, true), true);
   }

   @Test
   public void test_inflate_LayoutInflater_ViewGroup_boolean_2_1461() {
      Cn0UsedValueTextBinding var1 = Cn0UsedValueTextBinding.inflate((LayoutInflater)JMockK.mockk(LayoutInflater.class, true), (ViewGroup)JMockK.mockk(ViewGroup.class, true), false);
   }
}
