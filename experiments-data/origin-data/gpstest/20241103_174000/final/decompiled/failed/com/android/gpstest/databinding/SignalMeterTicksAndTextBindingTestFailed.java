package com.android.gpstest.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class SignalMeterTicksAndTextBindingTestFailed {
   @Test
   public void test_bind_View_1_1525() {
      SignalMeterTicksAndTextBinding var1 = SignalMeterTicksAndTextBinding.bind((View)JMockK.mockk(View.class, true));
   }

   @Test
   public void test_inflate_LayoutInflater_1_1505() {
      SignalMeterTicksAndTextBinding var1 = SignalMeterTicksAndTextBinding.inflate((LayoutInflater)JMockK.mockk(LayoutInflater.class, true));
   }

   @Test
   public void test_inflate_LayoutInflater_ViewGroup_boolean_1_1513() {
      SignalMeterTicksAndTextBinding var1 = SignalMeterTicksAndTextBinding.inflate((LayoutInflater)JMockK.mockk(LayoutInflater.class, true), (ViewGroup)JMockK.mockk(ViewGroup.class, true), false);
   }
}
