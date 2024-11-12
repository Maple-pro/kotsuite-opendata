package ch.abertschi.adfree.plugin.interdimcable;

import android.content.Context;
import android.view.View;
import ch.abertschi.adfree.AudioController;
import ch.abertschi.adfree.NotificationChannel;
import ch.abertschi.adfree.model.PreferencesFactory;
import ch.abertschi.adfree.plugin.PluginActivityAction;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class InterdimCablePluginTestFailed {
   @Test
   public void test_onPluginActivated_1_3029() {
      ((InterdimCablePlugin)JMockK.spyk(new InterdimCablePlugin((PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true), (AudioController)JMockK.mockk(AudioController.class, true), (Context)JMockK.mockk(Context.class, true), (NotificationChannel)JMockK.mockk(NotificationChannel.class, true)))).onPluginActivated();
   }

   @Test
   public void test_onPluginLoaded_1_3005() {
      ((InterdimCablePlugin)JMockK.spyk(new InterdimCablePlugin((PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true), (AudioController)JMockK.mockk(AudioController.class, true), (Context)JMockK.mockk(Context.class, true), (NotificationChannel)JMockK.mockk(NotificationChannel.class, true)))).onPluginLoaded();
   }

   @Test
   public void test_playTrial_1_3101() {
      ((InterdimCablePlugin)JMockK.spyk(new InterdimCablePlugin((PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true), (AudioController)JMockK.mockk(AudioController.class, true), (Context)JMockK.mockk(Context.class, true), (NotificationChannel)JMockK.mockk(NotificationChannel.class, true)))).playTrial();
   }

   @Test
   public void test_play_1_3077() {
      ((InterdimCablePlugin)JMockK.spyk(new InterdimCablePlugin((PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true), (AudioController)JMockK.mockk(AudioController.class, true), (Context)JMockK.mockk(Context.class, true), (NotificationChannel)JMockK.mockk(NotificationChannel.class, true)))).play();
   }

   @Test
   public void test_settingsView_Context_PluginActivityAction_1_2973() {
      View var1 = ((InterdimCablePlugin)JMockK.spyk(new InterdimCablePlugin((PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true), (AudioController)JMockK.mockk(AudioController.class, true), (Context)JMockK.mockk(Context.class, true), (NotificationChannel)JMockK.mockk(NotificationChannel.class, true)))).settingsView((Context)JMockK.mockk(Context.class, true), (PluginActivityAction)JMockK.mockk(PluginActivityAction.class, true));
   }
}
