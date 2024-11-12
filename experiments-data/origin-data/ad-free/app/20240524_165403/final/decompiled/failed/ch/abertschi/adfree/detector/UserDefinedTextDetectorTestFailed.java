package ch.abertschi.adfree.detector;

import ch.abertschi.adfree.model.TextRepository;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class UserDefinedTextDetectorTestFailed {
   @Test
   public void test_flagAsAdvertisement_AdPayload_1_1709() {
      boolean var1 = ((UserDefinedTextDetector)JMockK.spyk(new UserDefinedTextDetector((TextRepository)JMockK.mockk(TextRepository.class, true)))).flagAsAdvertisement((AdPayload)JMockK.mockk(AdPayload.class, true));
   }
}
