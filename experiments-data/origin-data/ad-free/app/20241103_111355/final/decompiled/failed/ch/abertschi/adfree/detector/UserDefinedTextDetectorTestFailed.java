package ch.abertschi.adfree.detector;

import ch.abertschi.adfree.model.TextRepository;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class UserDefinedTextDetectorTestFailed {
   @Test
   public void test_canHandle_AdPayload_1_1693() {
      boolean var1 = ((UserDefinedTextDetector)JMockK.spyk(new UserDefinedTextDetector((TextRepository)JMockK.mockk(TextRepository.class, true)))).canHandle((AdPayload)JMockK.mockk(AdPayload.class, true));
   }

   @Test
   public void test_flagAsAdvertisement_AdPayload_1_1709() {
      boolean var1 = ((UserDefinedTextDetector)JMockK.spyk(new UserDefinedTextDetector((TextRepository)JMockK.mockk(TextRepository.class, true)))).flagAsAdvertisement((AdPayload)JMockK.mockk(AdPayload.class, true));
   }

   @Test
   public void test_flagAsMusic_AdPayload_1_1737() {
      boolean var1 = ((UserDefinedTextDetector)JMockK.spyk(new UserDefinedTextDetector((TextRepository)JMockK.mockk(TextRepository.class, true)))).flagAsMusic((AdPayload)JMockK.mockk(AdPayload.class, true));
   }

   @Test
   public void test_getLoggerTag_1_1753() {
      String var1 = ((UserDefinedTextDetector)JMockK.spyk(new UserDefinedTextDetector((TextRepository)JMockK.mockk(TextRepository.class, true)))).getLoggerTag();
   }

   @Test
   public void test_getMeta_1_1725() {
      AdDetectorMeta var1 = ((UserDefinedTextDetector)JMockK.spyk(new UserDefinedTextDetector((TextRepository)JMockK.mockk(TextRepository.class, true)))).getMeta();
   }
}
