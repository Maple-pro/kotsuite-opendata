package com.ulicae.cinelog.utils;

import com.ulicae.cinelog.data.dao.Tag;
import com.ulicae.cinelog.data.dto.TagDto;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class TagDtoToDbBuilderTestSuccess {
   @Test
   public void test_build_TagDto_1_4137() {
      Tag var1 = ((TagDtoToDbBuilder)JMockK.spyk(new TagDtoToDbBuilder())).build((TagDto)JMockK.mockk(TagDto.class, true));
   }
}
