package ch.abertschi.adfree.plugin.localmusic;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import ch.abertschi.adfree.plugin.PluginActivityAction;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class LocalMusicViewTestFailed {
   @Test
   public void test_getLoggerTag_1_3657() {
      String var1 = ((LocalMusicView)JMockK.spyk(new LocalMusicView((Context)JMockK.mockk(Context.class, true), (PluginActivityAction)JMockK.mockk(PluginActivityAction.class, true)))).getLoggerTag();
   }

   @Test
   public void test_hideLoopMusic_boolean_1_3625() {
      ((LocalMusicView)JMockK.spyk(new LocalMusicView((Context)JMockK.mockk(Context.class, true), (PluginActivityAction)JMockK.mockk(PluginActivityAction.class, true)))).hideLoopMusic(false);
   }

   @Test
   public void test_showAudioDirectoryPath_String_1_3641() {
      ((LocalMusicView)JMockK.spyk(new LocalMusicView((Context)JMockK.mockk(Context.class, true), (PluginActivityAction)JMockK.mockk(PluginActivityAction.class, true)))).showAudioDirectoryPath("Cf4Eswm6QbSJ2zrsLgAJcE-uiM03x+We-sGLRO02uNmwxzQwcqJuwBwjuE8mhFsmD1Dna7MbEnbrmrTA75QNIdlsL227p");
   }

   @Test
   public void test_showAudioError_1_3593() {
      ((LocalMusicView)JMockK.spyk(new LocalMusicView((Context)JMockK.mockk(Context.class, true), (PluginActivityAction)JMockK.mockk(PluginActivityAction.class, true)))).showAudioError();
   }

   @Test
   public void test_showErrorInChoosingDirectory_String_1_3561() {
      ((LocalMusicView)JMockK.spyk(new LocalMusicView((Context)JMockK.mockk(Context.class, true), (PluginActivityAction)JMockK.mockk(PluginActivityAction.class, true)))).showErrorInChoosingDirectory("viuAmk26+");
   }

   @Test
   public void test_showFolderSelectionDialog_1_3521() {
      ((LocalMusicView)JMockK.spyk(new LocalMusicView((Context)JMockK.mockk(Context.class, true), (PluginActivityAction)JMockK.mockk(PluginActivityAction.class, true)))).showFolderSelectionDialog();
   }

   @Test
   public void test_showLoopEnabled_boolean_1_3505() {
      ((LocalMusicView)JMockK.spyk(new LocalMusicView((Context)JMockK.mockk(Context.class, true), (PluginActivityAction)JMockK.mockk(PluginActivityAction.class, true)))).showLoopEnabled(true);
   }

   @Test
   public void test_showNeedStoragePermissions_1_3609() {
      ((LocalMusicView)JMockK.spyk(new LocalMusicView((Context)JMockK.mockk(Context.class, true), (PluginActivityAction)JMockK.mockk(PluginActivityAction.class, true)))).showNeedStoragePermissions();
   }

   @Test
   public void test_showNoAudioTracksFoundMessage_1_3577() {
      ((LocalMusicView)JMockK.spyk(new LocalMusicView((Context)JMockK.mockk(Context.class, true), (PluginActivityAction)JMockK.mockk(PluginActivityAction.class, true)))).showNoAudioTracksFoundMessage();
   }

   @Test
   public void test_showPlayUntilEndEnabled_boolean_1_3489() {
      ((LocalMusicView)JMockK.spyk(new LocalMusicView((Context)JMockK.mockk(Context.class, true), (PluginActivityAction)JMockK.mockk(PluginActivityAction.class, true)))).showPlayUntilEndEnabled(true);
   }

   @Test
   public void test_startActivityForResult_Intent_int_Bundle_1_3537() {
      ((LocalMusicView)JMockK.spyk(new LocalMusicView((Context)JMockK.mockk(Context.class, true), (PluginActivityAction)JMockK.mockk(PluginActivityAction.class, true)))).startActivityForResult((Intent)JMockK.mockk(Intent.class, true), -7, (Bundle)JMockK.mockk(Bundle.class, true));
   }
}
