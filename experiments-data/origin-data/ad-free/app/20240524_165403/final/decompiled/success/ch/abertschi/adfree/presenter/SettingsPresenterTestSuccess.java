package ch.abertschi.adfree.presenter;

import android.content.Context;
import ch.abertschi.adfree.ad.AdObservable;
import ch.abertschi.adfree.plugin.PluginHandler;
import ch.abertschi.adfree.view.setting.SettingsView;
import io.github.maples.jmockk.JMockK;
import org.junit.Assert;
import org.junit.Test;

public class SettingsPresenterTestSuccess {
   @Test
   public void test_getLoggerTag_1_2653() {
      Assert.assertEquals("SettingsPresenter", ((SettingsPresenter)JMockK.spyk(new SettingsPresenter((SettingsView)JMockK.mockk(SettingsView.class, true), (Context)JMockK.mockk(Context.class, true), (PluginHandler)JMockK.mockk(PluginHandler.class, true), (AdObservable)JMockK.mockk(AdObservable.class, true)))).getLoggerTag());
   }

   @Test
   public void test_getStringEntriesOfModel_1_2629() {
      String[] var1 = ((SettingsPresenter)JMockK.spyk(new SettingsPresenter((SettingsView)JMockK.mockk(SettingsView.class, true), (Context)JMockK.mockk(Context.class, true), (PluginHandler)JMockK.mockk(PluginHandler.class, true), (AdObservable)JMockK.mockk(AdObservable.class, true)))).getStringEntriesOfModel();
   }

   @Test
   public void test_tryPlugin_1_2605() {
      ((SettingsPresenter)JMockK.spyk(new SettingsPresenter((SettingsView)JMockK.mockk(SettingsView.class, true), (Context)JMockK.mockk(Context.class, true), (PluginHandler)JMockK.mockk(PluginHandler.class, true), (AdObservable)JMockK.mockk(AdObservable.class, true)))).tryPlugin();
   }
}
