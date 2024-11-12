package ch.abertschi.adfree.ad;

import ch.abertschi.adfree.detector.AdPayload;
import ch.abertschi.adfree.model.AdDetectableFactory;
import ch.abertschi.adfree.model.RemoteManager;
import io.github.maples.jmockk.JMockK;
import org.junit.Assert;
import org.junit.Test;

public class AdDetectorTestSuccess {
   @Test
   public void test_addObserver_AdObserver_1_717() {
      ((AdDetector)JMockK.spyk(new AdDetector((AdDetectableFactory)JMockK.mockk(AdDetectableFactory.class, true), (RemoteManager)JMockK.mockk(RemoteManager.class, true)))).addObserver((AdObserver)JMockK.mockk(AdObserver.class, true));
   }

   @Test
   public void test_applyDetectors_AdPayload_1_613() {
      ((AdDetector)JMockK.spyk(new AdDetector((AdDetectableFactory)JMockK.mockk(AdDetectableFactory.class, true), (RemoteManager)JMockK.mockk(RemoteManager.class, true)))).applyDetectors((AdPayload)JMockK.mockk(AdPayload.class, true));
   }

   @Test
   public void test_deleteObserver_AdObserver_1_737() {
      ((AdDetector)JMockK.spyk(new AdDetector((AdDetectableFactory)JMockK.mockk(AdDetectableFactory.class, true), (RemoteManager)JMockK.mockk(RemoteManager.class, true)))).deleteObserver((AdObserver)JMockK.mockk(AdObserver.class, true));
   }

   @Test
   public void test_getLoggerTag_1_757() {
      Assert.assertEquals("AdDetector", ((AdDetector)JMockK.spyk(new AdDetector((AdDetectableFactory)JMockK.mockk(AdDetectableFactory.class, true), (RemoteManager)JMockK.mockk(RemoteManager.class, true)))).getLoggerTag());
   }

   @Test
   public void test_notifyObservers_AdEvent_1_633() {
      ((AdDetector)JMockK.spyk(new AdDetector((AdDetectableFactory)JMockK.mockk(AdDetectableFactory.class, true), (RemoteManager)JMockK.mockk(RemoteManager.class, true)))).notifyObservers((AdEvent)JMockK.mockk(AdEvent.class, true));
   }

   @Test
   public void test_requestAd_1_701() {
      ((AdDetector)JMockK.spyk(new AdDetector((AdDetectableFactory)JMockK.mockk(AdDetectableFactory.class, true), (RemoteManager)JMockK.mockk(RemoteManager.class, true)))).requestAd();
   }

   @Test
   public void test_requestIgnoreAd_1_669() {
      ((AdDetector)JMockK.spyk(new AdDetector((AdDetectableFactory)JMockK.mockk(AdDetectableFactory.class, true), (RemoteManager)JMockK.mockk(RemoteManager.class, true)))).requestIgnoreAd();
   }

   @Test
   public void test_requestNoAd_1_653() {
      ((AdDetector)JMockK.spyk(new AdDetector((AdDetectableFactory)JMockK.mockk(AdDetectableFactory.class, true), (RemoteManager)JMockK.mockk(RemoteManager.class, true)))).requestNoAd();
   }

   @Test
   public void test_requestShowcase_1_685() {
      ((AdDetector)JMockK.spyk(new AdDetector((AdDetectableFactory)JMockK.mockk(AdDetectableFactory.class, true), (RemoteManager)JMockK.mockk(RemoteManager.class, true)))).requestShowcase();
   }
}
