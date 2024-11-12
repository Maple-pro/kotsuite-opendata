package ch.abertschi.adfree.presenter;

import android.content.Context;
import ch.abertschi.adfree.model.PreferencesFactory;
import ch.abertschi.adfree.view.about.AboutView;
import io.github.maples.jmockk.JMockK;
import org.junit.Assert;
import org.junit.Test;

public class AboutPresenterTestSuccess {
   @Test
   public void test_getLoggerTag_1_2713() {
      Assert.assertEquals("AboutPresenter", ((AboutPresenter)JMockK.spyk(new AboutPresenter((AboutView)JMockK.mockk(AboutView.class, true), (PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true), (Context)JMockK.mockk(Context.class, true)))).getLoggerTag());
   }
}
