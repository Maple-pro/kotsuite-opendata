package ch.abertschi.adfree.model;

import android.content.Context;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class TrackRepositoryTestFailed {
   @Test
   public void test_addTrack_String_1_2345() {
      ((TrackRepository)JMockK.spyk(new TrackRepository((Context)JMockK.mockk(Context.class, true), (PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true)))).addTrack("5ZCE7mfZnHah+r+GrZPumG1+qt");
   }

   @Test
   public void test_getLoggerTag_1_2377() {
      String var1 = ((TrackRepository)JMockK.spyk(new TrackRepository((Context)JMockK.mockk(Context.class, true), (PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true)))).getLoggerTag();
   }

   @Test
   public void test_removeTrack_String_1_2361() {
      ((TrackRepository)JMockK.spyk(new TrackRepository((Context)JMockK.mockk(Context.class, true), (PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true)))).removeTrack("6+iio5n6iUNE8MIupmzWVs4gxsoEKsKUSWqv04KqU9xPH9LHGYQ4hxAS3VavdfKtH6Cd6N3gEfSZEPXfU8dkdCcJH-6hjZLxNuh");
   }
}
