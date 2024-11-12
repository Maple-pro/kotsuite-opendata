package ch.abertschi.adfree.util;

import android.content.Context;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class NotificationUtilsTestFailed {
   @Test
   public void test_hideNotification_int_1_21() {
      ((NotificationUtils)JMockK.spyk(new NotificationUtils((Context)JMockK.mockk(Context.class, true)))).hideNotification(-85);
   }
}
