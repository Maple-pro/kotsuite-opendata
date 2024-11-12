package com.vrem.wifianalyzer.navigation.items;

import com.vrem.wifianalyzer.export.Export;
import io.github.maples.jmockk.JMockK;
import org.junit.Assert;
import org.junit.Test;

public class ExportItemTestSuccess {
   @Test
   public void test_getRegistered_1_5052() {
      Object var1 = ((ExportItem)JMockK.spyk(new ExportItem((Export)JMockK.mockk(Export.class, true)))).getRegistered();
      Assert.assertEquals(new Integer(0), var1);
   }

   @Test
   public void test_getVisibility_1_5064() {
      Object var1 = ((ExportItem)JMockK.spyk(new ExportItem((Export)JMockK.mockk(Export.class, true)))).getVisibility();
      Assert.assertEquals(new Integer(8), var1);
   }
}
