package com.ulicae.cinelog.data;

import com.ulicae.cinelog.data.dao.DaoSession;
import com.ulicae.cinelog.data.dao.WishlistSerie;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class WishlistSerieRepositoryTestSuccess {
   @Test
   public void test_findByTmdbId_long_1_2325() {
      WishlistSerie var1 = ((WishlistSerieRepository)JMockK.spyk(new WishlistSerieRepository((DaoSession)JMockK.mockk(DaoSession.class, true)))).findByTmdbId(-43L);
   }
}
