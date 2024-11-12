package ch.abertschi.adfree.detector;

import io.github.maples.jmockk.JMockK;
import java.io.File;
import org.junit.Assert;
import org.junit.Test;

public class DeezerDebugTracerTestSuccess {
   @Test
   public void test_flagAsAdvertisement_AdPayload_1_1589() {
      Object var1 = ((DeezerDebugTracer)JMockK.spyk(new DeezerDebugTracer((File)JMockK.mockk(File.class, true)))).flagAsAdvertisement((AdPayload)JMockK.mockk(AdPayload.class, true));
      Assert.assertEquals(new Integer(0), var1);
   }

   @Test
   public void test_flagAsMusic_AdPayload_1_1605() {
      Object var1 = ((DeezerDebugTracer)JMockK.spyk(new DeezerDebugTracer((File)JMockK.mockk(File.class, true)))).flagAsMusic((AdPayload)JMockK.mockk(AdPayload.class, true));
      Assert.assertEquals(new Integer(0), var1);
   }

   @Test
   public void test_getLoggerTag_1_1621() {
      Assert.assertEquals("DeezerDebugTracer", ((DeezerDebugTracer)JMockK.spyk(new DeezerDebugTracer((File)JMockK.mockk(File.class, true)))).getLoggerTag());
   }

   @Test
   public void test_getMeta_1_1577() {
      AdDetectorMeta var1 = ((DeezerDebugTracer)JMockK.spyk(new DeezerDebugTracer((File)JMockK.mockk(File.class, true)))).getMeta();
   }
}
