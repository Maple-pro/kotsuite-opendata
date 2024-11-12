package ch.abertschi.adfree.util;

import android.content.Context;
import io.github.maples.jmockk.JMockK;
import org.junit.Assert;
import org.junit.Test;

public class NotificationUtilsTestSuccess {
   @Test
   public void test_getLoggerTag_1_33() {
      Assert.assertEquals("NotificationUtils", ((NotificationUtils)JMockK.spyk(new NotificationUtils((Context)JMockK.mockk(Context.class, true)))).getLoggerTag());
   }

   @Test
   public void test_updateTextNotificationIfAvailable_int_String_String_1_9() {
      ((NotificationUtils)JMockK.spyk(new NotificationUtils((Context)JMockK.mockk(Context.class, true)))).updateTextNotificationIfAvailable(76, "chqjCIx0sI3cm+scYYJaS1XSk1Dxt+0+j5PSN0CFDuxKu6AlXU9tx6yOo6fz", "rdDQzqYbGvuOAOuQ0AemAYR3UHqidEvVZXhcc-yzEIpjLKiCaIVD");
   }
}
