package com.ulicae.cinelog.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class ContentExportDbBindingTestFailed {
   @Test
   public void test_bind_View_1_5062() {
      ContentExportDbBinding var1 = ContentExportDbBinding.bind((View)JMockK.mockk(View.class, true));
   }

   @Test
   public void test_inflate_LayoutInflater_1_5042() {
      ContentExportDbBinding var1 = ContentExportDbBinding.inflate((LayoutInflater)JMockK.mockk(LayoutInflater.class, true));
   }

   @Test
   public void test_inflate_LayoutInflater_ViewGroup_boolean_1_5050() {
      ContentExportDbBinding var1 = ContentExportDbBinding.inflate((LayoutInflater)JMockK.mockk(LayoutInflater.class, true), (ViewGroup)JMockK.mockk(ViewGroup.class, true), true);
   }

   @Test
   public void test_inflate_LayoutInflater_ViewGroup_boolean_2_5054() {
      ContentExportDbBinding var1 = ContentExportDbBinding.inflate((LayoutInflater)JMockK.mockk(LayoutInflater.class, true), (ViewGroup)JMockK.mockk(ViewGroup.class, true), false);
   }
}
