package com.ulicae.cinelog.data.dto.data;

import com.ulicae.cinelog.data.dao.WishlistMovie;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class WishlistMovieToSerieDataDtoBuilderTestSuccess {
   @Test
   public void test_build_WishlistMovie_1_3357() {
      WishlistDataDto var1 = ((WishlistMovieToSerieDataDtoBuilder)JMockK.spyk(new WishlistMovieToSerieDataDtoBuilder())).build((WishlistMovie)JMockK.mockk(WishlistMovie.class, true));
   }
}
