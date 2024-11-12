package com.ulicae.cinelog.io.exportdb;

import android.app.Application;
import com.ulicae.cinelog.io.exportdb.exporter.ExporterFactory;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class AutomaticExporterTestFailed {
   @Test
   public void test_tryExport_1_4900() {
      boolean var1 = ((AutomaticExporter)JMockK.spyk(new AutomaticExporter((Application)JMockK.mockk(Application.class, true), (ExporterFactory)JMockK.mockk(ExporterFactory.class, true), "Edmgv45TvpJpArf6kb-ooqH2putmhzbomBB2fFgXLEz8qInRHjQJter8XtH5c8Jt+xL91r3fI8bBkY8r"))).tryExport();
   }
}
