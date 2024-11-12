package ch.abertschi.adfree.model;

import android.content.Context;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class TrackRepositoryTestFailed {
   @Test
   public void test_addTrack_String_1_2345() {
      ((TrackRepository)JMockK.spyk(new TrackRepository((Context)JMockK.mockk(Context.class, true), (PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true)))).addTrack("mpsOnExSsO+lI4J3cR7u2hSE");
   }
}
