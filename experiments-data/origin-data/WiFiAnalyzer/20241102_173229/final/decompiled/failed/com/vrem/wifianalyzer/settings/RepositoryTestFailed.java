package com.vrem.wifianalyzer.settings;

import android.content.Context;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class RepositoryTestFailed {
   @Test
   public void test_defaultValues_Context_int_boolean_1_1961() {
      ((Repository)JMockK.spyk(new Repository((Context)JMockK.mockk(Context.class, true)))).defaultValues((Context)JMockK.mockk(Context.class, true), -47, true);
   }

   @Test
   public void test_initializeDefaultValues_1_1817() {
      ((Repository)JMockK.spyk(new Repository((Context)JMockK.mockk(Context.class, true)))).initializeDefaultValues();
   }

   @Test
   public void test_stringAsInteger_int_int_1_1869() {
      int var1 = ((Repository)JMockK.spyk(new Repository((Context)JMockK.mockk(Context.class, true)))).stringAsInteger(-55, 76);
   }
}
