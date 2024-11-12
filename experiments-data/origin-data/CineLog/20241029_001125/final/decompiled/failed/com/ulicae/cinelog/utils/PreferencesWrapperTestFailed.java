package com.ulicae.cinelog.utils;

import android.content.Context;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class PreferencesWrapperTestFailed {
   @Test
   public void test_getBooleanPreference_Context_String_boolean_1_4457() {
      boolean var1 = ((PreferencesWrapper)JMockK.spyk(new PreferencesWrapper())).getBooleanPreference((Context)JMockK.mockk(Context.class, true), "2T6LpDHQaLi+BmoAXWtCb0gDapUJB9ue5vS4jvp2asFL4a5fqs0mgCAvVTW", true);
   }

   @Test
   public void test_getIntegerPreference_Context_String_int_1_4469() {
      int var1 = ((PreferencesWrapper)JMockK.spyk(new PreferencesWrapper())).getIntegerPreference((Context)JMockK.mockk(Context.class, true), "bTfek4-9Av4thRDk8EERCG4400eT38xyzRyL", 80);
   }

   @Test
   public void test_getStringPreference_Context_String_String_1_4445() {
      String var1 = ((PreferencesWrapper)JMockK.spyk(new PreferencesWrapper())).getStringPreference((Context)JMockK.mockk(Context.class, true), "9REJ3W53eG3uyzo", "UM4JvP4mJ1vvbqO+-XqgoUBj5FH8-Hh5h6BaQyZolvO7-fc2fL+Gxr4JID8l87eD63sB9FSLdmAlx84xmgV5lXA8Ev3ZEyIM");
   }

   @Test
   public void test_setIntegerPreference_Context_String_int_1_4493() {
      ((PreferencesWrapper)JMockK.spyk(new PreferencesWrapper())).setIntegerPreference((Context)JMockK.mockk(Context.class, true), "T9s0ha6sa4RC4f2WCdCOmtpBrBjGo", -12);
   }

   @Test
   public void test_setStringPreference_Context_String_String_1_4481() {
      ((PreferencesWrapper)JMockK.spyk(new PreferencesWrapper())).setStringPreference((Context)JMockK.mockk(Context.class, true), "eqPST0CrmG-dLDsT+8D3535K4tbJRXSXKBU35+B2QbGT4DQQOXiLk8aGCSlyaCBotxE8", "hsqXdjOK62UwRUJMk7LIX9CKRJowcxSPVbqG+zz2ld7b9");
   }
}
