package ch.abertschi.adfree;

import ch.abertschi.adfree.model.PreferencesFactory;
import ch.abertschi.adfree.util.NotificationUtils;
import io.github.maples.jmockk.JMockK;
import kotlin.Pair;
import org.junit.Test;

public class NotificationChannelTestFailed {
   @Test
   public void test_buildAlwaysOnNotification_1_1105() {
      Pair var1 = ((NotificationChannel)JMockK.spyk(new NotificationChannel((NotificationUtils)JMockK.mockk(NotificationUtils.class, true), (PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true)))).buildAlwaysOnNotification();
   }

   @Test
   public void test_hideAlwaysOnNotification_1_1121() {
      ((NotificationChannel)JMockK.spyk(new NotificationChannel((NotificationUtils)JMockK.mockk(NotificationUtils.class, true), (PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true)))).hideAlwaysOnNotification();
   }

   @Test
   public void test_hideDefaultAdNotification_1_1137() {
      ((NotificationChannel)JMockK.spyk(new NotificationChannel((NotificationUtils)JMockK.mockk(NotificationUtils.class, true), (PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true)))).hideDefaultAdNotification();
   }

   @Test
   public void test_updateAdNotification_String_String_1_1153() {
      ((NotificationChannel)JMockK.spyk(new NotificationChannel((NotificationUtils)JMockK.mockk(NotificationUtils.class, true), (PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true)))).updateAdNotification("EDIUPUYYsmi", "D4JyzT9t5Ws+zrB2OzhTiMvRx9rHcb6fRz8BUzztQYI-Qa0fB+7-zsDevlPMTts3VorrcbWp2vTE6n");
   }
}
