package com.ulicae.cinelog.data.dto;

import io.github.maples.jmockk.JMockK;
import org.junit.Assert;
import org.junit.Test;

public class TagDtoTestSuccess {
   @Test
   public void test_isForMovies_1_3973() {
      Object var1 = ((TagDto)JMockK.spyk(new TagDto())).isForMovies();
      Assert.assertEquals(new Integer(0), var1);
   }

   @Test
   public void test_isForSeries_1_3981() {
      Object var1 = ((TagDto)JMockK.spyk(new TagDto())).isForSeries();
      Assert.assertEquals(new Integer(0), var1);
   }
}
