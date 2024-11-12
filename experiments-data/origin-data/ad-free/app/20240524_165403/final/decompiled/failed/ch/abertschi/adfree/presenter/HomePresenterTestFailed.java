package ch.abertschi.adfree.presenter;

import android.content.Context;
import ch.abertschi.adfree.model.PreferencesFactory;
import ch.abertschi.adfree.model.RemoteManager;
import ch.abertschi.adfree.view.home.HomeView;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class HomePresenterTestFailed {
   @Test
   public void test_hasNotificationPermission_Context_1_2733() {
      boolean var1 = ((HomePresenter)JMockK.spyk(new HomePresenter((HomeView)JMockK.mockk(HomeView.class, true), (PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true), (RemoteManager)JMockK.mockk(RemoteManager.class, true)))).hasNotificationPermission((Context)JMockK.mockk(Context.class, true));
   }

   @Test
   public void test_onTroubleshooting_1_2777() {
      ((HomePresenter)JMockK.spyk(new HomePresenter((HomeView)JMockK.mockk(HomeView.class, true), (PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true), (RemoteManager)JMockK.mockk(RemoteManager.class, true)))).onTroubleshooting();
   }

   @Test
   public void test_onUpdateMessageClicked_1_2757() {
      ((HomePresenter)JMockK.spyk(new HomePresenter((HomeView)JMockK.mockk(HomeView.class, true), (PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true), (RemoteManager)JMockK.mockk(RemoteManager.class, true)))).onUpdateMessageClicked();
   }
}
