package ch.abertschi.adfree.detector;

import io.github.maples.jmockk.JMockK;
import java.io.File;
import org.junit.Test;

public class AccuRadioDebugTracerTestFailed {
   @Test
   public void test_flagAsAdvertisement_AdPayload_1_2061() {
      boolean var1 = ((AccuRadioDebugTracer)JMockK.spyk(new AccuRadioDebugTracer((File)JMockK.mockk(File.class, true)))).flagAsAdvertisement((AdPayload)JMockK.mockk(AdPayload.class, true));
   }

   @Test
   public void test_flagAsMusic_AdPayload_1_2077() {
      boolean var1 = ((AccuRadioDebugTracer)JMockK.spyk(new AccuRadioDebugTracer((File)JMockK.mockk(File.class, true)))).flagAsMusic((AdPayload)JMockK.mockk(AdPayload.class, true));
   }

   @Test
   public void test_getLoggerTag_1_2093() {
      String var1 = ((AccuRadioDebugTracer)JMockK.spyk(new AccuRadioDebugTracer((File)JMockK.mockk(File.class, true)))).getLoggerTag();
   }

   @Test
   public void test_getMeta_1_2049() {
      AdDetectorMeta var1 = ((AccuRadioDebugTracer)JMockK.spyk(new AccuRadioDebugTracer((File)JMockK.mockk(File.class, true)))).getMeta();
   }
}