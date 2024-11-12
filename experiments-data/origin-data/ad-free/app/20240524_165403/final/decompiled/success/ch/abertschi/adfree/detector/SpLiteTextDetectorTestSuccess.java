package ch.abertschi.adfree.detector;

import io.github.maples.jmockk.JMockK;
import org.junit.Assert;
import org.junit.Test;

public class SpLiteTextDetectorTestSuccess {
   @Test
   public void test_flagAsMusic_AdPayload_1_1673() {
      Object var1 = ((SpLiteTextDetector)JMockK.spyk(new SpLiteTextDetector())).flagAsMusic((AdPayload)JMockK.mockk(AdPayload.class, true));
      Assert.assertEquals(new Integer(0), var1);
   }

   @Test
   public void test_getLoggerTag_1_1685() {
      Assert.assertEquals("SpLiteTextDetector", ((SpLiteTextDetector)JMockK.spyk(new SpLiteTextDetector())).getLoggerTag());
   }

   @Test
   public void test_getMeta_1_1665() {
      AdDetectorMeta var1 = ((SpLiteTextDetector)JMockK.spyk(new SpLiteTextDetector())).getMeta();
   }

   @Test
   public void test_getPackageName_1_1633() {
      Assert.assertEquals("com.spotify.lite", ((SpLiteTextDetector)JMockK.spyk(new SpLiteTextDetector())).getPackageName());
   }
}
