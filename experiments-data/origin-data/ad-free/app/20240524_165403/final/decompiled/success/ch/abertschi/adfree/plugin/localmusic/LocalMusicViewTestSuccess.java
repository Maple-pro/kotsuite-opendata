package ch.abertschi.adfree.plugin.localmusic;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import ch.abertschi.adfree.plugin.PluginActivityAction;
import io.github.maples.jmockk.JMockK;
import org.junit.Assert;
import org.junit.Test;

public class LocalMusicViewTestSuccess {
   @Test
   public void test_getLoggerTag_1_3657() {
      Assert.assertEquals("LocalMusicView", ((LocalMusicView)JMockK.spyk(new LocalMusicView((Context)JMockK.mockk(Context.class, true), (PluginActivityAction)JMockK.mockk(PluginActivityAction.class, true)))).getLoggerTag());
   }

   @Test
   public void test_startActivityForResult_Intent_int_Bundle_1_3537() {
      ((LocalMusicView)JMockK.spyk(new LocalMusicView((Context)JMockK.mockk(Context.class, true), (PluginActivityAction)JMockK.mockk(PluginActivityAction.class, true)))).startActivityForResult((Intent)JMockK.mockk(Intent.class, true), 86, (Bundle)JMockK.mockk(Bundle.class, true));
   }
}
