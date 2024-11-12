package ch.abertschi.adfree.detector;

import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class MiuiNotificationDetectorTestFailed {
   @Test
   public void test_canHandle_AdPayload_1_2313() {
      boolean var1 = ((MiuiNotificationDetector)JMockK.spyk(new MiuiNotificationDetector())).canHandle((AdPayload)JMockK.mockk(AdPayload.class, true));
   }

   @Test
   public void test_flagAsAdvertisement_AdPayload_1_2325() {
      boolean var1 = ((MiuiNotificationDetector)JMockK.spyk(new MiuiNotificationDetector())).flagAsAdvertisement((AdPayload)JMockK.mockk(AdPayload.class, true));
   }

   @Test
   public void test_getMeta_1_2337() {
      AdDetectorMeta var1 = ((MiuiNotificationDetector)JMockK.spyk(new MiuiNotificationDetector())).getMeta();
   }
}
