package ch.abertschi.adfree.view.mod;

import io.github.maples.jmockk.JMockK;
import java.util.List;
import org.junit.Test;

public class CategoriesPresenterTestFailed {
   @Test
   public void test_getCategories_1_4381() {
      List var1 = ((CategoriesPresenter)JMockK.spyk(new CategoriesPresenter((CategoriesActivity)JMockK.mockk(CategoriesActivity.class, true)))).getCategories();
   }

   @Test
   public void test_getLoggerTag_1_4417() {
      String var1 = ((CategoriesPresenter)JMockK.spyk(new CategoriesPresenter((CategoriesActivity)JMockK.mockk(CategoriesActivity.class, true)))).getLoggerTag();
   }

   @Test
   public void test_onCategorySelected_String_1_4405() {
      ((CategoriesPresenter)JMockK.spyk(new CategoriesPresenter((CategoriesActivity)JMockK.mockk(CategoriesActivity.class, true)))).onCategorySelected("q8qYyBZ8lmev0wrbM8GM07odoHOw");
   }

   @Test
   public void test_onTabTitle_1_4393() {
      ((CategoriesPresenter)JMockK.spyk(new CategoriesPresenter((CategoriesActivity)JMockK.mockk(CategoriesActivity.class, true)))).onTabTitle();
   }
}
