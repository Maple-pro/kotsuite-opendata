package com.ulicae.cinelog.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class FragmentMovieListBindingTestFailed {
   @Test
   public void test_bind_View_1_5645() {
      FragmentMovieListBinding var1 = FragmentMovieListBinding.bind((View)JMockK.mockk(View.class, true));
   }

   @Test
   public void test_inflate_LayoutInflater_1_5625() {
      FragmentMovieListBinding var1 = FragmentMovieListBinding.inflate((LayoutInflater)JMockK.mockk(LayoutInflater.class, true));
   }

   @Test
   public void test_inflate_LayoutInflater_ViewGroup_boolean_1_5633() {
      FragmentMovieListBinding var1 = FragmentMovieListBinding.inflate((LayoutInflater)JMockK.mockk(LayoutInflater.class, true), (ViewGroup)JMockK.mockk(ViewGroup.class, true), false);
   }

   @Test
   public void test_inflate_LayoutInflater_ViewGroup_boolean_2_5637() {
      FragmentMovieListBinding var1 = FragmentMovieListBinding.inflate((LayoutInflater)JMockK.mockk(LayoutInflater.class, true), (ViewGroup)JMockK.mockk(ViewGroup.class, true), true);
   }
}
