package com.ulicae.cinelog.io.exportdb.writer;

import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class WishlistCsvExportWriterTestFailed {
   @Test
   public void test_write_Object_1_4836() {
      ((WishlistCsvExportWriter)JMockK.spyk(new WishlistCsvExportWriter((Appendable)JMockK.mockk(Appendable.class, true)))).write((Object)JMockK.mockk(Object.class, true));
   }
}
