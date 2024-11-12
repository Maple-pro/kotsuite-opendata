package ch.abertschi.adfree.view.setting;

import io.github.maples.jmockk.JMockK;
import org.junit.Assert;
import org.junit.Test;

public class SettingsActivityTestSuccess {
   @Test
   public void test_clearPluginView_1_3753() {
      ((SettingsActivity)JMockK.spyk(new SettingsActivity())).clearPluginView();
   }

   @Test
   public void test_getLoggerTag_1_3805() {
      Assert.assertEquals("SettingsActivity", ((SettingsActivity)JMockK.spyk(new SettingsActivity())).getLoggerTag());
   }

   @Test
   public void test_setActivePlugin_int_1_3773() {
      ((SettingsActivity)JMockK.spyk(new SettingsActivity())).setActivePlugin(52);
   }

   @Test
   public void test_signalizeTryOut_1_3797() {
      ((SettingsActivity)JMockK.spyk(new SettingsActivity())).signalizeTryOut();
   }
}
