package com.vrem.wifianalyzer.wifi.filter.adapter;

import com.vrem.wifianalyzer.settings.Settings;
import io.github.maples.jmockk.JMockK;
import java.util.Set;
import org.junit.Test;

public class SecurityAdapterTestSuccess {
   @Test
   public void test_save_Settings_1_2804() {
      ((SecurityAdapter)JMockK.spyk(new SecurityAdapter((Set)JMockK.mockk(Set.class, true)))).save((Settings)JMockK.mockk(Settings.class, true));
   }
}
