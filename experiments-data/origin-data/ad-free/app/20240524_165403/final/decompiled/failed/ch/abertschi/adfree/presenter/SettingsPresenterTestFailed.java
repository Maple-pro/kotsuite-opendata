package ch.abertschi.adfree.presenter;

import android.content.Context;
import ch.abertschi.adfree.ad.AdObservable;
import ch.abertschi.adfree.plugin.PluginHandler;
import ch.abertschi.adfree.view.setting.SettingsView;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class SettingsPresenterTestFailed {
   @Test
   public void test_onPluginSelected_int_1_2581() {
      ((SettingsPresenter)JMockK.spyk(new SettingsPresenter((SettingsView)JMockK.mockk(SettingsView.class, true), (Context)JMockK.mockk(Context.class, true), (PluginHandler)JMockK.mockk(PluginHandler.class, true), (AdObservable)JMockK.mockk(AdObservable.class, true)))).onPluginSelected(-62);
   }

   @Test
   public void test_onPluginSelected_int_2_2588() {
      ((SettingsPresenter)JMockK.spyk(new SettingsPresenter((SettingsView)JMockK.mockk(SettingsView.class, true), (Context)JMockK.mockk(Context.class, true), (PluginHandler)JMockK.mockk(PluginHandler.class, true), (AdObservable)JMockK.mockk(AdObservable.class, true)))).onPluginSelected(17);
   }
}
