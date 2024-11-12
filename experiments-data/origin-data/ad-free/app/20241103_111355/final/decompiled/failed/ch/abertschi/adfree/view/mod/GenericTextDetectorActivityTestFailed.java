package ch.abertschi.adfree.view.mod;

import ch.abertschi.adfree.model.TextRepositoryData;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class GenericTextDetectorActivityTestFailed {
   @Test
   public void test_getLoggerTag_1_4013() {
      String var1 = ((GenericTextDetectorActivity)JMockK.spyk(new GenericTextDetectorActivity())).getLoggerTag();
   }

   @Test
   public void test_insertData_1_4005() {
      ((GenericTextDetectorActivity)JMockK.spyk(new GenericTextDetectorActivity())).insertData();
   }

   @Test
   public void test_showOptionDialog_TextRepositoryData_1_3993() {
      ((GenericTextDetectorActivity)JMockK.spyk(new GenericTextDetectorActivity())).showOptionDialog((TextRepositoryData)JMockK.mockk(TextRepositoryData.class, true));
   }
}
