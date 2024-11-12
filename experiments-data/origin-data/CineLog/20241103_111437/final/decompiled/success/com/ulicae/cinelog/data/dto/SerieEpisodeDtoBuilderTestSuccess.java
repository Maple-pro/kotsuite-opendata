package com.ulicae.cinelog.data.dto;

import com.ulicae.cinelog.data.dao.SerieEpisode;
import com.uwetrottmann.tmdb2.entities.TvEpisode;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class SerieEpisodeDtoBuilderTestSuccess {
   @Test
   public void test_buildFromTvAndDb_SerieEpisode_TvEpisode_1_3465() {
      SerieEpisodeDto var1 = ((SerieEpisodeDtoBuilder)JMockK.spyk(new SerieEpisodeDtoBuilder())).buildFromTvAndDb((SerieEpisode)JMockK.mockk(SerieEpisode.class, true), (TvEpisode)JMockK.mockk(TvEpisode.class, true));
   }

   @Test
   public void test_build_SerieEpisode_1_3497() {
      SerieEpisodeDto var1 = ((SerieEpisodeDtoBuilder)JMockK.spyk(new SerieEpisodeDtoBuilder())).build((SerieEpisode)JMockK.mockk(SerieEpisode.class, true));
   }
}
