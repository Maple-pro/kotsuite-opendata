package com.ulicae.cinelog.utils;

import android.content.Context;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class BusinessPreferenceGetterTestFailed {
   @Test
   public void test_getAutomaticExport_1_4916() {
      boolean var1 = ((BusinessPreferenceGetter)JMockK.spyk(new BusinessPreferenceGetter((Context)JMockK.mockk(Context.class, true)))).getAutomaticExport();
   }
}
