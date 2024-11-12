package ch.abertschi.adfree;

import android.content.Context;
import io.github.maples.jmockk.JMockK;
import org.junit.Assert;
import org.junit.Test;

public class NotificationStatusManagerTestSuccess {
   @Test
   public void test_addObserver_NotificationStatusObserver_1_1205() {
      ((NotificationStatusManager)JMockK.spyk(new NotificationStatusManager((Context)JMockK.mockk(Context.class, true)))).addObserver((NotificationStatusObserver)JMockK.mockk(NotificationStatusObserver.class, true));
   }

   @Test
   public void test_getLoggerTag_1_1273() {
      Assert.assertEquals("NotificationStatusManag", ((NotificationStatusManager)JMockK.spyk(new NotificationStatusManager((Context)JMockK.mockk(Context.class, true)))).getLoggerTag());
   }
}
