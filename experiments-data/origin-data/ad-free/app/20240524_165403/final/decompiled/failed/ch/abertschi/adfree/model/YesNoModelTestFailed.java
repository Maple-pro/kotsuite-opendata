package ch.abertschi.adfree.model;

import android.content.Context;
import io.github.maples.jmockk.JMockK;
import java.util.List;
import org.junit.Test;

public class YesNoModelTestFailed {
   @Test
   public void test_getLoggerTag_1_1181() {
      String var1 = ((YesNoModel)JMockK.spyk(new YesNoModel((Context)JMockK.mockk(Context.class, true)))).getLoggerTag();
   }

   @Test
   public void test_loadJSONFromAsset_String_1_1169() {
      List var1 = ((YesNoModel)JMockK.spyk(new YesNoModel((Context)JMockK.mockk(Context.class, true)))).loadJSONFromAsset("kVpsmkl65jGCYV3HAgdb29r-7ys-DLiiVMczg+k6ZQ3Tf8pZB2ii4");
   }
}
