package com.vrem.wifianalyzer.settings;

import android.content.Context;
import android.content.SharedPreferences;
import io.github.maples.jmockk.JMockK;
import java.util.Set;
import org.junit.Assert;
import org.junit.Test;

public class RepositoryTestSuccess {
   @Test
   public void test_boolean_int_boolean_1_1893() {
      Object var1 = ((Repository)JMockK.spyk(new Repository((Context)JMockK.mockk(Context.class, true)))).boolean(99, false);
      Assert.assertEquals(new Integer(0), var1);
   }

   @Test
   public void test_defaultSharedPreferences_Context_1_1977() {
      SharedPreferences var1 = ((Repository)JMockK.spyk(new Repository((Context)JMockK.mockk(Context.class, true)))).defaultSharedPreferences((Context)JMockK.mockk(Context.class, true));
   }

   @Test
   public void test_integer_int_int_1_1917() {
      Object var1 = ((Repository)JMockK.spyk(new Repository((Context)JMockK.mockk(Context.class, true)))).integer(8, -75);
      Assert.assertEquals(new Integer(0), var1);
   }

   @Test
   public void test_registerOnSharedPreferenceChangeListener_SharedPreferencesOnSharedPreferenceChangeListener_1_1829() {
      ((Repository)JMockK.spyk(new Repository((Context)JMockK.mockk(Context.class, true)))).registerOnSharedPreferenceChangeListener((SharedPreferences.OnSharedPreferenceChangeListener)JMockK.mockk(SharedPreferences.OnSharedPreferenceChangeListener.class, true));
   }

   @Test
   public void test_resourceBoolean_int_1_1905() {
      Object var1 = ((Repository)JMockK.spyk(new Repository((Context)JMockK.mockk(Context.class, true)))).resourceBoolean(97);
      Assert.assertEquals(new Integer(0), var1);
   }

   @Test
   public void test_saveStringSet_int_Set_1_1945() {
      ((Repository)JMockK.spyk(new Repository((Context)JMockK.mockk(Context.class, true)))).saveStringSet(27, (Set)JMockK.mockk(Set.class, true));
   }

   @Test
   public void test_save_int_String_1_1857() {
      ((Repository)JMockK.spyk(new Repository((Context)JMockK.mockk(Context.class, true)))).save(67, "aDdsCokam9msz-4vKc4rp2FTqtePdbw2CIJ6bou1ZVtkm2Ji4");
   }

   @Test
   public void test_save_int_int_1_1845() {
      ((Repository)JMockK.spyk(new Repository((Context)JMockK.mockk(Context.class, true)))).save(-23, 38);
   }

   @Test
   public void test_stringSet_int_Set_1_1929() {
      Set var1 = ((Repository)JMockK.spyk(new Repository((Context)JMockK.mockk(Context.class, true)))).stringSet(51, (Set)JMockK.mockk(Set.class, true));
   }

   @Test
   public void test_string_int_String_1_1881() {
      String var1 = ((Repository)JMockK.spyk(new Repository((Context)JMockK.mockk(Context.class, true)))).string(-13, "e4KFshwRib2N7YOp4KVnmd+g3VB");
   }
}
