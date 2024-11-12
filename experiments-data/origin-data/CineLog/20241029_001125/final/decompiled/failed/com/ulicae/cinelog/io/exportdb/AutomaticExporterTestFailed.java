package com.ulicae.cinelog.io.exportdb;

import android.app.Application;
import com.ulicae.cinelog.io.exportdb.exporter.ExporterFactory;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class AutomaticExporterTestFailed {
   @Test
   public void test_tryExport_1_4900() {
      boolean var1 = ((AutomaticExporter)JMockK.spyk(new AutomaticExporter((Application)JMockK.mockk(Application.class, true), (ExporterFactory)JMockK.mockk(ExporterFactory.class, true), "IUohnIVwkeW4MH95fjgxtSaABFaIgkrA0kKVLY6oHWpkKa+1kMiQbcC1u48x"))).tryExport();
   }
}
