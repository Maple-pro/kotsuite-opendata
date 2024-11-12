package com.ulicae.cinelog.network.task;

import android.os.AsyncTask;
import com.ulicae.cinelog.android.v2.fragments.tmdbsearch.SearchTmdbFragment;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class MovieNetworkTaskCreatorTestFailed {
   @Test
   public void test_create_SearchTmdbFragment_1_4513() {
      MovieNetworkTask var1 = ((MovieNetworkTaskCreator)JMockK.spyk(new MovieNetworkTaskCreator())).create((SearchTmdbFragment)JMockK.mockk(SearchTmdbFragment.class, true));
   }

   @Test
   public void test_create_SearchTmdbFragment_1_4525() {
      AsyncTask var1 = ((MovieNetworkTaskCreator)JMockK.spyk(new MovieNetworkTaskCreator())).create((SearchTmdbFragment)JMockK.mockk(SearchTmdbFragment.class, true));
   }
}
