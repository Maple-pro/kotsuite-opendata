package com.vrem.wifianalyzer.wifi.filter.adapter;

import com.vrem.wifianalyzer.settings.Settings;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class FiltersAdapterTestSuccess {
   @Test
   public void test_reload_1_1733() {
      ((FiltersAdapter)JMockK.spyk(new FiltersAdapter((Settings)JMockK.mockk(Settings.class, true)))).reload();
   }

   @Test
   public void test_securityAdapter_1_1805() {
      SecurityAdapter var1 = ((FiltersAdapter)JMockK.spyk(new FiltersAdapter((Settings)JMockK.mockk(Settings.class, true)))).securityAdapter();
   }

   @Test
   public void test_ssidAdapter_1_1769() {
      SSIDAdapter var1 = ((FiltersAdapter)JMockK.spyk(new FiltersAdapter((Settings)JMockK.mockk(Settings.class, true)))).ssidAdapter();
   }

   @Test
   public void test_strengthAdapter_1_1793() {
      StrengthAdapter var1 = ((FiltersAdapter)JMockK.spyk(new FiltersAdapter((Settings)JMockK.mockk(Settings.class, true)))).strengthAdapter();
   }

   @Test
   public void test_wiFiBandAdapter_1_1781() {
      WiFiBandAdapter var1 = ((FiltersAdapter)JMockK.spyk(new FiltersAdapter((Settings)JMockK.mockk(Settings.class, true)))).wiFiBandAdapter();
   }
}
