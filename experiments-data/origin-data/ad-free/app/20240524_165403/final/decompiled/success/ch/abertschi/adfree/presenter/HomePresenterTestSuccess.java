package ch.abertschi.adfree.presenter;

import ch.abertschi.adfree.model.PreferencesFactory;
import ch.abertschi.adfree.model.RemoteManager;
import ch.abertschi.adfree.view.home.HomeView;
import io.github.maples.jmockk.JMockK;
import org.junit.Assert;
import org.junit.Test;

public class HomePresenterTestSuccess {
   @Test
   public void test_getLoggerTag_1_2797() {
      Assert.assertEquals("HomePresenter", ((HomePresenter)JMockK.spyk(new HomePresenter((HomeView)JMockK.mockk(HomeView.class, true), (PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true), (RemoteManager)JMockK.mockk(RemoteManager.class, true)))).getLoggerTag());
   }
}
