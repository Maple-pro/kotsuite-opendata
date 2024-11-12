package ch.abertschi.adfree.view.mod;

import ch.abertschi.adfree.detector.AdDetectable;
import io.github.maples.jmockk.JMockK;
import java.util.List;
import org.junit.Test;

public class ActiveDetectorPresenterTestFailed {
   @Test
   public void test_getDetectors_String_1_4461() {
      List var1 = ((ActiveDetectorPresenter)JMockK.spyk(new ActiveDetectorPresenter((ActiveDetectorActivity)JMockK.mockk(ActiveDetectorActivity.class, true)))).getDetectors("2e5zo8mS0LjgYqTBK09TGyp07tSfNjBBVVlnhVwSR+r7k0ibB");
   }

   @Test
   public void test_getLoggerTag_1_4521() {
      String var1 = ((ActiveDetectorPresenter)JMockK.spyk(new ActiveDetectorPresenter((ActiveDetectorActivity)JMockK.mockk(ActiveDetectorActivity.class, true)))).getLoggerTag();
   }

   @Test
   public void test_isEnabled_AdDetectable_1_4473() {
      boolean var1 = ((ActiveDetectorPresenter)JMockK.spyk(new ActiveDetectorPresenter((ActiveDetectorActivity)JMockK.mockk(ActiveDetectorActivity.class, true)))).isEnabled((AdDetectable)JMockK.mockk(AdDetectable.class, true));
   }

   @Test
   public void test_onDetectorToggled_boolean_AdDetectable_1_4489() {
      ((ActiveDetectorPresenter)JMockK.spyk(new ActiveDetectorPresenter((ActiveDetectorActivity)JMockK.mockk(ActiveDetectorActivity.class, true)))).onDetectorToggled(true, (AdDetectable)JMockK.mockk(AdDetectable.class, true));
   }

   @Test
   public void test_showAdditionalInfoFor_AdDetectable_boolean_1_4505() {
      ((ActiveDetectorPresenter)JMockK.spyk(new ActiveDetectorPresenter((ActiveDetectorActivity)JMockK.mockk(ActiveDetectorActivity.class, true)))).showAdditionalInfoFor((AdDetectable)JMockK.mockk(AdDetectable.class, true), false);
   }
}
