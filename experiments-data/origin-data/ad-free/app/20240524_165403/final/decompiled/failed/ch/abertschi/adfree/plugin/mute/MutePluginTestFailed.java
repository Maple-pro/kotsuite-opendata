package ch.abertschi.adfree.plugin.mute;

import android.content.Context;
import android.view.View;
import ch.abertschi.adfree.plugin.PluginActivityAction;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class MutePluginTestFailed {
   @Test
   public void test_settingsView_Context_PluginActivityAction_1_3729() {
      View var1 = ((MutePlugin)JMockK.spyk(new MutePlugin())).settingsView((Context)JMockK.mockk(Context.class, true), (PluginActivityAction)JMockK.mockk(PluginActivityAction.class, true));
   }
}
