package com.vrem.wifianalyzer.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class InfoLocationBindingTestFailed {
   @Test
   public void test_bind_View_1_469() {
      InfoLocationBinding var1 = InfoLocationBinding.bind((View)JMockK.mockk(View.class, true));
   }

   @Test
   public void test_inflate_LayoutInflater_1_449() {
      InfoLocationBinding var1 = InfoLocationBinding.inflate((LayoutInflater)JMockK.mockk(LayoutInflater.class, true));
   }

   @Test
   public void test_inflate_LayoutInflater_ViewGroup_boolean_1_457() {
      InfoLocationBinding var1 = InfoLocationBinding.inflate((LayoutInflater)JMockK.mockk(LayoutInflater.class, true), (ViewGroup)JMockK.mockk(ViewGroup.class, true), false);
   }

   @Test
   public void test_inflate_LayoutInflater_ViewGroup_boolean_2_461() {
      InfoLocationBinding var1 = InfoLocationBinding.inflate((LayoutInflater)JMockK.mockk(LayoutInflater.class, true), (ViewGroup)JMockK.mockk(ViewGroup.class, true), true);
   }
}