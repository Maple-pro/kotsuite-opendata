package ch.abertschi.adfree.detector;

import io.github.maples.jmockk.JMockK;
import org.junit.Assert;
import org.junit.Test;

public class ScDetectorTestSuccess {
   @Test
   public void test_canHandle_AdPayload_1_1765() {
      Object var1 = ((ScDetector)JMockK.spyk(new ScDetector())).canHandle((AdPayload)JMockK.mockk(AdPayload.class, true));
      Assert.assertEquals(new Integer(0), var1);
   }

   @Test
   public void test_flagAsAdvertisement_AdPayload_1_1777() {
      Object var1 = ((ScDetector)JMockK.spyk(new ScDetector())).flagAsAdvertisement((AdPayload)JMockK.mockk(AdPayload.class, true));
      Assert.assertEquals(new Integer(0), var1);
   }

   @Test
   public void test_flagAsMusic_AdPayload_1_1797() {
      Object var1 = ((ScDetector)JMockK.spyk(new ScDetector())).flagAsMusic((AdPayload)JMockK.mockk(AdPayload.class, true));
      Assert.assertEquals(new Integer(0), var1);
   }

   @Test
   public void test_getLoggerTag_1_1809() {
      Assert.assertEquals("ScDetector", ((ScDetector)JMockK.spyk(new ScDetector())).getLoggerTag());
   }

   @Test
   public void test_getMeta_1_1789() {
      AdDetectorMeta var1 = ((ScDetector)JMockK.spyk(new ScDetector())).getMeta();
   }
}
