package ch.abertschi.adfree.detector;

import io.github.maples.jmockk.JMockK;
import kotlin.Pair;
import org.junit.Test;

public class BestEffortTextDetectorTestFailed {
   @Test
   public void test_detectAsAdvertisement_AdPayload_Pair_Pair_Pair_1_1545() {
      boolean var1 = ((BestEffortTextDetector)JMockK.spyk(new BestEffortTextDetector())).detectAsAdvertisement((AdPayload)JMockK.mockk(AdPayload.class, true), (Pair)JMockK.mockk(Pair.class, true), (Pair)JMockK.mockk(Pair.class, true), (Pair)JMockK.mockk(Pair.class, true));
   }

   @Test
   public void test_getPackageName_1_1537() {
      String var1 = ((BestEffortTextDetector)JMockK.spyk(new BestEffortTextDetector())).getPackageName();
   }
}
