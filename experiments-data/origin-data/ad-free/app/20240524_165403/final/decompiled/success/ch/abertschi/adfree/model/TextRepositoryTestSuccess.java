package ch.abertschi.adfree.model;

import android.content.Context;
import io.github.maples.jmockk.JMockK;
import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;

public class TextRepositoryTestSuccess {
   @Test
   public void test_getAllEntries_1_1381() {
      ArrayList var1 = ((TextRepository)JMockK.spyk(new TextRepository((Context)JMockK.mockk(Context.class, true), (PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true)))).getAllEntries();
   }

   @Test
   public void test_getLoggerTag_1_1453() {
      Assert.assertEquals("TextRepository", ((TextRepository)JMockK.spyk(new TextRepository((Context)JMockK.mockk(Context.class, true), (PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true)))).getLoggerTag());
   }

   @Test
   public void test_setReflectionForMatch_boolean_1_1365() {
      ((TextRepository)JMockK.spyk(new TextRepository((Context)JMockK.mockk(Context.class, true), (PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true)))).setReflectionForMatch(false);
   }

   @Test
   public void test_useReflectionForMatch_1_1349() {
      Object var1 = ((TextRepository)JMockK.spyk(new TextRepository((Context)JMockK.mockk(Context.class, true), (PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true)))).useReflectionForMatch();
      Assert.assertEquals(new Integer(0), var1);
   }
}
