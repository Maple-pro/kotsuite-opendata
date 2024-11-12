package ch.abertschi.adfree.detector;

import io.github.maples.jmockk.JMockK;
import org.junit.Assert;
import org.junit.Test;

public class SpLiteTextEnglishDetectorTestSuccess {
   @Test
   public void test_flagAsMusic_AdPayload_1_1929() {
      Object var1 = ((SpLiteTextEnglishDetector)JMockK.spyk(new SpLiteTextEnglishDetector())).flagAsMusic((AdPayload)JMockK.mockk(AdPayload.class, true));
      Assert.assertEquals(new Integer(0), var1);
   }

   @Test
   public void test_getLoggerTag_1_1941() {
      Assert.assertEquals("SpLiteTextEnglishDetect", ((SpLiteTextEnglishDetector)JMockK.spyk(new SpLiteTextEnglishDetector())).getLoggerTag());
   }

   @Test
   public void test_getMeta_1_1921() {
      AdDetectorMeta var1 = ((SpLiteTextEnglishDetector)JMockK.spyk(new SpLiteTextEnglishDetector())).getMeta();
   }

   @Test
   public void test_getPackageName_1_1889() {
      Assert.assertEquals("com.spotify.lite", ((SpLiteTextEnglishDetector)JMockK.spyk(new SpLiteTextEnglishDetector())).getPackageName());
   }
}
