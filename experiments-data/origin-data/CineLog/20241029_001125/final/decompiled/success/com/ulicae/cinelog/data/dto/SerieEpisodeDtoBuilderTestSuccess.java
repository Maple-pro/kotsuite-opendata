package com.ulicae.cinelog.data.dto;

import com.ulicae.cinelog.data.dao.SerieEpisode;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class SerieEpisodeDtoBuilderTestSuccess {
   @Test
   public void test_build_SerieEpisode_1_3497() {
      SerieEpisodeDto var1 = ((SerieEpisodeDtoBuilder)JMockK.spyk(new SerieEpisodeDtoBuilder())).build((SerieEpisode)JMockK.mockk(SerieEpisode.class, true));
   }
}
