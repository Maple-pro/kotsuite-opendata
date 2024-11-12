package ch.abertschi.adfree.view.mod;

import ch.abertschi.adfree.model.PreferencesFactory;
import io.github.maples.jmockk.JMockK;
import org.junit.Assert;
import org.junit.Test;

public class ModPresenterTestSuccess {
   @Test
   public void test_getLoggerTag_1_4341() {
      Assert.assertEquals("ModPresenter", ((ModPresenter)JMockK.spyk(new ModPresenter((ModActivity)JMockK.mockk(ModActivity.class, true), (PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true)))).getLoggerTag());
   }

   @Test
   public void test_onDelayChanged_int_1_4261() {
      ((ModPresenter)JMockK.spyk(new ModPresenter((ModActivity)JMockK.mockk(ModActivity.class, true), (PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true)))).onDelayChanged(95);
   }

   @Test
   public void test_onDelayUnmute_1_4245() {
      ((ModPresenter)JMockK.spyk(new ModPresenter((ModActivity)JMockK.mockk(ModActivity.class, true), (PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true)))).onDelayUnmute();
   }
}
