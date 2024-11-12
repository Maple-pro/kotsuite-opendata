package ch.abertschi.adfree.detector;

import io.github.maples.jmockk.JMockK;
import kotlin.Pair;
import org.junit.Test;

public class SpLiteTextEnglishDetectorTestFailed {
   @Test
   public void test_detectAsAdvertisement_AdPayload_Pair_Pair_Pair_1_1897() {
      boolean var1 = ((SpLiteTextEnglishDetector)JMockK.spyk(new SpLiteTextEnglishDetector())).detectAsAdvertisement((AdPayload)JMockK.mockk(AdPayload.class, true), (Pair)JMockK.mockk(Pair.class, true), (Pair)JMockK.mockk(Pair.class, true), (Pair)JMockK.mockk(Pair.class, true));
   }

   @Test
   public void test_flagAsMusic_AdPayload_1_1929() {
      boolean var1 = ((SpLiteTextEnglishDetector)JMockK.spyk(new SpLiteTextEnglishDetector())).flagAsMusic((AdPayload)JMockK.mockk(AdPayload.class, true));
   }

   @Test
   public void test_getLoggerTag_1_1941() {
      String var1 = ((SpLiteTextEnglishDetector)JMockK.spyk(new SpLiteTextEnglishDetector())).getLoggerTag();
   }

   @Test
   public void test_getMeta_1_1921() {
      AdDetectorMeta var1 = ((SpLiteTextEnglishDetector)JMockK.spyk(new SpLiteTextEnglishDetector())).getMeta();
   }

   @Test
   public void test_getPackageName_1_1889() {
      String var1 = ((SpLiteTextEnglishDetector)JMockK.spyk(new SpLiteTextEnglishDetector())).getPackageName();
   }
}
