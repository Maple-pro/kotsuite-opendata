package ch.abertschi.adfree;

import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class NotificationsListenersTestFailed {
   @Test
   public void test_getLoggerTag_1_4613() {
      String var1 = ((NotificationsListeners)JMockK.spyk(new NotificationsListeners())).getLoggerTag();
   }
}
