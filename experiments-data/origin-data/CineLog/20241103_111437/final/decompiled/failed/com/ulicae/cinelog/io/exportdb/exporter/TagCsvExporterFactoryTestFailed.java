package com.ulicae.cinelog.io.exportdb.exporter;

import android.app.Application;
import io.github.maples.jmockk.JMockK;
import java.io.FileWriter;
import org.junit.Test;

public class TagCsvExporterFactoryTestFailed {
   @Test
   public void test_makeCsvExporter_FileWriter_1_4705() {
      CsvExporter var1 = ((TagCsvExporterFactory)JMockK.spyk(new TagCsvExporterFactory((Application)JMockK.mockk(Application.class, true)))).makeCsvExporter((FileWriter)JMockK.mockk(FileWriter.class, true));
   }
}
