package ch.abertschi.adfree.detector;

import io.github.maples.jmockk.JMockK;
import java.io.File;
import org.junit.Test;

public class SpotifyLiteDebugTracerTestFailed {
   @Test
   public void test_flagAsAdvertisement_AdPayload_1_2201() {
      boolean var1 = ((SpotifyLiteDebugTracer)JMockK.spyk(new SpotifyLiteDebugTracer((File)JMockK.mockk(File.class, true)))).flagAsAdvertisement((AdPayload)JMockK.mockk(AdPayload.class, true));
   }

   @Test
   public void test_flagAsMusic_AdPayload_1_2217() {
      boolean var1 = ((SpotifyLiteDebugTracer)JMockK.spyk(new SpotifyLiteDebugTracer((File)JMockK.mockk(File.class, true)))).flagAsMusic((AdPayload)JMockK.mockk(AdPayload.class, true));
   }

   @Test
   public void test_getLoggerTag_1_2233() {
      String var1 = ((SpotifyLiteDebugTracer)JMockK.spyk(new SpotifyLiteDebugTracer((File)JMockK.mockk(File.class, true)))).getLoggerTag();
   }

   @Test
   public void test_getMeta_1_2189() {
      AdDetectorMeta var1 = ((SpotifyLiteDebugTracer)JMockK.spyk(new SpotifyLiteDebugTracer((File)JMockK.mockk(File.class, true)))).getMeta();
   }
}
