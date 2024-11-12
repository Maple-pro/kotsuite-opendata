package com.ulicae.cinelog.data.dto;

import com.ulicae.cinelog.data.dao.LocalKino;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class KinoDtoBuilderTestSuccess {
   @Test
   public void test_build_LocalKino_1_4325() {
      KinoDto var1 = ((KinoDtoBuilder)JMockK.spyk(new KinoDtoBuilder())).build((LocalKino)JMockK.mockk(LocalKino.class, true));
   }
}
