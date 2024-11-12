package ch.abertschi.adfree;

import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class StartOnBootListenerTestFailed {
   @Test
   public void test_getLoggerTag_1_57() {
      String var1 = ((StartOnBootListener)JMockK.spyk(new StartOnBootListener())).getLoggerTag();
   }
}
