package com.ulicae.cinelog.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class ReviewListYearRowBindingTestFailed {
   @Test
   public void test_bind_View_1_6009() {
      ReviewListYearRowBinding var1 = ReviewListYearRowBinding.bind((View)JMockK.mockk(View.class, true));
   }

   @Test
   public void test_inflate_LayoutInflater_1_5989() {
      ReviewListYearRowBinding var1 = ReviewListYearRowBinding.inflate((LayoutInflater)JMockK.mockk(LayoutInflater.class, true));
   }

   @Test
   public void test_inflate_LayoutInflater_ViewGroup_boolean_1_5997() {
      ReviewListYearRowBinding var1 = ReviewListYearRowBinding.inflate((LayoutInflater)JMockK.mockk(LayoutInflater.class, true), (ViewGroup)JMockK.mockk(ViewGroup.class, true), true);
   }
}
