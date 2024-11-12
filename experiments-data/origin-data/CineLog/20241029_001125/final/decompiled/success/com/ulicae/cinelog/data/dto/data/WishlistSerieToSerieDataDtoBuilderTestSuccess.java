package com.ulicae.cinelog.data.dto.data;

import com.ulicae.cinelog.data.dao.WishlistSerie;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class WishlistSerieToSerieDataDtoBuilderTestSuccess {
   @Test
   public void test_build_WishlistSerie_1_3169() {
      WishlistDataDto var1 = ((WishlistSerieToSerieDataDtoBuilder)JMockK.spyk(new WishlistSerieToSerieDataDtoBuilder())).build((WishlistSerie)JMockK.mockk(WishlistSerie.class, true));
   }
}
