package com.ulicae.cinelog.utils;

import android.content.Context;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class PreferencesWrapperTestFailed {
   @Test
   public void test_getBooleanPreference_Context_String_boolean_1_4457() {
      boolean var1 = ((PreferencesWrapper)JMockK.spyk(new PreferencesWrapper())).getBooleanPreference((Context)JMockK.mockk(Context.class, true), "DMIHc0+ipMa4pUbfhIZN5tM95dG-rUy8ZYgdpIyWfY", false);
   }

   @Test
   public void test_getIntegerPreference_Context_String_int_1_4469() {
      int var1 = ((PreferencesWrapper)JMockK.spyk(new PreferencesWrapper())).getIntegerPreference((Context)JMockK.mockk(Context.class, true), "KErADRmXicBqdm8sDoIJX3owcfHOVwwm8+0qlSf9N3QL2zS1kCvRvc7PBSXPx+hR10KRx+b-FoyU2qp1QTrdRsIIRBIYKkN2Zn", -66);
   }

   @Test
   public void test_getStringPreference_Context_String_String_1_4445() {
      String var1 = ((PreferencesWrapper)JMockK.spyk(new PreferencesWrapper())).getStringPreference((Context)JMockK.mockk(Context.class, true), "wf3t6ThGnfOHMGm6ll7ajBRxyXiTdlkeDIyDq7kTnACvJ4iixXe", "OVU8PVqqcmn98aW-9T0LpE36gQ5XAPLRC");
   }

   @Test
   public void test_setIntegerPreference_Context_String_int_1_4493() {
      ((PreferencesWrapper)JMockK.spyk(new PreferencesWrapper())).setIntegerPreference((Context)JMockK.mockk(Context.class, true), "3m+8a+6bV+Xu5SkYmQfLpf84bHA5DRTf", -28);
   }

   @Test
   public void test_setStringPreference_Context_String_String_1_4481() {
      ((PreferencesWrapper)JMockK.spyk(new PreferencesWrapper())).setStringPreference((Context)JMockK.mockk(Context.class, true), "JiPYbQ", "o");
   }
}
