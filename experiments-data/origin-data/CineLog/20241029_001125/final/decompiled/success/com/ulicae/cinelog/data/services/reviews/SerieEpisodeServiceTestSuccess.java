package com.ulicae.cinelog.data.services.reviews;

import com.ulicae.cinelog.data.dao.DaoSession;
import com.ulicae.cinelog.data.dto.SerieEpisodeDto;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class SerieEpisodeServiceTestSuccess {
   @Test
   public void test_delete_SerieEpisodeDto_1_3385() {
      ((SerieEpisodeService)JMockK.spyk(new SerieEpisodeService((DaoSession)JMockK.mockk(DaoSession.class, true)))).delete((SerieEpisodeDto)JMockK.mockk(SerieEpisodeDto.class, true));
   }
}
