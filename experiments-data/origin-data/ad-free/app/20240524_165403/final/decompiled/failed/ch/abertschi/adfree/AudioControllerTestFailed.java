package ch.abertschi.adfree;

import android.content.Context;
import ch.abertschi.adfree.model.PreferencesFactory;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class AudioControllerTestFailed {
   @Test
   public void test_muteMusicStream_1_789() {
      ((AudioController)JMockK.spyk(new AudioController((Context)JMockK.mockk(Context.class, true), (PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true)))).muteMusicStream();
   }

   @Test
   public void test_showVoiceCallVolume_1_821() {
      ((AudioController)JMockK.spyk(new AudioController((Context)JMockK.mockk(Context.class, true), (PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true)))).showVoiceCallVolume();
   }

   @Test
   public void test_unmuteMusicStream_1_805() {
      ((AudioController)JMockK.spyk(new AudioController((Context)JMockK.mockk(Context.class, true), (PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true)))).unmuteMusicStream();
   }
}
