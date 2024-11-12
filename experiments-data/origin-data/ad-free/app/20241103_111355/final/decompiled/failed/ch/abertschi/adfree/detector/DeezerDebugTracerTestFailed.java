package ch.abertschi.adfree.detector;

import io.github.maples.jmockk.JMockK;
import java.io.File;
import org.junit.Test;

public class DeezerDebugTracerTestFailed {
   @Test
   public void test_flagAsAdvertisement_AdPayload_1_1589() {
      boolean var1 = ((DeezerDebugTracer)JMockK.spyk(new DeezerDebugTracer((File)JMockK.mockk(File.class, true)))).flagAsAdvertisement((AdPayload)JMockK.mockk(AdPayload.class, true));
   }

   @Test
   public void test_flagAsMusic_AdPayload_1_1605() {
      boolean var1 = ((DeezerDebugTracer)JMockK.spyk(new DeezerDebugTracer((File)JMockK.mockk(File.class, true)))).flagAsMusic((AdPayload)JMockK.mockk(AdPayload.class, true));
   }

   @Test
   public void test_getLoggerTag_1_1621() {
      String var1 = ((DeezerDebugTracer)JMockK.spyk(new DeezerDebugTracer((File)JMockK.mockk(File.class, true)))).getLoggerTag();
   }

   @Test
   public void test_getMeta_1_1577() {
      AdDetectorMeta var1 = ((DeezerDebugTracer)JMockK.spyk(new DeezerDebugTracer((File)JMockK.mockk(File.class, true)))).getMeta();
   }
}
