package com.ulicae.cinelog.data.services.reviews;

import com.ulicae.cinelog.data.dao.DaoSession;
import com.ulicae.cinelog.data.dto.SerieEpisodeDto;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class SerieEpisodeServiceTestFailed {
   @Test
   public void test_createOrUpdate_SerieEpisodeDto_1_3369() {
      SerieEpisodeDto var1 = ((SerieEpisodeService)JMockK.spyk(new SerieEpisodeService((DaoSession)JMockK.mockk(DaoSession.class, true)))).createOrUpdate((SerieEpisodeDto)JMockK.mockk(SerieEpisodeDto.class, true));
   }
}
