package com.vrem.wifianalyzer;

import com.vrem.wifianalyzer.settings.Settings;
import io.github.maples.jmockk.JMockK;
import org.junit.Assert;
import org.junit.Test;

public class MainReloadTestSuccess {
   @Test
   public void test_shouldReload_Settings_1_2176() {
      Object var1 = ((MainReload)JMockK.spyk(new MainReload((Settings)JMockK.mockk(Settings.class, true)))).shouldReload((Settings)JMockK.mockk(Settings.class, true));
      Assert.assertEquals(new Integer(1), var1);
   }
}
