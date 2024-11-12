package ch.abertschi.adfree.plugin.localmusic;

import android.content.Context;
import ch.abertschi.adfree.AudioController;
import ch.abertschi.adfree.model.PreferencesFactory;
import ch.abertschi.adfree.model.YesNoModel;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class LocalMusicPluginTestFailed {
   @Test
   public void test_onChooseDirectory_1_3365() {
      ((LocalMusicPlugin)JMockK.spyk(new LocalMusicPlugin((Context)JMockK.mockk(Context.class, true), (PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true), (AudioController)JMockK.mockk(AudioController.class, true), (YesNoModel)JMockK.mockk(YesNoModel.class, true)))).onChooseDirectory();
   }

   @Test
   public void test_playTrial_1_3221() {
      ((LocalMusicPlugin)JMockK.spyk(new LocalMusicPlugin((Context)JMockK.mockk(Context.class, true), (PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true), (AudioController)JMockK.mockk(AudioController.class, true), (YesNoModel)JMockK.mockk(YesNoModel.class, true)))).playTrial();
   }

   @Test
   public void test_play_1_3197() {
      ((LocalMusicPlugin)JMockK.spyk(new LocalMusicPlugin((Context)JMockK.mockk(Context.class, true), (PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true), (AudioController)JMockK.mockk(AudioController.class, true), (YesNoModel)JMockK.mockk(YesNoModel.class, true)))).play();
   }
}
