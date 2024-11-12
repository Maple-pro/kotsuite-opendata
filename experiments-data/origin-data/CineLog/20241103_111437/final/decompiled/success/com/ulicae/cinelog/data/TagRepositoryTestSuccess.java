package com.ulicae.cinelog.data;

import com.ulicae.cinelog.data.dao.DaoSession;
import io.github.maples.jmockk.JMockK;
import java.util.List;
import org.junit.Test;

public class TagRepositoryTestSuccess {
   @Test
   public void test_findMovieTags_1_4065() {
      List var1 = ((TagRepository)JMockK.spyk(new TagRepository((DaoSession)JMockK.mockk(DaoSession.class, true)))).findMovieTags();
   }

   @Test
   public void test_findSeriesTags_1_4077() {
      List var1 = ((TagRepository)JMockK.spyk(new TagRepository((DaoSession)JMockK.mockk(DaoSession.class, true)))).findSeriesTags();
   }
}
