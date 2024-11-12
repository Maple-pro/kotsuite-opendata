package com.ulicae.cinelog.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class FragmentSerieViewEpisodesBindingTestFailed {
   @Test
   public void test_bind_View_1_4661() {
      FragmentSerieViewEpisodesBinding var1 = FragmentSerieViewEpisodesBinding.bind((View)JMockK.mockk(View.class, true));
   }

   @Test
   public void test_inflate_LayoutInflater_1_4641() {
      FragmentSerieViewEpisodesBinding var1 = FragmentSerieViewEpisodesBinding.inflate((LayoutInflater)JMockK.mockk(LayoutInflater.class, true));
   }

   @Test
   public void test_inflate_LayoutInflater_ViewGroup_boolean_1_4649() {
      FragmentSerieViewEpisodesBinding var1 = FragmentSerieViewEpisodesBinding.inflate((LayoutInflater)JMockK.mockk(LayoutInflater.class, true), (ViewGroup)JMockK.mockk(ViewGroup.class, true), true);
   }

   @Test
   public void test_inflate_LayoutInflater_ViewGroup_boolean_2_4653() {
      FragmentSerieViewEpisodesBinding var1 = FragmentSerieViewEpisodesBinding.inflate((LayoutInflater)JMockK.mockk(LayoutInflater.class, true), (ViewGroup)JMockK.mockk(ViewGroup.class, true), false);
   }
}
