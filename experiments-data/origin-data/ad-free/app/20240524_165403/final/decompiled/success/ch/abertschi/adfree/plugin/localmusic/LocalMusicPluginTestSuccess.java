package ch.abertschi.adfree.plugin.localmusic;

import android.content.Context;
import android.content.Intent;
import ch.abertschi.adfree.AudioController;
import ch.abertschi.adfree.model.PreferencesFactory;
import ch.abertschi.adfree.model.YesNoModel;
import io.github.maples.jmockk.JMockK;
import org.junit.Assert;
import org.junit.Test;

public class LocalMusicPluginTestSuccess {
   @Test
   public void test_getLoggerTag_1_3465() {
      Assert.assertEquals("LocalMusicPlugin", ((LocalMusicPlugin)JMockK.spyk(new LocalMusicPlugin((Context)JMockK.mockk(Context.class, true), (PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true), (AudioController)JMockK.mockk(AudioController.class, true), (YesNoModel)JMockK.mockk(YesNoModel.class, true)))).getLoggerTag());
   }

   @Test
   public void test_hasSettingsView_1_3173() {
      Object var1 = ((LocalMusicPlugin)JMockK.spyk(new LocalMusicPlugin((Context)JMockK.mockk(Context.class, true), (PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true), (AudioController)JMockK.mockk(AudioController.class, true), (YesNoModel)JMockK.mockk(YesNoModel.class, true)))).hasSettingsView();
      Assert.assertEquals(new Integer(1), var1);
   }

   @Test
   public void test_onActivityResult_int_int_Intent_1_3389() {
      ((LocalMusicPlugin)JMockK.spyk(new LocalMusicPlugin((Context)JMockK.mockk(Context.class, true), (PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true), (AudioController)JMockK.mockk(AudioController.class, true), (YesNoModel)JMockK.mockk(YesNoModel.class, true)))).onActivityResult(-48, -39, (Intent)JMockK.mockk(Intent.class, true));
   }

   @Test
   public void test_onConfigureAudioVolume_1_3341() {
      ((LocalMusicPlugin)JMockK.spyk(new LocalMusicPlugin((Context)JMockK.mockk(Context.class, true), (PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true), (AudioController)JMockK.mockk(AudioController.class, true), (YesNoModel)JMockK.mockk(YesNoModel.class, true)))).onConfigureAudioVolume();
   }

   @Test
   public void test_onLoopPlaybackChanged_1_3441() {
      ((LocalMusicPlugin)JMockK.spyk(new LocalMusicPlugin((Context)JMockK.mockk(Context.class, true), (PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true), (AudioController)JMockK.mockk(AudioController.class, true), (YesNoModel)JMockK.mockk(YesNoModel.class, true)))).onLoopPlaybackChanged();
   }

   @Test
   public void test_onPlayUntilEndChanged_1_3417() {
      ((LocalMusicPlugin)JMockK.spyk(new LocalMusicPlugin((Context)JMockK.mockk(Context.class, true), (PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true), (AudioController)JMockK.mockk(AudioController.class, true), (YesNoModel)JMockK.mockk(YesNoModel.class, true)))).onPlayUntilEndChanged();
   }

   @Test
   public void test_onPluginActivated_1_3269() {
      ((LocalMusicPlugin)JMockK.spyk(new LocalMusicPlugin((Context)JMockK.mockk(Context.class, true), (PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true), (AudioController)JMockK.mockk(AudioController.class, true), (YesNoModel)JMockK.mockk(YesNoModel.class, true)))).onPluginActivated();
   }

   @Test
   public void test_onPluginDeactivated_1_3293() {
      ((LocalMusicPlugin)JMockK.spyk(new LocalMusicPlugin((Context)JMockK.mockk(Context.class, true), (PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true), (AudioController)JMockK.mockk(AudioController.class, true), (YesNoModel)JMockK.mockk(YesNoModel.class, true)))).onPluginDeactivated();
   }

   @Test
   public void test_onPluginLoaded_1_3245() {
      ((LocalMusicPlugin)JMockK.spyk(new LocalMusicPlugin((Context)JMockK.mockk(Context.class, true), (PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true), (AudioController)JMockK.mockk(AudioController.class, true), (YesNoModel)JMockK.mockk(YesNoModel.class, true)))).onPluginLoaded();
   }

   @Test
   public void test_title_1_3317() {
      Assert.assertEquals("local music", ((LocalMusicPlugin)JMockK.spyk(new LocalMusicPlugin((Context)JMockK.mockk(Context.class, true), (PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true), (AudioController)JMockK.mockk(AudioController.class, true), (YesNoModel)JMockK.mockk(YesNoModel.class, true)))).title());
   }
}
