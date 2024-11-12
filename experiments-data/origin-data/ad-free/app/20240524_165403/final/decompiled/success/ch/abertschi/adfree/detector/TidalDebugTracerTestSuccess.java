package ch.abertschi.adfree.detector;

import io.github.maples.jmockk.JMockK;
import java.io.File;
import org.junit.Assert;
import org.junit.Test;

public class TidalDebugTracerTestSuccess {
   @Test
   public void test_flagAsAdvertisement_AdPayload_1_2481() {
      Object var1 = ((TidalDebugTracer)JMockK.spyk(new TidalDebugTracer((File)JMockK.mockk(File.class, true)))).flagAsAdvertisement((AdPayload)JMockK.mockk(AdPayload.class, true));
      Assert.assertEquals(new Integer(0), var1);
   }

   @Test
   public void test_flagAsMusic_AdPayload_1_2497() {
      Object var1 = ((TidalDebugTracer)JMockK.spyk(new TidalDebugTracer((File)JMockK.mockk(File.class, true)))).flagAsMusic((AdPayload)JMockK.mockk(AdPayload.class, true));
      Assert.assertEquals(new Integer(0), var1);
   }

   @Test
   public void test_getLoggerTag_1_2513() {
      Assert.assertEquals("TidalDebugTracer", ((TidalDebugTracer)JMockK.spyk(new TidalDebugTracer((File)JMockK.mockk(File.class, true)))).getLoggerTag());
   }

   @Test
   public void test_getMeta_1_2469() {
      AdDetectorMeta var1 = ((TidalDebugTracer)JMockK.spyk(new TidalDebugTracer((File)JMockK.mockk(File.class, true)))).getMeta();
   }
}
