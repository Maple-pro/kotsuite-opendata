package ch.abertschi.adfree.detector;

import io.github.maples.jmockk.JMockK;
import java.io.File;
import org.junit.Assert;
import org.junit.Test;

public class SpotifyNotificationDebugTracerTestSuccess {
   @Test
   public void test_flagAsAdvertisement_AdPayload_1_2005() {
      Object var1 = ((SpotifyNotificationDebugTracer)JMockK.spyk(new SpotifyNotificationDebugTracer((File)JMockK.mockk(File.class, true)))).flagAsAdvertisement((AdPayload)JMockK.mockk(AdPayload.class, true));
      Assert.assertEquals(new Integer(0), var1);
   }

   @Test
   public void test_flagAsMusic_AdPayload_1_2021() {
      Object var1 = ((SpotifyNotificationDebugTracer)JMockK.spyk(new SpotifyNotificationDebugTracer((File)JMockK.mockk(File.class, true)))).flagAsMusic((AdPayload)JMockK.mockk(AdPayload.class, true));
      Assert.assertEquals(new Integer(0), var1);
   }

   @Test
   public void test_getLoggerTag_1_2037() {
      Assert.assertEquals("SpotifyNotificationDebu", ((SpotifyNotificationDebugTracer)JMockK.spyk(new SpotifyNotificationDebugTracer((File)JMockK.mockk(File.class, true)))).getLoggerTag());
   }

   @Test
   public void test_getMeta_1_1993() {
      AdDetectorMeta var1 = ((SpotifyNotificationDebugTracer)JMockK.spyk(new SpotifyNotificationDebugTracer((File)JMockK.mockk(File.class, true)))).getMeta();
   }

   @Test
   public void test_getPackage_1_1981() {
      Assert.assertEquals("com.spotify", ((SpotifyNotificationDebugTracer)JMockK.spyk(new SpotifyNotificationDebugTracer((File)JMockK.mockk(File.class, true)))).getPackage());
   }
}
