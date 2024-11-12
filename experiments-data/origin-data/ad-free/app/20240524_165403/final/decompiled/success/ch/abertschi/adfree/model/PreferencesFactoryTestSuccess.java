package ch.abertschi.adfree.model;

import android.content.Context;
import android.content.SharedPreferences;
import ch.abertschi.adfree.detector.AdDetectable;
import io.github.maples.jmockk.JMockK;
import java.util.Date;
import org.junit.Assert;
import org.junit.Test;

public class PreferencesFactoryTestSuccess {
   @Test
   public void test_getActivePlugin_1_305() {
      String var1 = ((PreferencesFactory)JMockK.spyk(new PreferencesFactory((Context)JMockK.mockk(Context.class, true)))).getActivePlugin();
   }

   @Test
   public void test_getDelaySeconds_1_353() {
      Object var1 = ((PreferencesFactory)JMockK.spyk(new PreferencesFactory((Context)JMockK.mockk(Context.class, true)))).getDelaySeconds();
      Assert.assertEquals(new Integer(0), var1);
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
      Assert.assertEquals("PreferencesFactory", ((PreferencesFactory)JMockK.spyk(new PreferencesFactory((Context)JMockK.mockk(Context.class, true)))).getLoggerTag());
   }

   @Test
   public void test_getLoopMusicPlayback_1_233() {
      Object var1 = ((PreferencesFactory)JMockK.spyk(new PreferencesFactory((Context)JMockK.mockk(Context.class, true)))).getLoopMusicPlayback();
      Assert.assertEquals(new Integer(0), var1);
   }

   @Test
   public void test_getPlayUntilEnd_1_209() {
      Object var1 = ((PreferencesFactory)JMockK.spyk(new PreferencesFactory((Context)JMockK.mockk(Context.class, true)))).getPlayUntilEnd();
      Assert.assertEquals(new Integer(0), var1);
   }

   @Test
   public void test_getPreferences_1_293() {
      SharedPreferences var1 = ((PreferencesFactory)JMockK.spyk(new PreferencesFactory((Context)JMockK.mockk(Context.class, true)))).getPreferences();
   }

   @Test
   public void test_isAdDetectableEnabled_AdDetectable_1_377() {
      Object var1 = ((PreferencesFactory)JMockK.spyk(new PreferencesFactory((Context)JMockK.mockk(Context.class, true)))).isAdDetectableEnabled((AdDetectable)JMockK.mockk(AdDetectable.class, true));
      Assert.assertEquals(new Integer(0), var1);
   }

   @Test
   public void test_isAlwaysOnNotificationEnabled_1_329() {
      Object var1 = ((PreferencesFactory)JMockK.spyk(new PreferencesFactory((Context)JMockK.mockk(Context.class, true)))).isAlwaysOnNotificationEnabled();
      Assert.assertEquals(new Integer(0), var1);
   }

   @Test
   public void test_isBlockingEnabled_1_73() {
      Object var1 = ((PreferencesFactory)JMockK.spyk(new PreferencesFactory((Context)JMockK.mockk(Context.class, true)))).isBlockingEnabled();
      Assert.assertEquals(new Integer(0), var1);
   }

   @Test
   public void test_isDeveloperModeEnabled_1_409() {
      Object var1 = ((PreferencesFactory)JMockK.spyk(new PreferencesFactory((Context)JMockK.mockk(Context.class, true)))).isDeveloperModeEnabled();
      Assert.assertEquals(new Integer(0), var1);
   }

   @Test
   public void test_isFirstRun_1_137() {
      Object var1 = ((PreferencesFactory)JMockK.spyk(new PreferencesFactory((Context)JMockK.mockk(Context.class, true)))).isFirstRun();
      Assert.assertEquals(new Integer(0), var1);
   }

   @Test
   public void test_isGoogleCastEnabled_1_149() {
      Object var1 = ((PreferencesFactory)JMockK.spyk(new PreferencesFactory((Context)JMockK.mockk(Context.class, true)))).isGoogleCastEnabled();
      Assert.assertEquals(new Integer(0), var1);
   }

   @Test
   public void test_loadStreaMusicAudioVolume_1_257() {
      Object var1 = ((PreferencesFactory)JMockK.spyk(new PreferencesFactory((Context)JMockK.mockk(Context.class, true)))).loadStreaMusicAudioVolume();
      Assert.assertEquals(new Integer(0), var1);
   }

   @Test
   public void test_loadVoiceCallAudioVolume_1_185() {
      Object var1 = ((PreferencesFactory)JMockK.spyk(new PreferencesFactory((Context)JMockK.mockk(Context.class, true)))).loadVoiceCallAudioVolume();
      Assert.assertEquals(new Integer(0), var1);
   }

   @Test
   public void test_saveAdDetectableEnable_boolean_AdDetectable_1_393() {
      ((PreferencesFactory)JMockK.spyk(new PreferencesFactory((Context)JMockK.mockk(Context.class, true)))).saveAdDetectableEnable(true, (AdDetectable)JMockK.mockk(AdDetectable.class, true));
   }

   @Test
   public void test_setActivePlugin_String_1_317() {
      ((PreferencesFactory)JMockK.spyk(new PreferencesFactory((Context)JMockK.mockk(Context.class, true)))).setActivePlugin("gwD");
   }

   @Test
   public void test_setAlwaysOnNotification_boolean_1_341() {
      Object var1 = ((PreferencesFactory)JMockK.spyk(new PreferencesFactory((Context)JMockK.mockk(Context.class, true)))).setAlwaysOnNotification(true);
      Assert.assertEquals(new Integer(0), var1);
   }

   @Test
   public void test_setBlockingEnabled_boolean_1_85() {
      ((PreferencesFactory)JMockK.spyk(new PreferencesFactory((Context)JMockK.mockk(Context.class, true)))).setBlockingEnabled(false);
   }

   @Test
   public void test_setDelaySeconds_int_1_365() {
      Object var1 = ((PreferencesFactory)JMockK.spyk(new PreferencesFactory((Context)JMockK.mockk(Context.class, true)))).setDelaySeconds(80);
      Assert.assertEquals(new Integer(0), var1);
   }

   @Test
   public void test_setDeveloperMode_boolean_1_421() {
      Object var1 = ((PreferencesFactory)JMockK.spyk(new PreferencesFactory((Context)JMockK.mockk(Context.class, true)))).setDeveloperMode(false);
      Assert.assertEquals(new Integer(0), var1);
   }

   @Test
   public void test_setFirstRun_1_125() {
      ((PreferencesFactory)JMockK.spyk(new PreferencesFactory((Context)JMockK.mockk(Context.class, true)))).setFirstRun();
   }

   @Test
   public void test_setGoogleCastEnabled_boolean_1_161() {
      Object var1 = ((PreferencesFactory)JMockK.spyk(new PreferencesFactory((Context)JMockK.mockk(Context.class, true)))).setGoogleCastEnabled(true);
      Assert.assertEquals(new Integer(0), var1);
   }

   @Test
   public void test_setLastUpdateInServiceDate_Date_1_109() {
      ((PreferencesFactory)JMockK.spyk(new PreferencesFactory((Context)JMockK.mockk(Context.class, true)))).setLastUpdateInServiceDate((Date)JMockK.mockk(Date.class, true));
   }

   @Test
   public void test_setLocalMusicDirectory_String_1_281() {
      Object var1 = ((PreferencesFactory)JMockK.spyk(new PreferencesFactory((Context)JMockK.mockk(Context.class, true)))).setLocalMusicDirectory("TCDAW9-g44KL2BYv8mIHixddPLH2BSOi1");
      Assert.assertEquals(new Integer(0), var1);
   }

   @Test
   public void test_setLoopMusicPlayback_boolean_1_221() {
      Object var1 = ((PreferencesFactory)JMockK.spyk(new PreferencesFactory((Context)JMockK.mockk(Context.class, true)))).setLoopMusicPlayback(false);
      Assert.assertEquals(new Integer(0), var1);
   }

   @Test
   public void test_setPlayUntilEnd_boolean_1_197() {
      Object var1 = ((PreferencesFactory)JMockK.spyk(new PreferencesFactory((Context)JMockK.mockk(Context.class, true)))).setPlayUntilEnd(false);
      Assert.assertEquals(new Integer(0), var1);
   }

   @Test
   public void test_storeStreamMusicAudioVolume_int_1_245() {
      Object var1 = ((PreferencesFactory)JMockK.spyk(new PreferencesFactory((Context)JMockK.mockk(Context.class, true)))).storeStreamMusicAudioVolume(-16);
      Assert.assertEquals(new Integer(0), var1);
   }

   @Test
   public void test_storeVoiceCallAudioVolume_int_1_173() {
      Object var1 = ((PreferencesFactory)JMockK.spyk(new PreferencesFactory((Context)JMockK.mockk(Context.class, true)))).storeVoiceCallAudioVolume(-44);
      Assert.assertEquals(new Integer(0), var1);
   }
}
