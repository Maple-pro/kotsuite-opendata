package com.ulicae.cinelog.android.v2.fragments.tag;

import android.view.View;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class EditTagFragmentTestFailed {
   @Test
   public void test_onFabClick_1_6223() {
      ((EditTagFragment)JMockK.spyk(new EditTagFragment())).onFabClick();
   }

   @Test
   public void test_onFilmsCheckedChanged_boolean_1_6195() {
      ((EditTagFragment)JMockK.spyk(new EditTagFragment())).onFilmsCheckedChanged(false);
   }

   @Test
   public void test_onSeriesCheckedChanged_boolean_1_6203() {
      ((EditTagFragment)JMockK.spyk(new EditTagFragment())).onSeriesCheckedChanged(false);
   }

   @Test
   public void test_onTagColorUpdate_View_1_6211() {
      ((EditTagFragment)JMockK.spyk(new EditTagFragment())).onTagColorUpdate((View)JMockK.mockk(View.class, true));
   }
}
