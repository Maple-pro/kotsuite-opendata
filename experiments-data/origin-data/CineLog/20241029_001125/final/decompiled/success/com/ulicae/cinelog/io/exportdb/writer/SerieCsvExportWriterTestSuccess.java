package com.ulicae.cinelog.io.exportdb.writer;

import com.ulicae.cinelog.data.dto.SerieDto;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class SerieCsvExportWriterTestSuccess {
   @Test
   public void test_write_SerieDto_1_4772() {
      ((SerieCsvExportWriter)JMockK.spyk(new SerieCsvExportWriter((Appendable)JMockK.mockk(Appendable.class, true)))).write((SerieDto)JMockK.mockk(SerieDto.class, true));
   }
}
