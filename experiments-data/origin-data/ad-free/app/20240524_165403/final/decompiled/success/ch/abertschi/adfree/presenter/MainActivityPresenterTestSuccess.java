package ch.abertschi.adfree.presenter;

import ch.abertschi.adfree.model.PreferencesFactory;
import ch.abertschi.adfree.view.about.AboutView;
import io.github.maples.jmockk.JMockK;
import org.junit.Assert;
import org.junit.Test;

public class MainActivityPresenterTestSuccess {
   @Test
   public void test_getLoggerTag_1_2677() {
      Assert.assertEquals("MainActivityPresenter", ((MainActivityPresenter)JMockK.spyk(new MainActivityPresenter((AboutView)JMockK.mockk(AboutView.class, true), (PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true)))).getLoggerTag());
   }
}
