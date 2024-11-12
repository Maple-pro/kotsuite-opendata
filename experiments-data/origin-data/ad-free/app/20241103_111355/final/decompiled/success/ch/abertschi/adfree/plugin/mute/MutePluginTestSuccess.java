package ch.abertschi.adfree.plugin.mute;

import io.github.maples.jmockk.JMockK;
import org.junit.Assert;
import org.junit.Test;

public class MutePluginTestSuccess {
   @Test
   public void test_hasSettingsView_1_3721() {
      Object var1 = ((MutePlugin)JMockK.spyk(new MutePlugin())).hasSettingsView();
      Assert.assertEquals(new Integer(0), var1);
   }

   @Test
   public void test_onPluginActivated_1_3705() {
      ((MutePlugin)JMockK.spyk(new MutePlugin())).onPluginActivated();
   }

   @Test
   public void test_onPluginDeactivated_1_3713() {
      ((MutePlugin)JMockK.spyk(new MutePlugin())).onPluginDeactivated();
   }

   @Test
   public void test_onPluginLoaded_1_3673() {
      ((MutePlugin)JMockK.spyk(new MutePlugin())).onPluginLoaded();
   }

   @Test
   public void test_playTrial_1_3697() {
      ((MutePlugin)JMockK.spyk(new MutePlugin())).playTrial();
   }

   @Test
   public void test_play_1_3689() {
      ((MutePlugin)JMockK.spyk(new MutePlugin())).play();
   }

   @Test
   public void test_title_1_3681() {
      Assert.assertEquals("mute audio", ((MutePlugin)JMockK.spyk(new MutePlugin())).title());
   }
}
