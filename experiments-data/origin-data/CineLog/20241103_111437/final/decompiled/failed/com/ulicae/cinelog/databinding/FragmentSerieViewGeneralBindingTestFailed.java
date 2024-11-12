package com.ulicae.cinelog.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class FragmentSerieViewGeneralBindingTestFailed {
   @Test
   public void test_bind_View_1_5785() {
      FragmentSerieViewGeneralBinding var1 = FragmentSerieViewGeneralBinding.bind((View)JMockK.mockk(View.class, true));
   }

   @Test
   public void test_inflate_LayoutInflater_1_5765() {
      FragmentSerieViewGeneralBinding var1 = FragmentSerieViewGeneralBinding.inflate((LayoutInflater)JMockK.mockk(LayoutInflater.class, true));
   }

   @Test
   public void test_inflate_LayoutInflater_ViewGroup_boolean_1_5773() {
      FragmentSerieViewGeneralBinding var1 = FragmentSerieViewGeneralBinding.inflate((LayoutInflater)JMockK.mockk(LayoutInflater.class, true), (ViewGroup)JMockK.mockk(ViewGroup.class, true), true);
   }
}
