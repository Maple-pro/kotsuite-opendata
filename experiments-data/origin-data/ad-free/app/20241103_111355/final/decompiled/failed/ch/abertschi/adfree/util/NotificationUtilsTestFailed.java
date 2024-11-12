package ch.abertschi.adfree.util;

import android.content.Context;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class NotificationUtilsTestFailed {
   @Test
   public void test_getLoggerTag_1_33() {
      String var1 = ((NotificationUtils)JMockK.spyk(new NotificationUtils((Context)JMockK.mockk(Context.class, true)))).getLoggerTag();
   }

   @Test
   public void test_hideNotification_int_1_21() {
      ((NotificationUtils)JMockK.spyk(new NotificationUtils((Context)JMockK.mockk(Context.class, true)))).hideNotification(-71);
   }

   @Test
   public void test_updateTextNotificationIfAvailable_int_String_String_1_9() {
      ((NotificationUtils)JMockK.spyk(new NotificationUtils((Context)JMockK.mockk(Context.class, true)))).updateTextNotificationIfAvailable(25, "LoqAqPYShCAU3pZupZ1ES0I80bv1wgPn22Ep845H5tqo", "VsbmJYO1qhLgs3d-GOs7NrEyETLYHuby");
   }
}
