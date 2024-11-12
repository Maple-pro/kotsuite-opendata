package ch.abertschi.adfree.detector;

import io.github.maples.jmockk.JMockK;
import org.junit.Assert;
import org.junit.Test;

public class MiuiNotificationDetectorTestSuccess {
   @Test
   public void test_canHandle_AdPayload_1_2313() {
      Object var1 = ((MiuiNotificationDetector)JMockK.spyk(new MiuiNotificationDetector())).canHandle((AdPayload)JMockK.mockk(AdPayload.class, true));
      Assert.assertEquals(new Integer(0), var1);
   }

   @Test
   public void test_getMeta_1_2337() {
      AdDetectorMeta var1 = ((MiuiNotificationDetector)JMockK.spyk(new MiuiNotificationDetector())).getMeta();
   }
}
