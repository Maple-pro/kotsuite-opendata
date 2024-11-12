package ch.abertschi.adfree.detector;

import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class DummySpotifyDetectorTestFailed {
   @Test
   public void test_flagAsAdvertisement_AdPayload_1_1817() {
      boolean var1 = ((DummySpotifyDetector)JMockK.spyk(new DummySpotifyDetector())).flagAsAdvertisement((AdPayload)JMockK.mockk(AdPayload.class, true));
   }

   @Test
   public void test_getMeta_1_1829() {
      AdDetectorMeta var1 = ((DummySpotifyDetector)JMockK.spyk(new DummySpotifyDetector())).getMeta();
   }
}
