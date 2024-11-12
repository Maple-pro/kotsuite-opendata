package com.ulicae.cinelog.android.v2.fragments.review.edit;

import android.view.View;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class ReviewEditionFragmentTestFailed {
   @Test
   public void test_onFabClick_1_6325() {
      ((ReviewEditionFragment)JMockK.spyk(new ReviewEditionFragment())).onFabClick();
   }

   @Test
   public void test_showTimePickerDialog_View_1_6313() {
      ((ReviewEditionFragment)JMockK.spyk(new ReviewEditionFragment())).showTimePickerDialog((View)JMockK.mockk(View.class, true));
   }
}
