package com.ulicae.cinelog.network.task;

import com.ulicae.cinelog.android.v2.fragments.tmdbsearch.SearchTmdbFragment;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;
import retrofit2.Call;

public class NetworkTaskManagerTestSuccess {
   @Test
   public void test_createAndExecute_Call_1_4565() {
      ((NetworkTaskManager)JMockK.spyk(new NetworkTaskManager((SearchTmdbFragment)JMockK.mockk(SearchTmdbFragment.class, true), (NetworkTaskCreator)JMockK.mockk(NetworkTaskCreator.class, true)))).createAndExecute(new Call[0]);
   }
}
