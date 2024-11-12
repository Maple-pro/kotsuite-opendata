package ch.abertschi.adfree.plugin.interdimcable;

import android.content.Context;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class InterdimCableViewTestFailed {
   @Test
   public void test_showAudioError_1_2901() {
      ((InterdimCableView)JMockK.spyk(new InterdimCableView((Context)JMockK.mockk(Context.class, true)))).showAudioError();
   }

   @Test
   public void test_showDownloadingTrack_1_2889() {
      ((InterdimCableView)JMockK.spyk(new InterdimCableView((Context)JMockK.mockk(Context.class, true)))).showDownloadingTrack();
   }

   @Test
   public void test_showInternetError_1_2877() {
      ((InterdimCableView)JMockK.spyk(new InterdimCableView((Context)JMockK.mockk(Context.class, true)))).showInternetError();
   }

   @Test
   public void test_showNoChannelsError_1_2913() {
      ((InterdimCableView)JMockK.spyk(new InterdimCableView((Context)JMockK.mockk(Context.class, true)))).showNoChannelsError();
   }
}
