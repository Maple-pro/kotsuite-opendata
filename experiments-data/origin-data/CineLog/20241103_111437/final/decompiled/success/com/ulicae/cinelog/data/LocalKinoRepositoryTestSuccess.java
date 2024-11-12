package com.ulicae.cinelog.data;

import com.ulicae.cinelog.data.dao.DaoSession;
import com.ulicae.cinelog.data.dao.LocalKino;
import io.github.maples.jmockk.JMockK;
import java.util.List;
import org.junit.Test;

public class LocalKinoRepositoryTestSuccess {
   @Test
   public void test_findAllByRating_boolean_1_2417() {
      List var1 = ((LocalKinoRepository)JMockK.spyk(new LocalKinoRepository((DaoSession)JMockK.mockk(DaoSession.class, true)))).findAllByRating(false);
   }

   @Test
   public void test_findAllByReviewDate_boolean_1_2441() {
      List var1 = ((LocalKinoRepository)JMockK.spyk(new LocalKinoRepository((DaoSession)JMockK.mockk(DaoSession.class, true)))).findAllByReviewDate(false);
   }

   @Test
   public void test_findAllByTitle_boolean_1_2453() {
      List var1 = ((LocalKinoRepository)JMockK.spyk(new LocalKinoRepository((DaoSession)JMockK.mockk(DaoSession.class, true)))).findAllByTitle(false);
   }

   @Test
   public void test_findAllByTitle_boolean_2_2457() {
      List var1 = ((LocalKinoRepository)JMockK.spyk(new LocalKinoRepository((DaoSession)JMockK.mockk(DaoSession.class, true)))).findAllByTitle(true);
   }

   @Test
   public void test_findAllByYear_boolean_1_2429() {
      List var1 = ((LocalKinoRepository)JMockK.spyk(new LocalKinoRepository((DaoSession)JMockK.mockk(DaoSession.class, true)))).findAllByYear(false);
   }

   @Test
   public void test_findByMovieId_long_1_2405() {
      LocalKino var1 = ((LocalKinoRepository)JMockK.spyk(new LocalKinoRepository((DaoSession)JMockK.mockk(DaoSession.class, true)))).findByMovieId(39L);
   }
}
