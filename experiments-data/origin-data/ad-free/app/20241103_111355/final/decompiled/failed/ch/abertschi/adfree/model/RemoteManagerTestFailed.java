package ch.abertschi.adfree.model;

import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class RemoteManagerTestFailed {
   @Test
   public void test_getLoggerTag_1_1193() {
      String var1 = ((RemoteManager)JMockK.spyk(new RemoteManager((PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true)))).getLoggerTag();
   }
}
