package com.ulicae.cinelog.data.dto;

import com.ulicae.cinelog.data.dao.Tag;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class TagDtoBuilderTestSuccess {
   @Test
   public void test_build_Tag_1_3989() {
      TagDto var1 = ((TagDtoBuilder)JMockK.spyk(new TagDtoBuilder())).build((Tag)JMockK.mockk(Tag.class, true));
   }
}
