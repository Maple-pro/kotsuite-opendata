package ch.abertschi.adfree.di;

import android.content.Context;
import ch.abertschi.adfree.presenter.AboutPresenter;
import ch.abertschi.adfree.view.about.AboutView;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class AboutModulTestFailed {
   @Test
   public void test_provideAboutPresenter_1_3921() {
      AboutPresenter var1 = ((AboutModul)JMockK.spyk(new AboutModul((Context)JMockK.mockk(Context.class, true), (AboutView)JMockK.mockk(AboutView.class, true)))).provideAboutPresenter();
   }
}
