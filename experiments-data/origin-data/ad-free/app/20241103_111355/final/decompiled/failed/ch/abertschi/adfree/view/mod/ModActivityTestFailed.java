package ch.abertschi.adfree.view.mod;

import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class ModActivityTestFailed {
   @Test
   public void test_getLoggerTag_1_4201() {
      String var1 = ((ModActivity)JMockK.spyk(new ModActivity())).getLoggerTag();
   }

   @Test
   public void test_hideDeveloperModeFeatures_1_4185() {
      ((ModActivity)JMockK.spyk(new ModActivity())).hideDeveloperModeFeatures();
   }

   @Test
   public void test_setDelayValue_int_1_4129() {
      ((ModActivity)JMockK.spyk(new ModActivity())).setDelayValue(52);
   }

   @Test
   public void test_setEnableToggle_boolean_1_4137() {
      ((ModActivity)JMockK.spyk(new ModActivity())).setEnableToggle(false);
   }

   @Test
   public void test_setGoogleCastToggle_boolean_1_4145() {
      ((ModActivity)JMockK.spyk(new ModActivity())).setGoogleCastToggle(false);
   }

   @Test
   public void test_setNotificationEnabled_boolean_1_4153() {
      ((ModActivity)JMockK.spyk(new ModActivity())).setNotificationEnabled(true);
   }

   @Test
   public void test_showDelayUnmute_1_4121() {
      ((ModActivity)JMockK.spyk(new ModActivity())).showDelayUnmute();
   }

   @Test
   public void test_showDetectorCount_int_int_1_4113() {
      ((ModActivity)JMockK.spyk(new ModActivity())).showDetectorCount(-18, -17);
   }

   @Test
   public void test_showDeveloperModeFeatures_1_4193() {
      ((ModActivity)JMockK.spyk(new ModActivity())).showDeveloperModeFeatures();
   }

   @Test
   public void test_showNotifiationListenerConnected_1_4169() {
      ((ModActivity)JMockK.spyk(new ModActivity())).showNotifiationListenerConnected();
   }

   @Test
   public void test_showNotificationListenerDisconnected_1_4177() {
      ((ModActivity)JMockK.spyk(new ModActivity())).showNotificationListenerDisconnected();
   }

   @Test
   public void test_showPowerEnabled_1_4161() {
      ((ModActivity)JMockK.spyk(new ModActivity())).showPowerEnabled();
   }
}
