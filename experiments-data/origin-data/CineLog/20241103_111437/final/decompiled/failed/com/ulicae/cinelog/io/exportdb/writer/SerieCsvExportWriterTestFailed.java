package com.ulicae.cinelog.io.exportdb.writer;

import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class SerieCsvExportWriterTestFailed {
   @Test
   public void test_write_Object_1_4788() {
      ((SerieCsvExportWriter)JMockK.spyk(new SerieCsvExportWriter((Appendable)JMockK.mockk(Appendable.class, true)))).write((Object)JMockK.mockk(Object.class, true));
   }
}
