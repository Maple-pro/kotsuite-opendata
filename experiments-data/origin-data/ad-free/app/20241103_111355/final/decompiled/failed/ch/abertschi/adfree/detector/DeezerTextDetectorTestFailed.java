package ch.abertschi.adfree.detector;

import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class DeezerTextDetectorTestFailed {
   @Test
   public void test_canHandle_AdPayload_1_2105() {
      boolean var1 = ((DeezerTextDetector)JMockK.spyk(new DeezerTextDetector())).canHandle((AdPayload)JMockK.mockk(AdPayload.class, true));
   }

   @Test
   public void test_flagAsAdvertisement_AdPayload_1_2117() {
      boolean var1 = ((DeezerTextDetector)JMockK.spyk(new DeezerTextDetector())).flagAsAdvertisement((AdPayload)JMockK.mockk(AdPayload.class, true));
   }

   @Test
   public void test_flagAsMusic_AdPayload_1_2137() {
      boolean var1 = ((DeezerTextDetector)JMockK.spyk(new DeezerTextDetector())).flagAsMusic((AdPayload)JMockK.mockk(AdPayload.class, true));
   }

   @Test
   public void test_getLoggerTag_1_2149() {
      String var1 = ((DeezerTextDetector)JMockK.spyk(new DeezerTextDetector())).getLoggerTag();
   }

   @Test
   public void test_getMeta_1_2129() {
      AdDetectorMeta var1 = ((DeezerTextDetector)JMockK.spyk(new DeezerTextDetector())).getMeta();
   }
}
