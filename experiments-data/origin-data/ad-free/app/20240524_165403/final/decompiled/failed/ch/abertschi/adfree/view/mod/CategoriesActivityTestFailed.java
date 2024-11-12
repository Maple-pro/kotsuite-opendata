package ch.abertschi.adfree.view.mod;

import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class CategoriesActivityTestFailed {
   @Test
   public void test_getLoggerTag_1_4373() {
      String var1 = ((CategoriesActivity)JMockK.spyk(new CategoriesActivity())).getLoggerTag();
   }

   @Test
   public void test_hideEnabledDebug_1_4357() {
      ((CategoriesActivity)JMockK.spyk(new CategoriesActivity())).hideEnabledDebug();
   }

   @Test
   public void test_showEnabledDebug_1_4365() {
      ((CategoriesActivity)JMockK.spyk(new CategoriesActivity())).showEnabledDebug();
   }
}
