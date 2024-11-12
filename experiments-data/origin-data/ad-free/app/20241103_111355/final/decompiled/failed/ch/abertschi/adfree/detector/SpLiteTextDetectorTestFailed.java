package ch.abertschi.adfree.detector;

import io.github.maples.jmockk.JMockK;
import kotlin.Pair;
import org.junit.Test;

public class SpLiteTextDetectorTestFailed {
   @Test
   public void test_detectAsAdvertisement_AdPayload_Pair_Pair_Pair_1_1641() {
      boolean var1 = ((SpLiteTextDetector)JMockK.spyk(new SpLiteTextDetector())).detectAsAdvertisement((AdPayload)JMockK.mockk(AdPayload.class, true), (Pair)JMockK.mockk(Pair.class, true), (Pair)JMockK.mockk(Pair.class, true), (Pair)JMockK.mockk(Pair.class, true));
   }

   @Test
   public void test_flagAsMusic_AdPayload_1_1673() {
      boolean var1 = ((SpLiteTextDetector)JMockK.spyk(new SpLiteTextDetector())).flagAsMusic((AdPayload)JMockK.mockk(AdPayload.class, true));
   }

   @Test
   public void test_getLoggerTag_1_1685() {
      String var1 = ((SpLiteTextDetector)JMockK.spyk(new SpLiteTextDetector())).getLoggerTag();
   }

   @Test
   public void test_getMeta_1_1665() {
      AdDetectorMeta var1 = ((SpLiteTextDetector)JMockK.spyk(new SpLiteTextDetector())).getMeta();
   }

   @Test
   public void test_getPackageName_1_1633() {
      String var1 = ((SpLiteTextDetector)JMockK.spyk(new SpLiteTextDetector())).getPackageName();
   }
}
