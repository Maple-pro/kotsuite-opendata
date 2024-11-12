package ch.abertschi.adfree;

import ch.abertschi.adfree.model.PreferencesFactory;
import ch.abertschi.adfree.util.NotificationUtils;
import io.github.maples.jmockk.JMockK;
import kotlin.Pair;
import org.junit.Test;

public class NotificationChannelTestSuccess {
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
      ((NotificationChannel)JMockK.spyk(new NotificationChannel((NotificationUtils)JMockK.mockk(NotificationUtils.class, true), (PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true)))).updateAdNotification("NmLcV6Z9hcT3t27LywO13kXc4dj1cVu7Vq6xa6fWKYajC34", "c8Hf");
   }
}
