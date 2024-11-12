package ch.abertschi.adfree.plugin;

import ch.abertschi.adfree.ad.AdObservable;
import ch.abertschi.adfree.model.PreferencesFactory;
import io.github.maples.jmockk.JMockK;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class PluginHandlerTestSuccess {
   @Test
   public void test_getLoggerTag_1_893() {
      Assert.assertEquals("PluginHandler", ((PluginHandler)JMockK.spyk(new PluginHandler((PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true), (List)JMockK.mockk(List.class, true), (AdObservable)JMockK.mockk(AdObservable.class, true)))).getLoggerTag());
   }

   @Test
   public void test_runPlugin_1_853() {
      ((PluginHandler)JMockK.spyk(new PluginHandler((PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true), (List)JMockK.mockk(List.class, true), (AdObservable)JMockK.mockk(AdObservable.class, true)))).runPlugin();
   }

   @Test
   public void test_trialRunPlugin_1_873() {
      ((PluginHandler)JMockK.spyk(new PluginHandler((PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true), (List)JMockK.mockk(List.class, true), (AdObservable)JMockK.mockk(AdObservable.class, true)))).trialRunPlugin();
   }
}
