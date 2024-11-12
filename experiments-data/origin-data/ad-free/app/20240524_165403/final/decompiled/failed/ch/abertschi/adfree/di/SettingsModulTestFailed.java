package ch.abertschi.adfree.di;

import android.content.Context;
import ch.abertschi.adfree.presenter.SettingsPresenter;
import ch.abertschi.adfree.view.setting.SettingsView;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class SettingsModulTestFailed {
   @Test
   public void test_provideSettingsPresenter_1_3905() {
      SettingsPresenter var1 = ((SettingsModul)JMockK.spyk(new SettingsModul((Context)JMockK.mockk(Context.class, true), (SettingsView)JMockK.mockk(SettingsView.class, true)))).provideSettingsPresenter();
   }
}
