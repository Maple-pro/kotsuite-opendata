package com.ulicae.cinelog.utils;

import android.content.Context;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class ThemeWrapperTestFailed {
   @Test
   public void test_setThemeWithPreferences_Context_1_5070() {
      ((ThemeWrapper)JMockK.spyk(new ThemeWrapper())).setThemeWithPreferences((Context)JMockK.mockk(Context.class, true));
   }
}
