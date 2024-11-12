package com.ulicae.cinelog.utils;

import com.ulicae.cinelog.data.dao.Review;
import com.ulicae.cinelog.data.dao.SerieEpisode;
import com.ulicae.cinelog.data.dao.TmdbSerie;
import com.ulicae.cinelog.data.dto.SerieDto;
import com.ulicae.cinelog.data.dto.SerieEpisodeDto;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class SerieDtoToDbBuilderTestSuccess {
   @Test
   public void test_buildReview_SerieDto_1_3509() {
      Review var1 = ((SerieDtoToDbBuilder)JMockK.spyk(new SerieDtoToDbBuilder())).buildReview((SerieDto)JMockK.mockk(SerieDto.class, true));
   }

   @Test
   public void test_buildSerieEpisode_SerieEpisodeDto_1_3533() {
      SerieEpisode var1 = ((SerieDtoToDbBuilder)JMockK.spyk(new SerieDtoToDbBuilder())).buildSerieEpisode((SerieEpisodeDto)JMockK.mockk(SerieEpisodeDto.class, true));
   }

   @Test
   public void test_buildTmdbSerie_SerieDto_1_3521() {
      TmdbSerie var1 = ((SerieDtoToDbBuilder)JMockK.spyk(new SerieDtoToDbBuilder())).buildTmdbSerie((SerieDto)JMockK.mockk(SerieDto.class, true));
   }
}
