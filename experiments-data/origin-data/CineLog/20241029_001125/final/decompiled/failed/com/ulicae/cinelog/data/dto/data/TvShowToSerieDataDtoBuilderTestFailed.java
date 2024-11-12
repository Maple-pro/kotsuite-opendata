package com.ulicae.cinelog.data.dto.data;

import com.uwetrottmann.tmdb2.entities.BaseTvShow;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class TvShowToSerieDataDtoBuilderTestFailed {
   @Test
   public void test_build_BaseTvShow_1_4393() {
      WishlistDataDto var1 = ((TvShowToSerieDataDtoBuilder)JMockK.spyk(new TvShowToSerieDataDtoBuilder())).build((BaseTvShow)JMockK.mockk(BaseTvShow.class, true));
   }
}
