package ch.abertschi.adfree.model;

import android.content.Context;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class TextRepositoryTestFailed {
   @Test
   public void test_createNewEntry_1_1397() {
      TextRepositoryData var1 = ((TextRepository)JMockK.spyk(new TextRepository((Context)JMockK.mockk(Context.class, true), (PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true)))).createNewEntry();
   }

   @Test
   public void test_removeEntry_TextRepositoryData_1_1433() {
      ((TextRepository)JMockK.spyk(new TextRepository((Context)JMockK.mockk(Context.class, true), (PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true)))).removeEntry((TextRepositoryData)JMockK.mockk(TextRepositoryData.class, true));
   }

   @Test
   public void test_updateEntry_TextRepositoryData_1_1413() {
      ((TextRepository)JMockK.spyk(new TextRepository((Context)JMockK.mockk(Context.class, true), (PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true)))).updateEntry((TextRepositoryData)JMockK.mockk(TextRepositoryData.class, true));
   }
}
