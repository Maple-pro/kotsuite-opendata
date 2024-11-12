package ch.abertschi.adfree.detector;

import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class NotificationActionDetectorTestFailed {
   @Test
   public void test_flagAsAdvertisement_AdPayload_1_1961() {
      boolean var1 = ((NotificationActionDetector)JMockK.spyk(new NotificationActionDetector())).flagAsAdvertisement((AdPayload)JMockK.mockk(AdPayload.class, true));
   }
}
