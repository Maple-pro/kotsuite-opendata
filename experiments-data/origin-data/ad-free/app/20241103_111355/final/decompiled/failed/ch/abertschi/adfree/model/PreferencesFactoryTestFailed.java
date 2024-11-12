package ch.abertschi.adfree.model;

import android.content.Context;
import android.content.SharedPreferences;
import ch.abertschi.adfree.detector.AdDetectable;
import io.github.maples.jmockk.JMockK;
import java.util.Date;
import org.junit.Test;

public class PreferencesFactoryTestFailed {
   @Test
   public void test_getActivePlugin_1_305() {
      String var1 = ((PreferencesFactory)JMockK.spyk(new PreferencesFactory((Context)JMockK.mockk(Context.class, true)))).getActivePlugin();
   }

   @Test
   public void test_getDelaySeconds_1_353() {
      int var1 = ((PreferencesFactory)JMockK.spyk(new PreferencesFactory((Context)JMockK.mockk(Context.class, true)))).getDelaySeconds();
   }

   @Test
   public void test_getLastUpdateInServiceDate_1_97() {
      Date var1 = ((PreferencesFactory)JMockK.spyk(new PreferencesFactory((Context)JMockK.mockk(Context.class, true)))).getLastUpdateInServiceDate();
   }

   @Test
   public void test_getLocalMusicDirectory_1_269() {
      String var1 = ((PreferencesFactory)JMockK.spyk(new PreferencesFactory((Context)JMockK.mockk(Context.class, true)))).getLocalMusicDirectory();
   }

   @Test
   public void test_getLoggerTag_1_433() {
      String var1 = ((PreferencesFactory)JMockK.spyk(new PreferencesFactory((Context)JMockK.mockk(Context.class, true)))).getLoggerTag();
   }

   @Test
   public void test_getLoopMusicPlayback_1_233() {
      boolean var1 = ((PreferencesFactory)JMockK.spyk(new PreferencesFactory((Context)JMockK.mockk(Context.class, true)))).getLoopMusicPlayback();
   }

   @Test
   public void test_getPlayUntilEnd_1_209() {
      boolean var1 = ((PreferencesFactory)JMockK.spyk(new PreferencesFactory((Context)JMockK.mockk(Context.class, true)))).getPlayUntilEnd();
   }

   @Test
   public void test_getPreferences_1_293() {
      SharedPreferences var1 = ((PreferencesFactory)JMockK.spyk(new PreferencesFactory((Context)JMockK.mockk(Context.class, true)))).getPreferences();
   }

   @Test
   public void test_isAdDetectableEnabled_AdDetectable_1_377() {
      boolean var1 = ((PreferencesFactory)JMockK.spyk(new PreferencesFactory((Context)JMockK.mockk(Context.class, true)))).isAdDetectableEnabled((AdDetectable)JMockK.mockk(AdDetectable.class, true));
   }

   @Test
   public void test_isAlwaysOnNotificationEnabled_1_329() {
      boolean var1 = ((PreferencesFactory)JMockK.spyk(new PreferencesFactory((Context)JMockK.mockk(Context.class, true)))).isAlwaysOnNotificationEnabled();
   }

   @Test
   public void test_isBlockingEnabled_1_73() {
      boolean var1 = ((PreferencesFactory)JMockK.spyk(new PreferencesFactory((Context)JMockK.mockk(Context.class, true)))).isBlockingEnabled();
   }

   @Test
   public void test_isDeveloperModeEnabled_1_409() {
      boolean var1 = ((PreferencesFactory)JMockK.spyk(new PreferencesFactory((Context)JMockK.mockk(Context.class, true)))).isDeveloperModeEnabled();
   }

   @Test
   public void test_isFirstRun_1_137() {
      boolean var1 = ((PreferencesFactory)JMockK.spyk(new PreferencesFactory((Context)JMockK.mockk(Context.class, true)))).isFirstRun();
   }

   @Test
   public void test_isGoogleCastEnabled_1_149() {
      boolean var1 = ((PreferencesFactory)JMockK.spyk(new PreferencesFactory((Context)JMockK.mockk(Context.class, true)))).isGoogleCastEnabled();
   }

   @Test
   public void test_loadStreaMusicAudioVolume_1_257() {
      int var1 = ((PreferencesFactory)JMockK.spyk(new PreferencesFactory((Context)JMockK.mockk(Context.class, true)))).loadStreaMusicAudioVolume();
   }

   @Test
   public void test_loadVoiceCallAudioVolume_1_185() {
      int var1 = ((PreferencesFactory)JMockK.spyk(new PreferencesFactory((Context)JMockK.mockk(Context.class, true)))).loadVoiceCallAudioVolume();
   }

   @Test
   public void test_saveAdDetectableEnable_boolean_AdDetectable_1_393() {
      ((PreferencesFactory)JMockK.spyk(new PreferencesFactory((Context)JMockK.mockk(Context.class, true)))).saveAdDetectableEnable(false, (AdDetectable)JMockK.mockk(AdDetectable.class, true));
   }

   @Test
   public void test_setActivePlugin_String_1_317() {
      ((PreferencesFactory)JMockK.spyk(new PreferencesFactory((Context)JMockK.mockk(Context.class, true)))).setActivePlugin("o5Ps44RjHKegskO7KAVXfLHPYhFSXiPE1v4I0eHYaO6Bi");
   }

   @Test
   public void test_setAlwaysOnNotification_boolean_1_341() {
      boolean var1 = ((PreferencesFactory)JMockK.spyk(new PreferencesFactory((Context)JMockK.mockk(Context.class, true)))).setAlwaysOnNotification(false);
   }

   @Test
   public void test_setBlockingEnabled_boolean_1_85() {
      ((PreferencesFactory)JMockK.spyk(new PreferencesFactory((Context)JMockK.mockk(Context.class, true)))).setBlockingEnabled(false);
   }

   @Test
   public void test_setDelaySeconds_int_1_365() {
      boolean var1 = ((PreferencesFactory)JMockK.spyk(new PreferencesFactory((Context)JMockK.mockk(Context.class, true)))).setDelaySeconds(-30);
   }

   @Test
   public void test_setDeveloperMode_boolean_1_421() {
      boolean var1 = ((PreferencesFactory)JMockK.spyk(new PreferencesFactory((Context)JMockK.mockk(Context.class, true)))).setDeveloperMode(false);
   }

   @Test
   public void test_setFirstRun_1_125() {
      ((PreferencesFactory)JMockK.spyk(new PreferencesFactory((Context)JMockK.mockk(Context.class, true)))).setFirstRun();
   }

   @Test
   public void test_setGoogleCastEnabled_boolean_1_161() {
      boolean var1 = ((PreferencesFactory)JMockK.spyk(new PreferencesFactory((Context)JMockK.mockk(Context.class, true)))).setGoogleCastEnabled(false);
   }

   @Test
   public void test_setLastUpdateInServiceDate_Date_1_109() {
      ((PreferencesFactory)JMockK.spyk(new PreferencesFactory((Context)JMockK.mockk(Context.class, true)))).setLastUpdateInServiceDate((Date)JMockK.mockk(Date.class, true));
   }

   @Test
   public void test_setLocalMusicDirectory_String_1_281() {
      boolean var1 = ((PreferencesFactory)JMockK.spyk(new PreferencesFactory((Context)JMockK.mockk(Context.class, true)))).setLocalMusicDirectory("omVzwcuVHp6xtPTtskWpJR-K1pnN1KXfgqjGQQZCDF+1t9PXV5Q0LAzQH0Xm77X+KBwC+81sRT");
   }

   @Test
   public void test_setLoopMusicPlayback_boolean_1_221() {
      boolean var1 = ((PreferencesFactory)JMockK.spyk(new PreferencesFactory((Context)JMockK.mockk(Context.class, true)))).setLoopMusicPlayback(false);
   }

   @Test
   public void test_setPlayUntilEnd_boolean_1_197() {
      boolean var1 = ((PreferencesFactory)JMockK.spyk(new PreferencesFactory((Context)JMockK.mockk(Context.class, true)))).setPlayUntilEnd(true);
   }

   @Test
   public void test_storeStreamMusicAudioVolume_int_1_245() {
      boolean var1 = ((PreferencesFactory)JMockK.spyk(new PreferencesFactory((Context)JMockK.mockk(Context.class, true)))).storeStreamMusicAudioVolume(62);
   }

   @Test
   public void test_storeVoiceCallAudioVolume_int_1_173() {
      boolean var1 = ((PreferencesFactory)JMockK.spyk(new PreferencesFactory((Context)JMockK.mockk(Context.class, true)))).storeVoiceCallAudioVolume(31);
   }
}
