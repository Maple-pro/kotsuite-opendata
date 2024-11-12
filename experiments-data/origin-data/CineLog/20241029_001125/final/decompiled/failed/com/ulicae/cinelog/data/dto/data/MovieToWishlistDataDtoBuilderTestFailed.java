package com.ulicae.cinelog.data.dto.data;

import com.uwetrottmann.tmdb2.entities.BaseMovie;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class MovieToWishlistDataDtoBuilderTestFailed {
   @Test
   public void test_build_BaseMovie_1_4381() {
      WishlistDataDto var1 = ((MovieToWishlistDataDtoBuilder)JMockK.spyk(new MovieToWishlistDataDtoBuilder())).build((BaseMovie)JMockK.mockk(BaseMovie.class, true));
   }
}
