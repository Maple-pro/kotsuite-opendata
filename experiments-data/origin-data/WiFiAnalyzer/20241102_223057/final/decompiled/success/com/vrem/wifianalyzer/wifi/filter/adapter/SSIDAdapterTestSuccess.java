package com.vrem.wifianalyzer.wifi.filter.adapter;

import com.vrem.wifianalyzer.settings.Settings;
import io.github.maples.jmockk.JMockK;
import java.util.Set;
import org.junit.Assert;
import org.junit.Test;

public class SSIDAdapterTestSuccess {
   @Test
   public void test_getSelections_1_2672() {
      Set var1 = ((SSIDAdapter)JMockK.spyk(new SSIDAdapter((Set)JMockK.mockk(Set.class, true)))).getSelections();
   }

   @Test
   public void test_isActive_1_2700() {
      Object var1 = ((SSIDAdapter)JMockK.spyk(new SSIDAdapter((Set)JMockK.mockk(Set.class, true)))).isActive();
      Assert.assertEquals(new Integer(1), var1);
   }

   @Test
   public void test_reset_1_2712() {
      ((SSIDAdapter)JMockK.spyk(new SSIDAdapter((Set)JMockK.mockk(Set.class, true)))).reset();
   }

   @Test
   public void test_save_Settings_1_2724() {
      ((SSIDAdapter)JMockK.spyk(new SSIDAdapter((Set)JMockK.mockk(Set.class, true)))).save((Settings)JMockK.mockk(Settings.class, true));
   }

   @Test
   public void test_setSelections_Set_1_2684() {
      ((SSIDAdapter)JMockK.spyk(new SSIDAdapter((Set)JMockK.mockk(Set.class, true)))).setSelections((Set)JMockK.mockk(Set.class, true));
   }
}
