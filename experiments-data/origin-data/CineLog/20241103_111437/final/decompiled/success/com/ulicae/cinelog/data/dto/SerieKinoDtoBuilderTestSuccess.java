package com.ulicae.cinelog.data.dto;

import com.ulicae.cinelog.data.dao.SerieReview;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class SerieKinoDtoBuilderTestSuccess {
   @Test
   public void test_build_SerieReview_1_3837() {
      SerieDto var1 = ((SerieKinoDtoBuilder)JMockK.spyk(new SerieKinoDtoBuilder())).build((SerieReview)JMockK.mockk(SerieReview.class, true));
   }
}
