package ch.abertschi.adfree.presenter;

import ch.abertschi.adfree.model.PreferencesFactory;
import ch.abertschi.adfree.view.about.AboutView;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class MainActivityPresenterTestFailed {
   @Test
   public void test_getLoggerTag_1_2677() {
      String var1 = ((MainActivityPresenter)JMockK.spyk(new MainActivityPresenter((AboutView)JMockK.mockk(AboutView.class, true), (PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true)))).getLoggerTag();
   }
}
