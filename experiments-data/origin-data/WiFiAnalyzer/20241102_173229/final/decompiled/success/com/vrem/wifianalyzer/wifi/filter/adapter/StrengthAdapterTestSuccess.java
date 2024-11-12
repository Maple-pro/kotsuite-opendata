package com.vrem.wifianalyzer.wifi.filter.adapter;

import com.vrem.wifianalyzer.settings.Settings;
import com.vrem.wifianalyzer.wifi.model.Strength;
import io.github.maples.jmockk.JMockK;
import java.util.Set;
import org.junit.Assert;
import org.junit.Test;

public class StrengthAdapterTestSuccess {
   @Test
   public void test_color_Strength_1_2756() {
      Object var1 = ((StrengthAdapter)JMockK.spyk(new StrengthAdapter((Set)JMockK.mockk(Set.class, true)))).color((Strength)JMockK.mockk(Strength.class, true));
      Assert.assertEquals(new Integer(2131100415), var1);
   }

   @Test
   public void test_save_Settings_1_2772() {
      ((StrengthAdapter)JMockK.spyk(new StrengthAdapter((Set)JMockK.mockk(Set.class, true)))).save((Settings)JMockK.mockk(Settings.class, true));
   }
}
