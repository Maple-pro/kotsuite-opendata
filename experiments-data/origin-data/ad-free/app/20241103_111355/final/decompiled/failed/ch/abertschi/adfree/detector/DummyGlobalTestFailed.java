package ch.abertschi.adfree.detector;

import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class DummyGlobalTestFailed {
   @Test
   public void test_canHandle_AdPayload_1_1837() {
      boolean var1 = ((DummyGlobal)JMockK.spyk(new DummyGlobal())).canHandle((AdPayload)JMockK.mockk(AdPayload.class, true));
   }

   @Test
   public void test_flagAsAdvertisement_AdPayload_1_1849() {
      boolean var1 = ((DummyGlobal)JMockK.spyk(new DummyGlobal())).flagAsAdvertisement((AdPayload)JMockK.mockk(AdPayload.class, true));
   }

   @Test
   public void test_flagAsMusic_AdPayload_1_1869() {
      boolean var1 = ((DummyGlobal)JMockK.spyk(new DummyGlobal())).flagAsMusic((AdPayload)JMockK.mockk(AdPayload.class, true));
   }

   @Test
   public void test_getLoggerTag_1_1881() {
      String var1 = ((DummyGlobal)JMockK.spyk(new DummyGlobal())).getLoggerTag();
   }

   @Test
   public void test_getMeta_1_1861() {
      AdDetectorMeta var1 = ((DummyGlobal)JMockK.spyk(new DummyGlobal())).getMeta();
   }
}
