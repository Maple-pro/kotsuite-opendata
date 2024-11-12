package ch.abertschi.adfree.view.setting;

import android.content.Context;
import android.util.AttributeSet;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class CustomSpinnerTestFailed {
   @Test
   public void test_onDetechedFromWindow_1_3937() {
      ((CustomSpinner)JMockK.spyk(new CustomSpinner((Context)JMockK.mockk(Context.class, true), (AttributeSet)JMockK.mockk(AttributeSet.class, true), -7))).onDetechedFromWindow();
   }
}
