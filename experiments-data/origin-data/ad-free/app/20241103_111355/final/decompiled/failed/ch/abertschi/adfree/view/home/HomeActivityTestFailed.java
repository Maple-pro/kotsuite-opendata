package ch.abertschi.adfree.view.home;

import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class HomeActivityTestFailed {
   @Test
   public void test_getLoggerTag_1_3985() {
      String var1 = ((HomeActivity)JMockK.spyk(new HomeActivity())).getLoggerTag();
   }

   @Test
   public void test_showEnjoyAdFree_1_3977() {
      ((HomeActivity)JMockK.spyk(new HomeActivity())).showEnjoyAdFree();
   }

   @Test
   public void test_showNotificationPermissionSettings_1_3969() {
      ((HomeActivity)JMockK.spyk(new HomeActivity())).showNotificationPermissionSettings();
   }

   @Test
   public void test_showPermissionRequired_1_3961() {
      ((HomeActivity)JMockK.spyk(new HomeActivity())).showPermissionRequired();
   }

   @Test
   public void test_showUpdateMessage_boolean_1_3953() {
      ((HomeActivity)JMockK.spyk(new HomeActivity())).showUpdateMessage(true);
   }
}
