package ch.abertschi.adfree.detector;

import io.github.maples.jmockk.JMockK;
import org.junit.Assert;
import org.junit.Test;

public class NotificationBundleAndroidTextDetectorTestSuccess {
   @Test
   public void test_canHandle_AdPayload_1_2157() {
      Object var1 = ((NotificationBundleAndroidTextDetector)JMockK.spyk(new NotificationBundleAndroidTextDetector())).canHandle((AdPayload)JMockK.mockk(AdPayload.class, true));
      Assert.assertEquals(new Integer(0), var1);
   }

   @Test
   public void test_getMeta_1_2181() {
      AdDetectorMeta var1 = ((NotificationBundleAndroidTextDetector)JMockK.spyk(new NotificationBundleAndroidTextDetector())).getMeta();
   }
}
