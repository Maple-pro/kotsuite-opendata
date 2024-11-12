package ch.abertschi.adfree;

import android.content.Context;
import ch.abertschi.adfree.model.PreferencesFactory;
import io.github.maples.jmockk.JMockK;
import org.junit.Assert;
import org.junit.Test;

public class AudioControllerTestSuccess {
   @Test
   public void test_getLoggerTag_1_837() {
      Assert.assertEquals("AudioController", ((AudioController)JMockK.spyk(new AudioController((Context)JMockK.mockk(Context.class, true), (PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true)))).getLoggerTag());
   }

   @Test
   public void test_isMusicStreamMuted_1_773() {
      Object var1 = ((AudioController)JMockK.spyk(new AudioController((Context)JMockK.mockk(Context.class, true), (PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true)))).isMusicStreamMuted();
      Assert.assertEquals(new Integer(0), var1);
   }
}
