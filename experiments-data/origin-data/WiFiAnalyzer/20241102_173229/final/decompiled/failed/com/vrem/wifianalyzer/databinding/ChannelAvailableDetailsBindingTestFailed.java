package com.vrem.wifianalyzer.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class ChannelAvailableDetailsBindingTestFailed {
   @Test
   public void test_bind_View_1_721() {
      ChannelAvailableDetailsBinding var1 = ChannelAvailableDetailsBinding.bind((View)JMockK.mockk(View.class, true));
   }

   @Test
   public void test_inflate_LayoutInflater_1_701() {
      ChannelAvailableDetailsBinding var1 = ChannelAvailableDetailsBinding.inflate((LayoutInflater)JMockK.mockk(LayoutInflater.class, true));
   }

   @Test
   public void test_inflate_LayoutInflater_ViewGroup_boolean_1_709() {
      ChannelAvailableDetailsBinding var1 = ChannelAvailableDetailsBinding.inflate((LayoutInflater)JMockK.mockk(LayoutInflater.class, true), (ViewGroup)JMockK.mockk(ViewGroup.class, true), false);
   }
}
