package ch.abertschi.adfree.model;

import io.github.maples.jmockk.JMockK;
import org.junit.Assert;
import org.junit.Test;

public class RemoteManagerTestSuccess {
   @Test
   public void test_getLoggerTag_1_1193() {
      Assert.assertEquals("RemoteManager", ((RemoteManager)JMockK.spyk(new RemoteManager((PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true)))).getLoggerTag());
   }
}
