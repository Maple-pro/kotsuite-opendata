package ch.abertschi.adfree;

import ch.abertschi.adfree.model.PreferencesFactory;
import io.github.maples.jmockk.JMockK;
import org.junit.Assert;
import org.junit.Test;

public class GoogleCastManagerTestSuccess {
   @Test
   public void test_getLoggerTag_1_1337() {
      Assert.assertEquals("GoogleCastManager", ((GoogleCastManager)JMockK.spyk(new GoogleCastManager((PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true)))).getLoggerTag());
   }

   @Test
   public void test_isEnabled_1_1285() {
      Object var1 = ((GoogleCastManager)JMockK.spyk(new GoogleCastManager((PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true)))).isEnabled();
      Assert.assertEquals(new Integer(0), var1);
   }
}
