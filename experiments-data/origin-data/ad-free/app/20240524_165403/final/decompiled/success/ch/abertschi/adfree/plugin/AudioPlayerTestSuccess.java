package ch.abertschi.adfree.plugin;

import android.content.Context;
import ch.abertschi.adfree.AudioController;
import ch.abertschi.adfree.model.PreferencesFactory;
import io.github.maples.jmockk.JMockK;
import org.junit.Assert;
import org.junit.Test;

public class AudioPlayerTestSuccess {
   @Test
   public void test_getLoggerTag_1_2857() {
      Assert.assertEquals("AudioPlayer", ((AudioPlayer)JMockK.spyk(new AudioPlayer((Context)JMockK.mockk(Context.class, true), (PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true), (AudioController)JMockK.mockk(AudioController.class, true)))).getLoggerTag());
   }

   @Test
   public void test_playWithCachingProxy_String_1_2837() {
      ((AudioPlayer)JMockK.spyk(new AudioPlayer((Context)JMockK.mockk(Context.class, true), (PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true), (AudioController)JMockK.mockk(AudioController.class, true)))).playWithCachingProxy("XUOW8ADVzhqJced6Z6rj46pGcVORAOwRra1srFUWGCXrFnvGtejdw0T2KJyFHnFcv5sL-MF1HY09eYEHk4oR4pRymY8AX0Yzt");
   }

   @Test
   public void test_play_String_boolean_1_2817() {
      ((AudioPlayer)JMockK.spyk(new AudioPlayer((Context)JMockK.mockk(Context.class, true), (PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true), (AudioController)JMockK.mockk(AudioController.class, true)))).play("-O9jUyJU0NQYOzoXIJp5ThY1+EgH2jl+7x83p+clT44EkOpN4paylB3lCIC4MH3XBLWEOPFs+pIqgsgsyvY8e-goOBUxnV", false);
   }
}
