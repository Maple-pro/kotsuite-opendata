package ch.abertschi.adfree.detector;

import io.github.maples.jmockk.JMockK;
import org.junit.Assert;
import org.junit.Test;

public class AccuradioDetectorTestSuccess {
   @Test
   public void test_flagAsAdvertisement_AdPayload_1_2541() {
      Object var1 = ((AccuradioDetector)JMockK.spyk(new AccuradioDetector())).flagAsAdvertisement((AdPayload)JMockK.mockk(AdPayload.class, true));
      Assert.assertEquals(new Integer(0), var1);
   }

   @Test
   public void test_flagAsMusic_AdPayload_1_2553() {
      Object var1 = ((AccuradioDetector)JMockK.spyk(new AccuradioDetector())).flagAsMusic((AdPayload)JMockK.mockk(AdPayload.class, true));
      Assert.assertEquals(new Integer(0), var1);
   }

   @Test
   public void test_getLoggerTag_1_2565() {
      Assert.assertEquals("AccuradioDetector", ((AccuradioDetector)JMockK.spyk(new AccuradioDetector())).getLoggerTag());
   }

   @Test
   public void test_getMeta_1_2533() {
      AdDetectorMeta var1 = ((AccuradioDetector)JMockK.spyk(new AccuradioDetector())).getMeta();
   }

   @Test
   public void test_getPackageName_1_2525() {
      Assert.assertEquals("com.slipstream.accuradio", ((AccuradioDetector)JMockK.spyk(new AccuradioDetector())).getPackageName());
   }
}
