package com.android.gpstest.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class ShareUploadBindingTestFailed {
   @Test
   public void test_bind_View_1_2001() {
      ShareUploadBinding var1 = ShareUploadBinding.bind((View)JMockK.mockk(View.class, true));
   }

   @Test
   public void test_inflate_LayoutInflater_1_1981() {
      ShareUploadBinding var1 = ShareUploadBinding.inflate((LayoutInflater)JMockK.mockk(LayoutInflater.class, true));
   }

   @Test
   public void test_inflate_LayoutInflater_ViewGroup_boolean_1_1989() {
      ShareUploadBinding var1 = ShareUploadBinding.inflate((LayoutInflater)JMockK.mockk(LayoutInflater.class, true), (ViewGroup)JMockK.mockk(ViewGroup.class, true), true);
   }
}
