package ch.abertschi.adfree.crashhandler;

import android.content.Intent;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class SendCrashReportActivityTestFailed {
   @Test
   public void test_getLoggerTag_1_4585() {
      String var1 = ((SendCrashReportActivity)JMockK.spyk(new SendCrashReportActivity())).getLoggerTag();
   }

   @Test
   public void test_parseIntent_Intent_1_4565() {
      ((SendCrashReportActivity)JMockK.spyk(new SendCrashReportActivity())).parseIntent((Intent)JMockK.mockk(Intent.class, true));
   }

   @Test
   public void test_sendReport_1_4577() {
      ((SendCrashReportActivity)JMockK.spyk(new SendCrashReportActivity())).sendReport();
   }
}
