package com.ulicae.cinelog.utils;

import com.ulicae.cinelog.data.dao.LocalKino;
import com.ulicae.cinelog.data.dto.KinoDto;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class KinoDtoToDbBuilderTestSuccess {
   @Test
   public void test_build_KinoDto_1_4337() {
      LocalKino var1 = ((KinoDtoToDbBuilder)JMockK.spyk(new KinoDtoToDbBuilder())).build((KinoDto)JMockK.mockk(KinoDto.class, true));
   }
}
