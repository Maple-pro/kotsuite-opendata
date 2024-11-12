package ch.abertschi.adfree.view.mod;

import io.github.maples.jmockk.JMockK;
import java.util.List;
import org.junit.Test;

public class DetectorAdapterTestFailed {
   @Test
   public void test_getLoggerTag_1_4445() {
      String var1 = ((DetectorAdapter)JMockK.spyk(new DetectorAdapter((List)JMockK.mockk(List.class, true), (ActiveDetectorPresenter)JMockK.mockk(ActiveDetectorPresenter.class, true)))).getLoggerTag();
   }
}
