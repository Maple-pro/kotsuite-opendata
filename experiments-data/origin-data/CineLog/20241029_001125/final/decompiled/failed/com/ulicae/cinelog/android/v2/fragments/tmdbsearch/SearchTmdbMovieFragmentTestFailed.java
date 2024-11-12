package com.ulicae.cinelog.android.v2.fragments.tmdbsearch;

import android.view.View;
import io.github.maples.jmockk.JMockK;
import java.util.List;
import org.junit.Test;

public class SearchTmdbMovieFragmentTestFailed {
   @Test
   public void test_onFromScratchClick_View_1_4605() {
      ((SearchTmdbMovieFragment)JMockK.spyk(new SearchTmdbMovieFragment())).onFromScratchClick((View)JMockK.mockk(View.class, true));
   }

   @Test
   public void test_populateListView_List_1_4617() {
      ((SearchTmdbMovieFragment)JMockK.spyk(new SearchTmdbMovieFragment())).populateListView((List)JMockK.mockk(List.class, true));
   }
}
