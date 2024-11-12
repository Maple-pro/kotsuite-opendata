package ch.abertschi.adfree.detector;

import ch.abertschi.adfree.model.TextRepository;
import io.github.maples.jmockk.JMockK;
import org.junit.Assert;
import org.junit.Test;

public class UserDefinedTextDetectorTestSuccess {
   @Test
   public void test_canHandle_AdPayload_1_1693() {
      Object var1 = ((UserDefinedTextDetector)JMockK.spyk(new UserDefinedTextDetector((TextRepository)JMockK.mockk(TextRepository.class, true)))).canHandle((AdPayload)JMockK.mockk(AdPayload.class, true));
      Assert.assertEquals(new Integer(0), var1);
   }

   @Test
   public void test_flagAsMusic_AdPayload_1_1737() {
      Object var1 = ((UserDefinedTextDetector)JMockK.spyk(new UserDefinedTextDetector((TextRepository)JMockK.mockk(TextRepository.class, true)))).flagAsMusic((AdPayload)JMockK.mockk(AdPayload.class, true));
      Assert.assertEquals(new Integer(0), var1);
   }

   @Test
   public void test_getLoggerTag_1_1753() {
      Assert.assertEquals("UserDefinedTextDetector", ((UserDefinedTextDetector)JMockK.spyk(new UserDefinedTextDetector((TextRepository)JMockK.mockk(TextRepository.class, true)))).getLoggerTag());
   }

   @Test
   public void test_getMeta_1_1725() {
      AdDetectorMeta var1 = ((UserDefinedTextDetector)JMockK.spyk(new UserDefinedTextDetector((TextRepository)JMockK.mockk(TextRepository.class, true)))).getMeta();
   }
}
