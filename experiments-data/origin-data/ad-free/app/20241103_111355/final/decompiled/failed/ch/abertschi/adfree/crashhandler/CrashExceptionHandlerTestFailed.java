package ch.abertschi.adfree.crashhandler;

import android.content.Context;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class CrashExceptionHandlerTestFailed {
   @Test
   public void test_uncaughtException_Thread_Throwable_1_4593() {
      ((CrashExceptionHandler)JMockK.spyk(new CrashExceptionHandler((Context)JMockK.mockk(Context.class, true)))).uncaughtException((Thread)JMockK.mockk(Thread.class, true), (Throwable)JMockK.mockk(Throwable.class, true));
   }
}
