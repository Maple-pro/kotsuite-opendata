package com.ulicae.cinelog.network;

import android.content.Context;
import io.github.maples.jmockk.JMockK;
import java.util.List;
import org.junit.Test;
import retrofit2.Call;

public class TmdbServiceWrapperTestFailed {
   @Test
   public void test_searchTvShowById_int_1_4053() {
      Call var1 = ((TmdbServiceWrapper)JMockK.spyk(new TmdbServiceWrapper((Context)JMockK.mockk(Context.class, true)))).searchTvShowById(28);
   }

   @Test
   public void test_searchTv_String_1_4013() {
      Call var1 = ((TmdbServiceWrapper)JMockK.spyk(new TmdbServiceWrapper((Context)JMockK.mockk(Context.class, true)))).searchTv("NMuLjREX8nylm4VjYRYePIY");
   }

   @Test
   public void test_search_String_1_4001() {
      Call var1 = ((TmdbServiceWrapper)JMockK.spyk(new TmdbServiceWrapper((Context)JMockK.mockk(Context.class, true)))).search("3WsljM6N3pHH64QBbssylSZ2uo90nTzyDSaDSpvxEitg8mjfj");
   }

   @Test
   public void test_tvShowEpisodes_int_List_1_4037() {
      List var1 = ((TmdbServiceWrapper)JMockK.spyk(new TmdbServiceWrapper((Context)JMockK.mockk(Context.class, true)))).tvShowEpisodes(-100, (List)JMockK.mockk(List.class, true));
   }

   @Test
   public void test_tvShowSeasons_int_1_4025() {
      List var1 = ((TmdbServiceWrapper)JMockK.spyk(new TmdbServiceWrapper((Context)JMockK.mockk(Context.class, true)))).tvShowSeasons(-92);
   }
}
