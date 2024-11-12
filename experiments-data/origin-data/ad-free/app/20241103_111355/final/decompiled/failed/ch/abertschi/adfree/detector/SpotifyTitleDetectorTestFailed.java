package ch.abertschi.adfree.detector;

import ch.abertschi.adfree.model.TrackRepository;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class SpotifyTitleDetectorTestFailed {
   @Test
   public void test_canHandle_AdPayload_1_2393() {
      boolean var1 = ((SpotifyTitleDetector)JMockK.spyk(new SpotifyTitleDetector((TrackRepository)JMockK.mockk(TrackRepository.class, true)))).canHandle((AdPayload)JMockK.mockk(AdPayload.class, true));
   }

   @Test
   public void test_flagAsAdvertisement_AdPayload_1_2409() {
      boolean var1 = ((SpotifyTitleDetector)JMockK.spyk(new SpotifyTitleDetector((TrackRepository)JMockK.mockk(TrackRepository.class, true)))).flagAsAdvertisement((AdPayload)JMockK.mockk(AdPayload.class, true));
   }

   @Test
   public void test_flagAsMusic_AdPayload_1_2425() {
      boolean var1 = ((SpotifyTitleDetector)JMockK.spyk(new SpotifyTitleDetector((TrackRepository)JMockK.mockk(TrackRepository.class, true)))).flagAsMusic((AdPayload)JMockK.mockk(AdPayload.class, true));
   }

   @Test
   public void test_getMeta_1_2457() {
      AdDetectorMeta var1 = ((SpotifyTitleDetector)JMockK.spyk(new SpotifyTitleDetector((TrackRepository)JMockK.mockk(TrackRepository.class, true)))).getMeta();
   }

   @Test
   public void test_getTitle_AdPayload_1_2441() {
      String var1 = ((SpotifyTitleDetector)JMockK.spyk(new SpotifyTitleDetector((TrackRepository)JMockK.mockk(TrackRepository.class, true)))).getTitle((AdPayload)JMockK.mockk(AdPayload.class, true));
   }
}
