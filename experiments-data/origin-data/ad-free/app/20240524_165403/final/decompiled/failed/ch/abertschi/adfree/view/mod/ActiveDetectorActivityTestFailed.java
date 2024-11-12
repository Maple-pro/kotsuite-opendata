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
      ((ActiveDetectorActivity)JMockK.spyk(new ActiveDetectorActivity())).showInfo("hYleF8EfL13b-veZLGI63KJSHXuMWVy7ty1L601B87qxZkr7nDsb");
   }
}
