package com.ulicae.cinelog.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class TmdbItemRowBindingTestFailed {
   @Test
   public void test_bind_View_1_5589() {
      TmdbItemRowBinding var1 = TmdbItemRowBinding.bind((View)JMockK.mockk(View.class, true));
   }

   @Test
   public void test_inflate_LayoutInflater_1_5569() {
      TmdbItemRowBinding var1 = TmdbItemRowBinding.inflate((LayoutInflater)JMockK.mockk(LayoutInflater.class, true));
   }

   @Test
   public void test_inflate_LayoutInflater_ViewGroup_boolean_1_5577() {
      TmdbItemRowBinding var1 = TmdbItemRowBinding.inflate((LayoutInflater)JMockK.mockk(LayoutInflater.class, true), (ViewGroup)JMockK.mockk(ViewGroup.class, true), true);
   }

   @Test
   public void test_inflate_LayoutInflater_ViewGroup_boolean_2_5581() {
      TmdbItemRowBinding var1 = TmdbItemRowBinding.inflate((LayoutInflater)JMockK.mockk(LayoutInflater.class, true), (ViewGroup)JMockK.mockk(ViewGroup.class, true), false);
   }
}
