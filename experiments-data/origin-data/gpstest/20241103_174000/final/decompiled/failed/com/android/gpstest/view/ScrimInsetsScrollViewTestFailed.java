package com.android.gpstest.view;

import android.content.Context;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class ScrimInsetsScrollViewTestFailed {
   @Test
   public void test_setOnInsetsCallback_ScrimInsetsScrollViewOnInsetsCallback_1_557() {
      ((ScrimInsetsScrollView)JMockK.spyk(new ScrimInsetsScrollView((Context)JMockK.mockk(Context.class, true)))).setOnInsetsCallback((ScrimInsetsScrollView.OnInsetsCallback)JMockK.mockk(ScrimInsetsScrollView.OnInsetsCallback.class, true));
   }
}
