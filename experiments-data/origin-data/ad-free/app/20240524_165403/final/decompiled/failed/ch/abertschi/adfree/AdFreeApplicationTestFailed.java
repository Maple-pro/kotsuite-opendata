package ch.abertschi.adfree;

import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class AdFreeApplicationTestFailed {
   @Test
   public void test_getLoggerTag_1_65() {
      String var1 = ((AdFreeApplication)JMockK.spyk(new AdFreeApplication())).getLoggerTag();
   }
}
