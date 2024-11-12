package com.vrem.wifianalyzer.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class ChannelRatingDetailsBindingTestFailed {
   @Test
   public void test_bind_View_1_861() {
      ChannelRatingDetailsBinding var1 = ChannelRatingDetailsBinding.bind((View)JMockK.mockk(View.class, true));
   }

   @Test
   public void test_inflate_LayoutInflater_1_841() {
      ChannelRatingDetailsBinding var1 = ChannelRatingDetailsBinding.inflate((LayoutInflater)JMockK.mockk(LayoutInflater.class, true));
   }

   @Test
   public void test_inflate_LayoutInflater_ViewGroup_boolean_1_849() {
      ChannelRatingDetailsBinding var1 = ChannelRatingDetailsBinding.inflate((LayoutInflater)JMockK.mockk(LayoutInflater.class, true), (ViewGroup)JMockK.mockk(ViewGroup.class, true), false);
   }
}
