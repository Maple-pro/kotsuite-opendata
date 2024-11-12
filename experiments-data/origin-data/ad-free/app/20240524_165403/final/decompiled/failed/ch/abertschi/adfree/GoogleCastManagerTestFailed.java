package ch.abertschi.adfree;

import android.service.notification.StatusBarNotification;
import ch.abertschi.adfree.model.PreferencesFactory;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class GoogleCastManagerTestFailed {
   @Test
   public void test_muteAudio_1_1313() {
      ((GoogleCastManager)JMockK.spyk(new GoogleCastManager((PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true)))).muteAudio();
   }

   @Test
   public void test_unmuteAudio_1_1325() {
      ((GoogleCastManager)JMockK.spyk(new GoogleCastManager((PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true)))).unmuteAudio();
   }

   @Test
   public void test_updateNotification_StatusBarNotification_1_1297() {
      ((GoogleCastManager)JMockK.spyk(new GoogleCastManager((PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true)))).updateNotification((StatusBarNotification)JMockK.mockk(StatusBarNotification.class, true));
   }
}
