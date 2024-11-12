package ch.abertschi.adfree.detector;

import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class NotificationBundleAndroidTextDetectorTestFailed {
   @Test
   public void test_canHandle_AdPayload_1_2157() {
      boolean var1 = ((NotificationBundleAndroidTextDetector)JMockK.spyk(new NotificationBundleAndroidTextDetector())).canHandle((AdPayload)JMockK.mockk(AdPayload.class, true));
   }

   @Test
   public void test_flagAsAdvertisement_AdPayload_1_2169() {
      boolean var1 = ((NotificationBundleAndroidTextDetector)JMockK.spyk(new NotificationBundleAndroidTextDetector())).flagAsAdvertisement((AdPayload)JMockK.mockk(AdPayload.class, true));
   }

   @Test
   public void test_getMeta_1_2181() {
      AdDetectorMeta var1 = ((NotificationBundleAndroidTextDetector)JMockK.spyk(new NotificationBundleAndroidTextDetector())).getMeta();
   }
}
