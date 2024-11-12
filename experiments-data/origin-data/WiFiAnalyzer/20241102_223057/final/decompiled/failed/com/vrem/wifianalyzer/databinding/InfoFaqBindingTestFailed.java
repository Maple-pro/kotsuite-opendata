package com.vrem.wifianalyzer.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class InfoFaqBindingTestFailed {
   @Test
   public void test_bind_View_1_805() {
      InfoFaqBinding var1 = InfoFaqBinding.bind((View)JMockK.mockk(View.class, true));
   }

   @Test
   public void test_inflate_LayoutInflater_1_785() {
      InfoFaqBinding var1 = InfoFaqBinding.inflate((LayoutInflater)JMockK.mockk(LayoutInflater.class, true));
   }

   @Test
   public void test_inflate_LayoutInflater_ViewGroup_boolean_1_793() {
      InfoFaqBinding var1 = InfoFaqBinding.inflate((LayoutInflater)JMockK.mockk(LayoutInflater.class, true), (ViewGroup)JMockK.mockk(ViewGroup.class, true), true);
   }

   @Test
   public void test_inflate_LayoutInflater_ViewGroup_boolean_2_797() {
      InfoFaqBinding var1 = InfoFaqBinding.inflate((LayoutInflater)JMockK.mockk(LayoutInflater.class, true), (ViewGroup)JMockK.mockk(ViewGroup.class, true), false);
   }
}
