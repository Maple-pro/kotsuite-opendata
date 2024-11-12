package ch.abertschi.adfree.detector;

import io.github.maples.jmockk.JMockK;
import org.junit.Assert;
import org.junit.Test;

public class NotificationActionDetectorTestSuccess {
   @Test
   public void test_canHandle_AdPayload_1_1949() {
      Object var1 = ((NotificationActionDetector)JMockK.spyk(new NotificationActionDetector())).canHandle((AdPayload)JMockK.mockk(AdPayload.class, true));
      Assert.assertEquals(new Integer(0), var1);
   }

   @Test
   public void test_getMeta_1_1973() {
      AdDetectorMeta var1 = ((NotificationActionDetector)JMockK.spyk(new NotificationActionDetector())).getMeta();
   }
}
