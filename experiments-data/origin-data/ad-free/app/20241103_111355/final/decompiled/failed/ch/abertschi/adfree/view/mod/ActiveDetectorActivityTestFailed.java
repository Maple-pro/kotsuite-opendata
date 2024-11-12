package ch.abertschi.adfree.view.mod;

import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class ActiveDetectorActivityTestFailed {
   @Test
   public void test_getLoggerTag_1_4541() {
      String var1 = ((ActiveDetectorActivity)JMockK.spyk(new ActiveDetectorActivity())).getLoggerTag();
   }

   @Test
   public void test_showInfo_String_1_4533() {
      ((ActiveDetectorActivity)JMockK.spyk(new ActiveDetectorActivity())).showInfo("YizDV-uyOZNh1KGGeu5NXEv4Lr-YRIhwk3+5ocRalrMFBpLheyWUo7DAW");
   }
}
