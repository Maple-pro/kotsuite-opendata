package ch.abertschi.adfree.detector;

import io.github.maples.jmockk.JMockK;
import java.io.File;
import org.junit.Test;

public class SpotifyNotificationDebugTracerTestFailed {
   @Test
   public void test_flagAsAdvertisement_AdPayload_1_2005() {
      boolean var1 = ((SpotifyNotificationDebugTracer)JMockK.spyk(new SpotifyNotificationDebugTracer((File)JMockK.mockk(File.class, true)))).flagAsAdvertisement((AdPayload)JMockK.mockk(AdPayload.class, true));
   }

   @Test
   public void test_flagAsMusic_AdPayload_1_2021() {
      boolean var1 = ((SpotifyNotificationDebugTracer)JMockK.spyk(new SpotifyNotificationDebugTracer((File)JMockK.mockk(File.class, true)))).flagAsMusic((AdPayload)JMockK.mockk(AdPayload.class, true));
   }

   @Test
   public void test_getLoggerTag_1_2037() {
      String var1 = ((SpotifyNotificationDebugTracer)JMockK.spyk(new SpotifyNotificationDebugTracer((File)JMockK.mockk(File.class, true)))).getLoggerTag();
   }

   @Test
   public void test_getMeta_1_1993() {
      AdDetectorMeta var1 = ((SpotifyNotificationDebugTracer)JMockK.spyk(new SpotifyNotificationDebugTracer((File)JMockK.mockk(File.class, true)))).getMeta();
   }

   @Test
   public void test_getPackage_1_1981() {
      String var1 = ((SpotifyNotificationDebugTracer)JMockK.spyk(new SpotifyNotificationDebugTracer((File)JMockK.mockk(File.class, true)))).getPackage();
   }
}
