package com.ulicae.cinelog.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class LayoutReviewItemKinoBindingTestFailed {
   @Test
   public void test_bind_View_1_5757() {
      LayoutReviewItemKinoBinding var1 = LayoutReviewItemKinoBinding.bind((View)JMockK.mockk(View.class, true));
   }

   @Test
   public void test_inflate_LayoutInflater_1_5737() {
      LayoutReviewItemKinoBinding var1 = LayoutReviewItemKinoBinding.inflate((LayoutInflater)JMockK.mockk(LayoutInflater.class, true));
   }

   @Test
   public void test_inflate_LayoutInflater_ViewGroup_boolean_1_5745() {
      LayoutReviewItemKinoBinding var1 = LayoutReviewItemKinoBinding.inflate((LayoutInflater)JMockK.mockk(LayoutInflater.class, true), (ViewGroup)JMockK.mockk(ViewGroup.class, true), false);
   }
}
