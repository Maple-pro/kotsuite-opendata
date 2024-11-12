package com.ulicae.cinelog.io.exportdb.writer;

import com.ulicae.cinelog.data.dto.data.WishlistDataDto;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class WishlistCsvExportWriterTestSuccess {
   @Test
   public void test_write_WishlistDataDto_1_4820() {
      ((WishlistCsvExportWriter)JMockK.spyk(new WishlistCsvExportWriter((Appendable)JMockK.mockk(Appendable.class, true)))).write((WishlistDataDto)JMockK.mockk(WishlistDataDto.class, true));
   }
}
