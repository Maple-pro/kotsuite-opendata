package ch.abertschi.adfree.detector;

import io.github.maples.jmockk.JMockK;
import java.io.File;
import org.junit.Assert;
import org.junit.Test;

public class AccuRadioDebugTracerTestSuccess {
   @Test
   public void test_flagAsAdvertisement_AdPayload_1_2061() {
      Object var1 = ((AccuRadioDebugTracer)JMockK.spyk(new AccuRadioDebugTracer((File)JMockK.mockk(File.class, true)))).flagAsAdvertisement((AdPayload)JMockK.mockk(AdPayload.class, true));
      Assert.assertEquals(new Integer(0), var1);
   }

   @Test
   public void test_flagAsMusic_AdPayload_1_2077() {
      Object var1 = ((AccuRadioDebugTracer)JMockK.spyk(new AccuRadioDebugTracer((File)JMockK.mockk(File.class, true)))).flagAsMusic((AdPayload)JMockK.mockk(AdPayload.class, true));
      Assert.assertEquals(new Integer(0), var1);
   }

   @Test
   public void test_getLoggerTag_1_2093() {
      Assert.assertEquals("AccuRadioDebugTracer", ((AccuRadioDebugTracer)JMockK.spyk(new AccuRadioDebugTracer((File)JMockK.mockk(File.class, true)))).getLoggerTag());
   }

   @Test
   public void test_getMeta_1_2049() {
      AdDetectorMeta var1 = ((AccuRadioDebugTracer)JMockK.spyk(new AccuRadioDebugTracer((File)JMockK.mockk(File.class, true)))).getMeta();
   }
}
