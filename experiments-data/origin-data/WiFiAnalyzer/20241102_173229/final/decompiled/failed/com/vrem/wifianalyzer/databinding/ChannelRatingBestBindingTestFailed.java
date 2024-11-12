package com.vrem.wifianalyzer.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class ChannelRatingBestBindingTestFailed {
   @Test
   public void test_bind_View_1_441() {
      ChannelRatingBestBinding var1 = ChannelRatingBestBinding.bind((View)JMockK.mockk(View.class, true));
   }

   @Test
   public void test_inflate_LayoutInflater_1_421() {
      ChannelRatingBestBinding var1 = ChannelRatingBestBinding.inflate((LayoutInflater)JMockK.mockk(LayoutInflater.class, true));
   }

   @Test
   public void test_inflate_LayoutInflater_ViewGroup_boolean_1_429() {
      ChannelRatingBestBinding var1 = ChannelRatingBestBinding.inflate((LayoutInflater)JMockK.mockk(LayoutInflater.class, true), (ViewGroup)JMockK.mockk(ViewGroup.class, true), true);
   }

   @Test
   public void test_inflate_LayoutInflater_ViewGroup_boolean_2_433() {
      ChannelRatingBestBinding var1 = ChannelRatingBestBinding.inflate((LayoutInflater)JMockK.mockk(LayoutInflater.class, true), (ViewGroup)JMockK.mockk(ViewGroup.class, true), false);
   }
}