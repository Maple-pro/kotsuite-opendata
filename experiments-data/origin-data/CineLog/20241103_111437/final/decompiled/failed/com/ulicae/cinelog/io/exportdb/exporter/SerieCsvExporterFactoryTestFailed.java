package com.ulicae.cinelog.io.exportdb.exporter;

import android.app.Application;
import io.github.maples.jmockk.JMockK;
import java.io.FileWriter;
import org.junit.Test;

public class SerieCsvExporterFactoryTestFailed {
   @Test
   public void test_makeCsvExporter_FileWriter_1_4756() {
      CsvExporter var1 = ((SerieCsvExporterFactory)JMockK.spyk(new SerieCsvExporterFactory((Application)JMockK.mockk(Application.class, true)))).makeCsvExporter((FileWriter)JMockK.mockk(FileWriter.class, true));
   }
}
