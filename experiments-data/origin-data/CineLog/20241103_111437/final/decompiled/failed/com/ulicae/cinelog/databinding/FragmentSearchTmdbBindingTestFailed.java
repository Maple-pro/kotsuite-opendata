package com.ulicae.cinelog.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class FragmentSearchTmdbBindingTestFailed {
   @Test
   public void test_bind_View_1_4557() {
      FragmentSearchTmdbBinding var1 = FragmentSearchTmdbBinding.bind((View)JMockK.mockk(View.class, true));
   }

   @Test
   public void test_inflate_LayoutInflater_1_4537() {
      FragmentSearchTmdbBinding var1 = FragmentSearchTmdbBinding.inflate((LayoutInflater)JMockK.mockk(LayoutInflater.class, true));
   }

   @Test
   public void test_inflate_LayoutInflater_ViewGroup_boolean_1_4545() {
      FragmentSearchTmdbBinding var1 = FragmentSearchTmdbBinding.inflate((LayoutInflater)JMockK.mockk(LayoutInflater.class, true), (ViewGroup)JMockK.mockk(ViewGroup.class, true), true);
   }
}
