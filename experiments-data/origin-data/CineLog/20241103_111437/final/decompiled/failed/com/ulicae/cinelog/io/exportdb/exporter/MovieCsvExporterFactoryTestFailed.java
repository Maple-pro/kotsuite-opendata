package com.ulicae.cinelog.io.exportdb.exporter;

import android.app.Application;
import io.github.maples.jmockk.JMockK;
import java.io.FileWriter;
import org.junit.Test;

public class MovieCsvExporterFactoryTestFailed {
   @Test
   public void test_makeCsvExporter_FileWriter_1_4852() {
      CsvExporter var1 = ((MovieCsvExporterFactory)JMockK.spyk(new MovieCsvExporterFactory((Application)JMockK.mockk(Application.class, true)))).makeCsvExporter((FileWriter)JMockK.mockk(FileWriter.class, true));
   }
}
