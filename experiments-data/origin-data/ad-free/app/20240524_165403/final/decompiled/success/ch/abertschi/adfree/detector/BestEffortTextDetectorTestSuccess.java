package ch.abertschi.adfree.detector;

import io.github.maples.jmockk.JMockK;
import org.junit.Assert;
import org.junit.Test;

public class BestEffortTextDetectorTestSuccess {
   @Test
   public void test_canHandle_AdPayload_1_1525() {
      Object var1 = ((BestEffortTextDetector)JMockK.spyk(new BestEffortTextDetector())).canHandle((AdPayload)JMockK.mockk(AdPayload.class, true));
      Assert.assertEquals(new Integer(0), var1);
   }

   @Test
   public void test_getMeta_1_1569() {
      AdDetectorMeta var1 = ((BestEffortTextDetector)JMockK.spyk(new BestEffortTextDetector())).getMeta();
   }
}
