package com.vrem.wifianalyzer.wifi.filter.adapter;

import io.github.maples.jmockk.JMockK;
import java.util.Set;
import org.junit.Test;

public class StrengthAdapterTestFailed {
   @Test
   public void test_color_Enum_1_2788() {
      int var1 = ((StrengthAdapter)JMockK.spyk(new StrengthAdapter((Set)JMockK.mockk(Set.class, true)))).color((Enum)JMockK.mockk(Enum.class, true));
   }
}
