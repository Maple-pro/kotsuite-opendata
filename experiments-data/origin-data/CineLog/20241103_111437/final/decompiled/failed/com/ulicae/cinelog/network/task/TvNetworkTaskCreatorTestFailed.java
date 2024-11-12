package com.ulicae.cinelog.network.task;

import android.os.AsyncTask;
import com.ulicae.cinelog.android.v2.fragments.tmdbsearch.SearchTmdbFragment;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class TvNetworkTaskCreatorTestFailed {
   @Test
   public void test_create_SearchTmdbFragment_1_4581() {
      TvNetworkTask var1 = ((TvNetworkTaskCreator)JMockK.spyk(new TvNetworkTaskCreator())).create((SearchTmdbFragment)JMockK.mockk(SearchTmdbFragment.class, true));
   }

   @Test
   public void test_create_SearchTmdbFragment_1_4593() {
      AsyncTask var1 = ((TvNetworkTaskCreator)JMockK.spyk(new TvNetworkTaskCreator())).create((SearchTmdbFragment)JMockK.mockk(SearchTmdbFragment.class, true));
   }
}
