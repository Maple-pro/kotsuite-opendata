package com.ulicae.cinelog.network;

import android.content.Context;
import io.github.maples.jmockk.JMockK;
import java.util.List;
import org.junit.Test;

public class TmdbServiceWrapperTestSuccess {
   @Test
   public void test_tvShowEpisodes_int_List_1_4037() {
      List var1 = ((TmdbServiceWrapper)JMockK.spyk(new TmdbServiceWrapper((Context)JMockK.mockk(Context.class, true)))).tvShowEpisodes(83, (List)JMockK.mockk(List.class, true));
   }
}
