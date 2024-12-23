package ch.abertschi.adfree;

import ch.abertschi.adfree.ad.AdObservable;
import ch.abertschi.adfree.model.PreferencesFactory;
import ch.abertschi.adfree.plugin.PluginHandler;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class AdStateControllerTestFailed {
   @Test
   public void test_onAd_AdObservable_1_1045() {
      ((AdStateController)JMockK.spyk(new AdStateController((AudioController)JMockK.mockk(AudioController.class, true), (PluginHandler)JMockK.mockk(PluginHandler.class, true), (NotificationChannel)JMockK.mockk(NotificationChannel.class, true), (GoogleCastManager)JMockK.mockk(GoogleCastManager.class, true), (PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true)))).onAd((AdObservable)JMockK.mockk(AdObservable.class, true));
   }

   @Test
   public void test_onIgnoreAd_AdObservable_1_981() {
      ((AdStateController)JMockK.spyk(new AdStateController((AudioController)JMockK.mockk(AudioController.class, true), (PluginHandler)JMockK.mockk(PluginHandler.class, true), (NotificationChannel)JMockK.mockk(NotificationChannel.class, true), (GoogleCastManager)JMockK.mockk(GoogleCastManager.class, true), (PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true)))).onIgnoreAd((AdObservable)JMockK.mockk(AdObservable.class, true));
   }

   @Test
   public void test_onNoAd_AdObservable_1_1013() {
      ((AdStateController)JMockK.spyk(new AdStateController((AudioController)JMockK.mockk(AudioController.class, true), (PluginHandler)JMockK.mockk(PluginHandler.class, true), (NotificationChannel)JMockK.mockk(NotificationChannel.class, true), (GoogleCastManager)JMockK.mockk(GoogleCastManager.class, true), (PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true)))).onNoAd((AdObservable)JMockK.mockk(AdObservable.class, true));
   }
}
