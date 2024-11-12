package com.ulicae.cinelog.data;

import com.ulicae.cinelog.data.dao.DaoSession;
import com.ulicae.cinelog.data.dao.WishlistMovie;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class WishlistMovieRepositoryTestSuccess {
   @Test
   public void test_findByTmdbId_long_1_3345() {
      WishlistMovie var1 = ((WishlistMovieRepository)JMockK.spyk(new WishlistMovieRepository((DaoSession)JMockK.mockk(DaoSession.class, true)))).findByTmdbId(-72L);
   }
}
