package com.android.gpstest.io;

import android.content.Context;
import io.github.maples.jmockk.JMockK;
import java.util.List;
import org.junit.Test;

public class JsonFileLoggerTestSuccess {
   @Test
   public void test_close_1_201() {
      ((JsonFileLogger)JMockK.spyk(new JsonFileLogger((Context)JMockK.mockk(Context.class, true)))).close();
   }

   @Test
   public void test_onGnssAntennaInfoReceived_List_1_213() {
      ((JsonFileLogger)JMockK.spyk(new JsonFileLogger((Context)JMockK.mockk(Context.class, true)))).onGnssAntennaInfoReceived((List)JMockK.mockk(List.class, true));
   }
}
