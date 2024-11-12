package com.ulicae.cinelog.network;

import com.ulicae.cinelog.data.dto.KinoDto;
import com.ulicae.cinelog.data.dto.SerieDto;
import com.uwetrottmann.tmdb2.entities.BaseTvShow;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class SerieBuilderFromMovieTestFailed {
   @Test
   public void test_build_BaseTvShow_1_4421() {
      SerieDto var1 = ((SerieBuilderFromMovie)JMockK.spyk(new SerieBuilderFromMovie())).build((BaseTvShow)JMockK.mockk(BaseTvShow.class, true));
   }

   @Test
   public void test_build_Object_1_4433() {
      KinoDto var1 = ((SerieBuilderFromMovie)JMockK.spyk(new SerieBuilderFromMovie())).build((Object)JMockK.mockk(Object.class, true));
   }
}
