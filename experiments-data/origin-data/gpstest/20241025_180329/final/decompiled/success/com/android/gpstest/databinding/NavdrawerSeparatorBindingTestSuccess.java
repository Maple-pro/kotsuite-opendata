package com.android.gpstest.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class NavdrawerSeparatorBindingTestSuccess {
   @Test
   public void test_bind_View_1_1385() {
      NavdrawerSeparatorBinding var1 = NavdrawerSeparatorBinding.bind((View)JMockK.mockk(View.class, true));
   }

   @Test
   public void test_inflate_LayoutInflater_1_1365() {
      NavdrawerSeparatorBinding var1 = NavdrawerSeparatorBinding.inflate((LayoutInflater)JMockK.mockk(LayoutInflater.class, true));
   }

   @Test
   public void test_inflate_LayoutInflater_ViewGroup_boolean_1_1373() {
      NavdrawerSeparatorBinding var1 = NavdrawerSeparatorBinding.inflate((LayoutInflater)JMockK.mockk(LayoutInflater.class, true), (ViewGroup)JMockK.mockk(ViewGroup.class, true), true);
   }
}
