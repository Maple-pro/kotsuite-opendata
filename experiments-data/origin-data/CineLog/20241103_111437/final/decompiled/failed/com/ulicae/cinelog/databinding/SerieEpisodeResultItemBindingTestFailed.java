package com.ulicae.cinelog.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class SerieEpisodeResultItemBindingTestFailed {
   @Test
   public void test_bind_View_1_5841() {
      SerieEpisodeResultItemBinding var1 = SerieEpisodeResultItemBinding.bind((View)JMockK.mockk(View.class, true));
   }

   @Test
   public void test_inflate_LayoutInflater_1_5821() {
      SerieEpisodeResultItemBinding var1 = SerieEpisodeResultItemBinding.inflate((LayoutInflater)JMockK.mockk(LayoutInflater.class, true));
   }

   @Test
   public void test_inflate_LayoutInflater_ViewGroup_boolean_1_5829() {
      SerieEpisodeResultItemBinding var1 = SerieEpisodeResultItemBinding.inflate((LayoutInflater)JMockK.mockk(LayoutInflater.class, true), (ViewGroup)JMockK.mockk(ViewGroup.class, true), true);
   }

   @Test
   public void test_inflate_LayoutInflater_ViewGroup_boolean_2_5833() {
      SerieEpisodeResultItemBinding var1 = SerieEpisodeResultItemBinding.inflate((LayoutInflater)JMockK.mockk(LayoutInflater.class, true), (ViewGroup)JMockK.mockk(ViewGroup.class, true), false);
   }
}
