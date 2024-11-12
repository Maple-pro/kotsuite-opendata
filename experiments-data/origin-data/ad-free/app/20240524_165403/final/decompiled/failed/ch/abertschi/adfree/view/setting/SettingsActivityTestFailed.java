package ch.abertschi.adfree.view.setting;

import android.app.Activity;
import android.view.View;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class SettingsActivityTestFailed {
   @Test
   public void test_activity_1_3745() {
      Activity var1 = ((SettingsActivity)JMockK.spyk(new SettingsActivity())).activity();
   }

   @Test
   public void test_setPluginView_View_1_3761() {
      ((SettingsActivity)JMockK.spyk(new SettingsActivity())).setPluginView((View)JMockK.mockk(View.class, true));
   }

   @Test
   public void test_showSuggestNewPlugin_1_3781() {
      ((SettingsActivity)JMockK.spyk(new SettingsActivity())).showSuggestNewPlugin();
   }

   @Test
   public void test_showTryOutMessage_1_3789() {
      ((SettingsActivity)JMockK.spyk(new SettingsActivity())).showTryOutMessage();
   }
}
