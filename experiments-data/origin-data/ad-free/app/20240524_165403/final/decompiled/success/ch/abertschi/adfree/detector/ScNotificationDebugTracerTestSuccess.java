package ch.abertschi.adfree.detector;

import io.github.maples.jmockk.JMockK;
import java.io.File;
import org.junit.Assert;
import org.junit.Test;

public class ScNotificationDebugTracerTestSuccess {
   @Test
   public void test_flagAsAdvertisement_AdPayload_1_2269() {
      Object var1 = ((ScNotificationDebugTracer)JMockK.spyk(new ScNotificationDebugTracer((File)JMockK.mockk(File.class, true)))).flagAsAdvertisement((AdPayload)JMockK.mockk(AdPayload.class, true));
      Assert.assertEquals(new Integer(0), var1);
   }

   @Test
   public void test_flagAsMusic_AdPayload_1_2285() {
      Object var1 = ((ScNotificationDebugTracer)JMockK.spyk(new ScNotificationDebugTracer((File)JMockK.mockk(File.class, true)))).flagAsMusic((AdPayload)JMockK.mockk(AdPayload.class, true));
      Assert.assertEquals(new Integer(0), var1);
   }

   @Test
   public void test_getLoggerTag_1_2301() {
      Assert.assertEquals("ScNotificationDebugTrac", ((ScNotificationDebugTracer)JMockK.spyk(new ScNotificationDebugTracer((File)JMockK.mockk(File.class, true)))).getLoggerTag());
   }

   @Test
   public void test_getMeta_1_2257() {
      AdDetectorMeta var1 = ((ScNotificationDebugTracer)JMockK.spyk(new ScNotificationDebugTracer((File)JMockK.mockk(File.class, true)))).getMeta();
   }

   @Test
   public void test_getPackage_1_2245() {
      Assert.assertEquals("com.soundcloud.android", ((ScNotificationDebugTracer)JMockK.spyk(new ScNotificationDebugTracer((File)JMockK.mockk(File.class, true)))).getPackage());
   }
}
