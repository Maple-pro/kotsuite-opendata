package com.ulicae.cinelog.io.exportdb.writer;

import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class MovieCsvExportWriterTestFailed {
   @Test
   public void test_write_Object_1_4884() {
      ((MovieCsvExportWriter)JMockK.spyk(new MovieCsvExportWriter((Appendable)JMockK.mockk(Appendable.class, true)))).write((Object)JMockK.mockk(Object.class, true));
   }
}
