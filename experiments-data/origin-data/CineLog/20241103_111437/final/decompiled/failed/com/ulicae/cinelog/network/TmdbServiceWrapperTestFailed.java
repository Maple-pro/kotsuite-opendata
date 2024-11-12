package com.ulicae.cinelog.network;

import android.content.Context;
import io.github.maples.jmockk.JMockK;
import java.util.List;
import org.junit.Test;
import retrofit2.Call;

public class TmdbServiceWrapperTestFailed {
   @Test
   public void test_searchTvShowById_int_1_4053() {
      Call var1 = ((TmdbServiceWrapper)JMockK.spyk(new TmdbServiceWrapper((Context)JMockK.mockk(Context.class, true)))).searchTvShowById(-61);
   }

   @Test
   public void test_searchTv_String_1_4013() {
      Call var1 = ((TmdbServiceWrapper)JMockK.spyk(new TmdbServiceWrapper((Context)JMockK.mockk(Context.class, true)))).searchTv("djJpLOSLjOhJC78PDT3QcRkIS+r0O9n5atk-M1JBGN+uKwWo4SxuSXuEV+pUCZLw+Kb");
   }

   @Test
   public void test_search_String_1_4001() {
      Call var1 = ((TmdbServiceWrapper)JMockK.spyk(new TmdbServiceWrapper((Context)JMockK.mockk(Context.class, true)))).search("yum8B43xtdhP1P58VNai9PBkffnpVCFsuJt-07vi8wLtbIfaQM+GvxNOOlfwXKJ");
   }

   @Test
   public void test_tvShowSeasons_int_1_4025() {
      List var1 = ((TmdbServiceWrapper)JMockK.spyk(new TmdbServiceWrapper((Context)JMockK.mockk(Context.class, true)))).tvShowSeasons(54);
   }
}
