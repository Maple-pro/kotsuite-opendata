package ch.abertschi.adfree.plugin;

import android.content.Context;
import ch.abertschi.adfree.AudioController;
import ch.abertschi.adfree.model.PreferencesFactory;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class AudioPlayerTestFailed {
   @Test
   public void test_getLoggerTag_1_2857() {
      String var1 = ((AudioPlayer)JMockK.spyk(new AudioPlayer((Context)JMockK.mockk(Context.class, true), (PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true), (AudioController)JMockK.mockk(AudioController.class, true)))).getLoggerTag();
   }

   @Test
   public void test_playWithCachingProxy_String_1_2837() {
      ((AudioPlayer)JMockK.spyk(new AudioPlayer((Context)JMockK.mockk(Context.class, true), (PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true), (AudioController)JMockK.mockk(AudioController.class, true)))).playWithCachingProxy("rp9CVIdEhoSsFnWUXL+VaIJG9Ir7ILwvLD+DYxf4JkoPb+oSZ9ndCY3PhbjZfTY+");
   }

   @Test
   public void test_play_String_boolean_1_2817() {
      ((AudioPlayer)JMockK.spyk(new AudioPlayer((Context)JMockK.mockk(Context.class, true), (PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true), (AudioController)JMockK.mockk(AudioController.class, true)))).play("-FvXhWkv89EJ78unZsho8hfcTwcLXPJdr5l6SDAgisP8WY9BerZcR4Fa4J6tosILFe9PxANGBJ-JkfIDZAya6k52HNITuRtK+M", false);
   }
}
