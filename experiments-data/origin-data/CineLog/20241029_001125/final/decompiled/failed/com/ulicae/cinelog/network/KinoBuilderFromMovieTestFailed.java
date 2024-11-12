package com.ulicae.cinelog.network;

import com.ulicae.cinelog.data.dto.KinoDto;
import com.uwetrottmann.tmdb2.entities.BaseMovie;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class KinoBuilderFromMovieTestFailed {
   @Test
   public void test_build_BaseMovie_1_4681() {
      KinoDto var1 = ((KinoBuilderFromMovie)JMockK.spyk(new KinoBuilderFromMovie())).build((BaseMovie)JMockK.mockk(BaseMovie.class, true));
   }

   @Test
   public void test_build_Object_1_4693() {
      KinoDto var1 = ((KinoBuilderFromMovie)JMockK.spyk(new KinoBuilderFromMovie())).build((Object)JMockK.mockk(Object.class, true));
   }
}
