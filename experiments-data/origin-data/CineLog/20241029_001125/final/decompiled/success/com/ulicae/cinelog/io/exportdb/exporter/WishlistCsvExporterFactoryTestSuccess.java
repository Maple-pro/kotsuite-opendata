package com.ulicae.cinelog.io.exportdb.exporter;

import com.ulicae.cinelog.data.services.wishlist.WishlistService;
import io.github.maples.jmockk.JMockK;
import java.io.FileWriter;
import org.junit.Test;

public class WishlistCsvExporterFactoryTestSuccess {
   @Test
   public void test_makeCsvExporter_FileWriter_1_4804() {
      CsvExporter var1 = ((WishlistCsvExporterFactory)JMockK.spyk(new WishlistCsvExporterFactory((WishlistService)JMockK.mockk(WishlistService.class, true)))).makeCsvExporter((FileWriter)JMockK.mockk(FileWriter.class, true));
   }
}
