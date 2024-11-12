package ch.abertschi.adfree.model;

import android.content.Context;
import io.github.maples.jmockk.JMockK;
import org.junit.Assert;
import org.junit.Test;

public class TrackRepositoryTestSuccess {
   @Test
   public void test_getLoggerTag_1_2377() {
      Assert.assertEquals("TrackRepository", ((TrackRepository)JMockK.spyk(new TrackRepository((Context)JMockK.mockk(Context.class, true), (PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true)))).getLoggerTag());
   }

   @Test
   public void test_removeTrack_String_1_2361() {
      ((TrackRepository)JMockK.spyk(new TrackRepository((Context)JMockK.mockk(Context.class, true), (PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true)))).removeTrack("fP606UJYI5LLrpTcrV-S9UCNcNZyUGNRZw4hUGjuBg7tPgT6VCwLzGsTRUSOV+");
   }
}
