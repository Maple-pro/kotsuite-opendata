package com.ulicae.cinelog.data;

import com.ulicae.cinelog.data.dao.DaoSession;
import com.ulicae.cinelog.data.dao.SerieReview;
import io.github.maples.jmockk.JMockK;
import java.util.List;
import org.junit.Test;

public class SerieReviewRepositoryTestSuccess {
   @Test
   public void test_findAllByRating_boolean_1_3793() {
      List var1 = ((SerieReviewRepository)JMockK.spyk(new SerieReviewRepository((DaoSession)JMockK.mockk(DaoSession.class, true)))).findAllByRating(true);
   }

   @Test
   public void test_findAllByTitle_boolean_1_3805() {
      List var1 = ((SerieReviewRepository)JMockK.spyk(new SerieReviewRepository((DaoSession)JMockK.mockk(DaoSession.class, true)))).findAllByTitle(false);
   }

   @Test
   public void test_findAllByTitle_boolean_2_3809() {
      List var1 = ((SerieReviewRepository)JMockK.spyk(new SerieReviewRepository((DaoSession)JMockK.mockk(DaoSession.class, true)))).findAllByTitle(true);
   }

   @Test
   public void test_findByMovieId_long_1_3781() {
      SerieReview var1 = ((SerieReviewRepository)JMockK.spyk(new SerieReviewRepository((DaoSession)JMockK.mockk(DaoSession.class, true)))).findByMovieId(-14L);
   }
}
