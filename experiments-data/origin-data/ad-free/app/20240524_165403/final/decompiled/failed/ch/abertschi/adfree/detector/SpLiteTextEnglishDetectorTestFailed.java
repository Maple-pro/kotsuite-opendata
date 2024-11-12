package ch.abertschi.adfree.detector;

import io.github.maples.jmockk.JMockK;
import kotlin.Pair;
import org.junit.Test;

public class SpLiteTextEnglishDetectorTestFailed {
   @Test
   public void test_detectAsAdvertisement_AdPayload_Pair_Pair_Pair_1_1897() {
      boolean var1 = ((SpLiteTextEnglishDetector)JMockK.spyk(new SpLiteTextEnglishDetector())).detectAsAdvertisement((AdPayload)JMockK.mockk(AdPayload.class, true), (Pair)JMockK.mockk(Pair.class, true), (Pair)JMockK.mockk(Pair.class, true), (Pair)JMockK.mockk(Pair.class, true));
   }
}
