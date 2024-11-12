package ch.abertschi.adfree.model;

import android.content.Context;
import io.github.maples.jmockk.JMockK;
import java.util.ArrayList;
import org.junit.Test;

public class TextRepositoryTestFailed {
   @Test
   public void test_createNewEntry_1_1397() {
      TextRepositoryData var1 = ((TextRepository)JMockK.spyk(new TextRepository((Context)JMockK.mockk(Context.class, true), (PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true)))).createNewEntry();
   }

   @Test
   public void test_getAllEntries_1_1381() {
      ArrayList var1 = ((TextRepository)JMockK.spyk(new TextRepository((Context)JMockK.mockk(Context.class, true), (PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true)))).getAllEntries();
   }

   @Test
   public void test_getLoggerTag_1_1453() {
      String var1 = ((TextRepository)JMockK.spyk(new TextRepository((Context)JMockK.mockk(Context.class, true), (PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true)))).getLoggerTag();
   }

   @Test
   public void test_removeEntry_TextRepositoryData_1_1433() {
      ((TextRepository)JMockK.spyk(new TextRepository((Context)JMockK.mockk(Context.class, true), (PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true)))).removeEntry((TextRepositoryData)JMockK.mockk(TextRepositoryData.class, true));
   }

   @Test
   public void test_setReflectionForMatch_boolean_1_1365() {
      ((TextRepository)JMockK.spyk(new TextRepository((Context)JMockK.mockk(Context.class, true), (PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true)))).setReflectionForMatch(false);
   }

   @Test
   public void test_updateEntry_TextRepositoryData_1_1413() {
      ((TextRepository)JMockK.spyk(new TextRepository((Context)JMockK.mockk(Context.class, true), (PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true)))).updateEntry((TextRepositoryData)JMockK.mockk(TextRepositoryData.class, true));
   }

   @Test
   public void test_useReflectionForMatch_1_1349() {
      boolean var1 = ((TextRepository)JMockK.spyk(new TextRepository((Context)JMockK.mockk(Context.class, true), (PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true)))).useReflectionForMatch();
   }
}
