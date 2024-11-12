package com.ulicae.cinelog.data.dto;

import com.ulicae.cinelog.data.dao.SerieEpisode;
import com.uwetrottmann.tmdb2.entities.TvEpisode;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class SerieEpisodeDtoBuilderTestFailed {
   @Test
   public void test_buildFromTvAndDb_SerieEpisode_TvEpisode_1_3465() {
      SerieEpisodeDto var1 = ((SerieEpisodeDtoBuilder)JMockK.spyk(new SerieEpisodeDtoBuilder())).buildFromTvAndDb((SerieEpisode)JMockK.mockk(SerieEpisode.class, true), (TvEpisode)JMockK.mockk(TvEpisode.class, true));
   }

   @Test
   public void test_build_TvEpisode_Long_1_3481() {
      SerieEpisodeDto var1 = ((SerieEpisodeDtoBuilder)JMockK.spyk(new SerieEpisodeDtoBuilder())).build((TvEpisode)JMockK.mockk(TvEpisode.class, true), (Long)JMockK.mockk(Long.class, true));
   }
}
