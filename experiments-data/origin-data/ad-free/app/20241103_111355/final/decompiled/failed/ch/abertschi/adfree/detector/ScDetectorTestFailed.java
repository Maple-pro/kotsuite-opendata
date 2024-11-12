package ch.abertschi.adfree.detector;

import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class ScDetectorTestFailed {
   @Test
   public void test_canHandle_AdPayload_1_1765() {
      boolean var1 = ((ScDetector)JMockK.spyk(new ScDetector())).canHandle((AdPayload)JMockK.mockk(AdPayload.class, true));
   }

   @Test
   public void test_flagAsAdvertisement_AdPayload_1_1777() {
      boolean var1 = ((ScDetector)JMockK.spyk(new ScDetector())).flagAsAdvertisement((AdPayload)JMockK.mockk(AdPayload.class, true));
   }

   @Test
   public void test_flagAsMusic_AdPayload_1_1797() {
      boolean var1 = ((ScDetector)JMockK.spyk(new ScDetector())).flagAsMusic((AdPayload)JMockK.mockk(AdPayload.class, true));
   }

   @Test
   public void test_getLoggerTag_1_1809() {
      String var1 = ((ScDetector)JMockK.spyk(new ScDetector())).getLoggerTag();
   }

   @Test
   public void test_getMeta_1_1789() {
      AdDetectorMeta var1 = ((ScDetector)JMockK.spyk(new ScDetector())).getMeta();
   }
}
