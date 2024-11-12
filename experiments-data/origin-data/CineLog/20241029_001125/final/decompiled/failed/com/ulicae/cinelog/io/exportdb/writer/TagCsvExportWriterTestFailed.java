package com.ulicae.cinelog.io.exportdb.writer;

import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class TagCsvExportWriterTestFailed {
   @Test
   public void test_write_Object_1_4740() {
      ((TagCsvExportWriter)JMockK.spyk(new TagCsvExportWriter((Appendable)JMockK.mockk(Appendable.class, true)))).write((Object)JMockK.mockk(Object.class, true));
   }
}
