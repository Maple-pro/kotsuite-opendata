package ch.abertschi.adfree.detector;

import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class AccuradioDetectorTestFailed {
   @Test
   public void test_flagAsAdvertisement_AdPayload_1_2541() {
      boolean var1 = ((AccuradioDetector)JMockK.spyk(new AccuradioDetector())).flagAsAdvertisement((AdPayload)JMockK.mockk(AdPayload.class, true));
   }

   @Test
   public void test_flagAsMusic_AdPayload_1_2553() {
      boolean var1 = ((AccuradioDetector)JMockK.spyk(new AccuradioDetector())).flagAsMusic((AdPayload)JMockK.mockk(AdPayload.class, true));
   }

   @Test
   public void test_getLoggerTag_1_2565() {
      String var1 = ((AccuradioDetector)JMockK.spyk(new AccuradioDetector())).getLoggerTag();
   }

   @Test
   public void test_getMeta_1_2533() {
      AdDetectorMeta var1 = ((AccuradioDetector)JMockK.spyk(new AccuradioDetector())).getMeta();
   }

   @Test
   public void test_getPackageName_1_2525() {
      String var1 = ((AccuradioDetector)JMockK.spyk(new AccuradioDetector())).getPackageName();
   }
}
