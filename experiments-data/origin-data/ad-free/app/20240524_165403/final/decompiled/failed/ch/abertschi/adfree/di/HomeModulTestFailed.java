package ch.abertschi.adfree.di;

import android.content.Context;
import ch.abertschi.adfree.presenter.HomePresenter;
import ch.abertschi.adfree.view.home.HomeView;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class HomeModulTestFailed {
   @Test
   public void test_provideSettingsPresenter_1_4549() {
      HomePresenter var1 = ((HomeModul)JMockK.spyk(new HomeModul((Context)JMockK.mockk(Context.class, true), (HomeView)JMockK.mockk(HomeView.class, true)))).provideSettingsPresenter();
   }
}
