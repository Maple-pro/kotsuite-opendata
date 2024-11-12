package ch.abertschi.adfree.view.mod;

import android.content.Context;
import ch.abertschi.adfree.model.TextRepositoryData;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class GenericTextDetectorPresenterTestFailed {
   @Test
   public void test_addNewEntry_1_4021() {
      TextRepositoryData var1 = ((GenericTextDetectorPresenter)JMockK.spyk(new GenericTextDetectorPresenter((Context)JMockK.mockk(Context.class, true), (GenericTextDetectorActivity)JMockK.mockk(GenericTextDetectorActivity.class, true)))).addNewEntry();
   }

   @Test
   public void test_browseHelp_1_4077() {
      ((GenericTextDetectorPresenter)JMockK.spyk(new GenericTextDetectorPresenter((Context)JMockK.mockk(Context.class, true), (GenericTextDetectorActivity)JMockK.mockk(GenericTextDetectorActivity.class, true)))).browseHelp();
   }

   @Test
   public void test_deleteEntry_TextRepositoryData_1_4057() {
      ((GenericTextDetectorPresenter)JMockK.spyk(new GenericTextDetectorPresenter((Context)JMockK.mockk(Context.class, true), (GenericTextDetectorActivity)JMockK.mockk(GenericTextDetectorActivity.class, true)))).deleteEntry((TextRepositoryData)JMockK.mockk(TextRepositoryData.class, true));
   }

   @Test
   public void test_onMoreClicked_TextRepositoryData_1_4093() {
      ((GenericTextDetectorPresenter)JMockK.spyk(new GenericTextDetectorPresenter((Context)JMockK.mockk(Context.class, true), (GenericTextDetectorActivity)JMockK.mockk(GenericTextDetectorActivity.class, true)))).onMoreClicked((TextRepositoryData)JMockK.mockk(TextRepositoryData.class, true));
   }

   @Test
   public void test_updateEntry_TextRepositoryData_1_4037() {
      ((GenericTextDetectorPresenter)JMockK.spyk(new GenericTextDetectorPresenter((Context)JMockK.mockk(Context.class, true), (GenericTextDetectorActivity)JMockK.mockk(GenericTextDetectorActivity.class, true)))).updateEntry((TextRepositoryData)JMockK.mockk(TextRepositoryData.class, true));
   }
}
