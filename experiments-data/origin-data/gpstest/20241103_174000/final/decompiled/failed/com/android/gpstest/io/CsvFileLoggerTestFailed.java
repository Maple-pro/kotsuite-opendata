package com.android.gpstest.io;

import android.content.Context;
import com.android.gpstest.library.model.Orientation;
import io.github.maples.jmockk.JMockK;
import java.util.List;
import org.junit.Test;

public class CsvFileLoggerTestFailed {
   @Test
   public void test_onGnssAntennaInfoReceived_List_1_149() {
      ((CsvFileLogger)JMockK.spyk(new CsvFileLogger((Context)JMockK.mockk(Context.class, true)))).onGnssAntennaInfoReceived((List)JMockK.mockk(List.class, true));
   }

   @Test
   public void test_onOrientationChanged_Orientation_long_long_1_165() {
      ((CsvFileLogger)JMockK.spyk(new CsvFileLogger((Context)JMockK.mockk(Context.class, true)))).onOrientationChanged((Orientation)JMockK.mockk(Orientation.class, true), -14L, -71L);
   }
}
