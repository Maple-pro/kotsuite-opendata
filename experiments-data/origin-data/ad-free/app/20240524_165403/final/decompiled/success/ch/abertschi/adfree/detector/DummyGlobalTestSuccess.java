package ch.abertschi.adfree.detector;

import io.github.maples.jmockk.JMockK;
import org.junit.Assert;
import org.junit.Test;

public class DummyGlobalTestSuccess {
   @Test
   public void test_canHandle_AdPayload_1_1837() {
      Object var1 = ((DummyGlobal)JMockK.spyk(new DummyGlobal())).canHandle((AdPayload)JMockK.mockk(AdPayload.class, true));
      Assert.assertEquals(new Integer(1), var1);
   }

   @Test
   public void test_flagAsAdvertisement_AdPayload_1_1849() {
      Object var1 = ((DummyGlobal)JMockK.spyk(new DummyGlobal())).flagAsAdvertisement((AdPayload)JMockK.mockk(AdPayload.class, true));
      Assert.assertEquals(new Integer(1), var1);
   }

   @Test
   public void test_flagAsMusic_AdPayload_1_1869() {
      Object var1 = ((DummyGlobal)JMockK.spyk(new DummyGlobal())).flagAsMusic((AdPayload)JMockK.mockk(AdPayload.class, true));
      Assert.assertEquals(new Integer(0), var1);
   }

   @Test
   public void test_getLoggerTag_1_1881() {
      Assert.assertEquals("DummyGlobal", ((DummyGlobal)JMockK.spyk(new DummyGlobal())).getLoggerTag());
   }

   @Test
   public void test_getMeta_1_1861() {
      AdDetectorMeta var1 = ((DummyGlobal)JMockK.spyk(new DummyGlobal())).getMeta();
   }
}
