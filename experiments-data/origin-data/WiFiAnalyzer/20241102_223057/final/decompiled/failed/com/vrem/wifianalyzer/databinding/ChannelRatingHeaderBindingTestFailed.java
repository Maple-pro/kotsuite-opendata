package com.vrem.wifianalyzer.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class ChannelRatingHeaderBindingTestFailed {
   @Test
   public void test_bind_View_1_357() {
      ChannelRatingHeaderBinding var1 = ChannelRatingHeaderBinding.bind((View)JMockK.mockk(View.class, true));
   }

   @Test
   public void test_inflate_LayoutInflater_1_337() {
      ChannelRatingHeaderBinding var1 = ChannelRatingHeaderBinding.inflate((LayoutInflater)JMockK.mockk(LayoutInflater.class, true));
   }

   @Test
   public void test_inflate_LayoutInflater_ViewGroup_boolean_1_345() {
      ChannelRatingHeaderBinding var1 = ChannelRatingHeaderBinding.inflate((LayoutInflater)JMockK.mockk(LayoutInflater.class, true), (ViewGroup)JMockK.mockk(ViewGroup.class, true), true);
   }

   @Test
   public void test_inflate_LayoutInflater_ViewGroup_boolean_2_349() {
      ChannelRatingHeaderBinding var1 = ChannelRatingHeaderBinding.inflate((LayoutInflater)JMockK.mockk(LayoutInflater.class, true), (ViewGroup)JMockK.mockk(ViewGroup.class, true), false);
   }
}
