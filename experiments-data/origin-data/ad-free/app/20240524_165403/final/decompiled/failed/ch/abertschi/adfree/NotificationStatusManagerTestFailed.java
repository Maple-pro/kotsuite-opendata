package ch.abertschi.adfree;

import android.content.Context;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class NotificationStatusManagerTestFailed {
   @Test
   public void test_forceTimedRestart_1_1249() {
      ((NotificationStatusManager)JMockK.spyk(new NotificationStatusManager((Context)JMockK.mockk(Context.class, true)))).forceTimedRestart();
   }

   @Test
   public void test_getStatus_1_1237() {
      ListenerStatus var1 = ((NotificationStatusManager)JMockK.spyk(new NotificationStatusManager((Context)JMockK.mockk(Context.class, true)))).getStatus();
   }

   @Test
   public void test_notifyStatusChanged_ListenerStatus_1_1221() {
      ((NotificationStatusManager)JMockK.spyk(new NotificationStatusManager((Context)JMockK.mockk(Context.class, true)))).notifyStatusChanged((ListenerStatus)JMockK.mockk(ListenerStatus.class, true));
   }

   @Test
   public void test_restartNotificationListener_1_1261() {
      ((NotificationStatusManager)JMockK.spyk(new NotificationStatusManager((Context)JMockK.mockk(Context.class, true)))).restartNotificationListener();
   }
}
