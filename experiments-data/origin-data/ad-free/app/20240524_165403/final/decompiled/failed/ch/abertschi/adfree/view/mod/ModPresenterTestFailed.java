package ch.abertschi.adfree.view.mod;

import ch.abertschi.adfree.ListenerStatus;
import ch.abertschi.adfree.model.PreferencesFactory;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class ModPresenterTestFailed {
   @Test
   public void test_onEnableToggleChanged_1_4277() {
      ((ModPresenter)JMockK.spyk(new ModPresenter((ModActivity)JMockK.mockk(ModActivity.class, true), (PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true)))).onEnableToggleChanged();
   }

   @Test
   public void test_onGoogleCastToggle_1_4325() {
      ((ModPresenter)JMockK.spyk(new ModPresenter((ModActivity)JMockK.mockk(ModActivity.class, true), (PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true)))).onGoogleCastToggle();
   }

   @Test
   public void test_onLaunchActiveDetectorsView_1_4293() {
      ((ModPresenter)JMockK.spyk(new ModPresenter((ModActivity)JMockK.mockk(ModActivity.class, true), (PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true)))).onLaunchActiveDetectorsView();
   }

   @Test
   public void test_onLaunchNotificationListenerSystemSettings_1_4309() {
      ((ModPresenter)JMockK.spyk(new ModPresenter((ModActivity)JMockK.mockk(ModActivity.class, true), (PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true)))).onLaunchNotificationListenerSystemSettings();
   }

   @Test
   public void test_onStatusChanged_ListenerStatus_1_4209() {
      ((ModPresenter)JMockK.spyk(new ModPresenter((ModActivity)JMockK.mockk(ModActivity.class, true), (PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true)))).onStatusChanged((ListenerStatus)JMockK.mockk(ListenerStatus.class, true));
   }

   @Test
   public void test_onToggleAlwaysOnChanged_1_4229() {
      ((ModPresenter)JMockK.spyk(new ModPresenter((ModActivity)JMockK.mockk(ModActivity.class, true), (PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true)))).onToggleAlwaysOnChanged();
   }
}
