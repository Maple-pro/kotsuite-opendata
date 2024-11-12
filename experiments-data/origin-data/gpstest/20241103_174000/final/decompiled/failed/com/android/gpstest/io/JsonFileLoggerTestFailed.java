package com.android.gpstest.io;

import android.content.Context;
import io.github.maples.jmockk.JMockK;
import java.io.File;
import java.util.Date;
import org.junit.Test;

public class JsonFileLoggerTestFailed {
   @Test
   public void test_startLog_File_Date_1_181() {
      boolean var1 = ((JsonFileLogger)JMockK.spyk(new JsonFileLogger((Context)JMockK.mockk(Context.class, true)))).startLog((File)JMockK.mockk(File.class, true), (Date)JMockK.mockk(Date.class, true));
   }
}
