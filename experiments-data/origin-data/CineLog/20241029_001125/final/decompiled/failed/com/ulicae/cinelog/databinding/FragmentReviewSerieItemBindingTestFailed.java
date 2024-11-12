package com.ulicae.cinelog.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class FragmentReviewSerieItemBindingTestFailed {
   @Test
   public void test_bind_View_1_5673() {
      FragmentReviewSerieItemBinding var1 = FragmentReviewSerieItemBinding.bind((View)JMockK.mockk(View.class, true));
   }

   @Test
   public void test_inflate_LayoutInflater_1_5653() {
      FragmentReviewSerieItemBinding var1 = FragmentReviewSerieItemBinding.inflate((LayoutInflater)JMockK.mockk(LayoutInflater.class, true));
   }

   @Test
   public void test_inflate_LayoutInflater_ViewGroup_boolean_1_5661() {
      FragmentReviewSerieItemBinding var1 = FragmentReviewSerieItemBinding.inflate((LayoutInflater)JMockK.mockk(LayoutInflater.class, true), (ViewGroup)JMockK.mockk(ViewGroup.class, true), true);
   }
}
