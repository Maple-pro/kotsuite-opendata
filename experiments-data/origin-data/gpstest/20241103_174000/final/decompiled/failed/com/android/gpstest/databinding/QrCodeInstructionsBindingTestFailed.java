package com.android.gpstest.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class QrCodeInstructionsBindingTestFailed {
   @Test
   public void test_bind_View_1_1889() {
      QrCodeInstructionsBinding var1 = QrCodeInstructionsBinding.bind((View)JMockK.mockk(View.class, true));
   }

   @Test
   public void test_inflate_LayoutInflater_1_1869() {
      QrCodeInstructionsBinding var1 = QrCodeInstructionsBinding.inflate((LayoutInflater)JMockK.mockk(LayoutInflater.class, true));
   }

   @Test
   public void test_inflate_LayoutInflater_ViewGroup_boolean_1_1877() {
      QrCodeInstructionsBinding var1 = QrCodeInstructionsBinding.inflate((LayoutInflater)JMockK.mockk(LayoutInflater.class, true), (ViewGroup)JMockK.mockk(ViewGroup.class, true), false);
   }
}
