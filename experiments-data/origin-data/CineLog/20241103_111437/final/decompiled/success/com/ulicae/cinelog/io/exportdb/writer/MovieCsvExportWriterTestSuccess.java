package com.ulicae.cinelog.io.exportdb.writer;

import com.ulicae.cinelog.data.dto.KinoDto;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class MovieCsvExportWriterTestSuccess {
   @Test
   public void test_write_KinoDto_1_4868() {
      ((MovieCsvExportWriter)JMockK.spyk(new MovieCsvExportWriter((Appendable)JMockK.mockk(Appendable.class, true)))).write((KinoDto)JMockK.mockk(KinoDto.class, true));
   }
}
