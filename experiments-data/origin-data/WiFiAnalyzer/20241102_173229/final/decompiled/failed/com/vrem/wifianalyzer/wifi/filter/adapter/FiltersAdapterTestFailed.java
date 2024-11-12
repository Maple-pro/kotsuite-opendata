package com.vrem.wifianalyzer.wifi.filter.adapter;

import com.vrem.wifianalyzer.settings.Settings;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class FiltersAdapterTestFailed {
   @Test
   public void test_reset_1_1745() {
      ((FiltersAdapter)JMockK.spyk(new FiltersAdapter((Settings)JMockK.mockk(Settings.class, true)))).reset();
   }

   @Test
   public void test_save_1_1757() {
      ((FiltersAdapter)JMockK.spyk(new FiltersAdapter((Settings)JMockK.mockk(Settings.class, true)))).save();
   }
}
