package com.ulicae.cinelog.android.v2.fragments.tmdbsearch;

import io.github.maples.jmockk.JMockK;
import java.util.List;
import org.junit.Test;

public class SearchTmbdSerieFragmentTestFailed {
   @Test
   public void test_populateListView_List_1_4669() {
      ((SearchTmbdSerieFragment)JMockK.spyk(new SearchTmbdSerieFragment())).populateListView((List)JMockK.mockk(List.class, true));
   }
}
