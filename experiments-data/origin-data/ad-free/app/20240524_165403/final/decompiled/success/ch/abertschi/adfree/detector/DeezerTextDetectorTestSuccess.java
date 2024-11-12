package ch.abertschi.adfree.detector;

import io.github.maples.jmockk.JMockK;
import org.junit.Assert;
import org.junit.Test;

public class DeezerTextDetectorTestSuccess {
   @Test
   public void test_canHandle_AdPayload_1_2105() {
      Object var1 = ((DeezerTextDetector)JMockK.spyk(new DeezerTextDetector())).canHandle((AdPayload)JMockK.mockk(AdPayload.class, true));
      Assert.assertEquals(new Integer(0), var1);
   }

   @Test
   public void test_flagAsAdvertisement_AdPayload_1_2117() {
      Object var1 = ((DeezerTextDetector)JMockK.spyk(new DeezerTextDetector())).flagAsAdvertisement((AdPayload)JMockK.mockk(AdPayload.class, true));
      Assert.assertEquals(new Integer(0), var1);
   }

   @Test
   public void test_flagAsMusic_AdPayload_1_2137() {
      Object var1 = ((DeezerTextDetector)JMockK.spyk(new DeezerTextDetector())).flagAsMusic((AdPayload)JMockK.mockk(AdPayload.class, true));
      Assert.assertEquals(new Integer(0), var1);
   }

   @Test
   public void test_getLoggerTag_1_2149() {
      Assert.assertEquals("DeezerTextDetector", ((DeezerTextDetector)JMockK.spyk(new DeezerTextDetector())).getLoggerTag());
   }

   @Test
   public void test_getMeta_1_2129() {
      AdDetectorMeta var1 = ((DeezerTextDetector)JMockK.spyk(new DeezerTextDetector())).getMeta();
   }
}
