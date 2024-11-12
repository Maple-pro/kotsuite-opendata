package com.ulicae.cinelog.data;

import com.ulicae.cinelog.data.dao.DaoSession;
import com.ulicae.cinelog.data.dao.SerieEpisode;
import io.github.maples.jmockk.JMockK;
import java.util.List;
import org.junit.Test;

public class SerieEpisodeRepositoryTestSuccess {
   @Test
   public void test_createOrReplace_SerieEpisode_1_3433() {
      ((SerieEpisodeRepository)JMockK.spyk(new SerieEpisodeRepository((DaoSession)JMockK.mockk(DaoSession.class, true)))).createOrReplace((SerieEpisode)JMockK.mockk(SerieEpisode.class, true));
   }

   @Test
   public void test_findByTmdbSerieId_long_1_3421() {
      List var1 = ((SerieEpisodeRepository)JMockK.spyk(new SerieEpisodeRepository((DaoSession)JMockK.mockk(DaoSession.class, true)))).findByTmdbSerieId(-95L);
   }
}
