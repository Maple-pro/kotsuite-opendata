package com.android.gpstest.lang;

import android.content.Context;
import android.content.res.Resources;
import io.github.maples.jmockk.JMockK;
import java.util.Locale;
import org.junit.Test;

public class LocaleManagerTestFailed {
   @Test
   public void test_getLocale_Resources_1_265() {
      Locale var1 = LocaleManager.getLocale((Resources)JMockK.mockk(Resources.class, true));
   }

   @Test
   public void test_setLocale_Context_1_233() {
      Context var1 = ((LocaleManager)JMockK.spyk(new LocaleManager((Context)JMockK.mockk(Context.class, true)))).setLocale((Context)JMockK.mockk(Context.class, true));
   }

   @Test
   public void test_setNewLocale_Context_String_1_249() {
      Context var1 = ((LocaleManager)JMockK.spyk(new LocaleManager((Context)JMockK.mockk(Context.class, true)))).setNewLocale((Context)JMockK.mockk(Context.class, true), "7igXH1GQv3Vh-nKepJPuEhtYH9y8fpQmcyVd");
   }
}
