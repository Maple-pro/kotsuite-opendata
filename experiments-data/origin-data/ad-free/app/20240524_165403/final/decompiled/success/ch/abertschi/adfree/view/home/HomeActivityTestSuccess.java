package ch.abertschi.adfree.view.home;

import io.github.maples.jmockk.JMockK;
import org.junit.Assert;
import org.junit.Test;

public class HomeActivityTestSuccess {
   @Test
   public void test_getLoggerTag_1_3985() {
      Assert.assertEquals("HomeActivity", ((HomeActivity)JMockK.spyk(new HomeActivity())).getLoggerTag());
   }
}
