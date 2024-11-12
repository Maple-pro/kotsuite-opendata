package com.vrem.wifianalyzer;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class MainContextTestFailed {
   @Test
   public void test_getContext_1_1005() {
      Context var1 = MainContext.INSTANCE.getContext();
   }

   @Test
   public void test_getLayoutInflater_1_1013() {
      LayoutInflater var1 = MainContext.INSTANCE.getLayoutInflater();
   }

   @Test
   public void test_getResources_1_1009() {
      Resources var1 = MainContext.INSTANCE.getResources();
   }

   @Test
   public void test_initialize_MainActivity_boolean_1_1017() {
      MainContext.INSTANCE.initialize((MainActivity)JMockK.mockk(MainActivity.class, true), true);
   }

   @Test
   public void test_valueOf_String_1_1029() {
      MainContext var1 = MainContext.valueOf("UFHgpTtsyDfHlAFWlrXZdnu4Lav07d");
   }
}
