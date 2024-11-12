package com.ulicae.cinelog.io.exportdb.writer;

import com.ulicae.cinelog.data.dto.TagDto;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class TagCsvExportWriterTestSuccess {
   @Test
   public void test_write_TagDto_1_4724() {
      ((TagCsvExportWriter)JMockK.spyk(new TagCsvExportWriter((Appendable)JMockK.mockk(Appendable.class, true)))).write((TagDto)JMockK.mockk(TagDto.class, true));
   }
}
