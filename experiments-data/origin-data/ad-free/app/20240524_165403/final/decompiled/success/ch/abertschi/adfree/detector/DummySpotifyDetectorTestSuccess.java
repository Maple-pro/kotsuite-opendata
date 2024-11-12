package ch.abertschi.adfree.detector;

import io.github.maples.jmockk.JMockK;
import org.junit.Assert;
import org.junit.Test;

public class DummySpotifyDetectorTestSuccess {
   @Test
   public void test_flagAsAdvertisement_AdPayload_1_1817() {
      Object var1 = ((DummySpotifyDetector)JMockK.spyk(new DummySpotifyDetector())).flagAsAdvertisement((AdPayload)JMockK.mockk(AdPayload.class, true));
      Assert.assertEquals(new Integer(1), var1);
   }

   @Test
   public void test_getMeta_1_1829() {
      AdDetectorMeta var1 = ((DummySpotifyDetector)JMockK.spyk(new DummySpotifyDetector())).getMeta();
   }
}
