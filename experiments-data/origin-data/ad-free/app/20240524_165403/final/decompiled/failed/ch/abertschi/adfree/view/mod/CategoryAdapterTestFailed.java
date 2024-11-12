package ch.abertschi.adfree.view.mod;

import io.github.maples.jmockk.JMockK;
import java.util.List;
import org.junit.Test;

public class CategoryAdapterTestFailed {
   @Test
   public void test_getLoggerTag_1_4429() {
      String var1 = ((CategoryAdapter)JMockK.spyk(new CategoryAdapter((List)JMockK.mockk(List.class, true), (CategoriesPresenter)JMockK.mockk(CategoriesPresenter.class, true)))).getLoggerTag();
   }
}
