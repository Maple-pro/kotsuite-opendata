package com.ulicae.cinelog.android.v2.fragments.review.item.serie;

import io.github.maples.jmockk.JMockK;
import java.util.List;
import org.junit.Test;

public class SerieViewEpisodesFragmentTestFailed {
   @Test
   public void test_populateEpisodeList_List_1_4629() {
      ((SerieViewEpisodesFragment)JMockK.spyk(new SerieViewEpisodesFragment())).populateEpisodeList((List)JMockK.mockk(List.class, true));
   }
}
