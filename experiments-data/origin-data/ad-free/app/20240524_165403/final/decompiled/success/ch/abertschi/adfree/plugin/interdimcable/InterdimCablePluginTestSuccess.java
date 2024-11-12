package ch.abertschi.adfree.plugin.interdimcable;

import android.content.Context;
import ch.abertschi.adfree.AudioController;
import ch.abertschi.adfree.NotificationChannel;
import ch.abertschi.adfree.model.PreferencesFactory;
import io.github.maples.jmockk.JMockK;
import org.junit.Assert;
import org.junit.Test;

public class InterdimCablePluginTestSuccess {
   @Test
   public void test_configureAudioVolume_1_3125() {
      ((InterdimCablePlugin)JMockK.spyk(new InterdimCablePlugin((PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true), (AudioController)JMockK.mockk(AudioController.class, true), (Context)JMockK.mockk(Context.class, true), (NotificationChannel)JMockK.mockk(NotificationChannel.class, true)))).configureAudioVolume();
   }

   @Test
   public void test_getLoggerTag_1_3149() {
      Assert.assertEquals("InterdimCablePlugin", ((InterdimCablePlugin)JMockK.spyk(new InterdimCablePlugin((PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true), (AudioController)JMockK.mockk(AudioController.class, true), (Context)JMockK.mockk(Context.class, true), (NotificationChannel)JMockK.mockk(NotificationChannel.class, true)))).getLoggerTag());
   }

   @Test
   public void test_hasSettingsView_1_2949() {
      Object var1 = ((InterdimCablePlugin)JMockK.spyk(new InterdimCablePlugin((PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true), (AudioController)JMockK.mockk(AudioController.class, true), (Context)JMockK.mockk(Context.class, true), (NotificationChannel)JMockK.mockk(NotificationChannel.class, true)))).hasSettingsView();
      Assert.assertEquals(new Integer(1), var1);
   }

   @Test
   public void test_onPluginDeactivated_1_3053() {
      ((InterdimCablePlugin)JMockK.spyk(new InterdimCablePlugin((PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true), (AudioController)JMockK.mockk(AudioController.class, true), (Context)JMockK.mockk(Context.class, true), (NotificationChannel)JMockK.mockk(NotificationChannel.class, true)))).onPluginDeactivated();
   }

   @Test
   public void test_title_1_2925() {
      Assert.assertEquals("interdimensional cable", ((InterdimCablePlugin)JMockK.spyk(new InterdimCablePlugin((PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true), (AudioController)JMockK.mockk(AudioController.class, true), (Context)JMockK.mockk(Context.class, true), (NotificationChannel)JMockK.mockk(NotificationChannel.class, true)))).title());
   }
}
