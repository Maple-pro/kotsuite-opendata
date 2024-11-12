package com.android.gpstest.io;

import android.content.Context;
import android.location.GnssMeasurementsEvent;
import android.location.GnssNavigationMessage;
import android.location.Location;
import io.github.maples.jmockk.JMockK;
import java.util.List;
import org.junit.Test;

public class CsvFileLoggerTestSuccess {
   @Test
   public void test_onGnssMeasurementsReceived_GnssMeasurementsEvent_1_105() {
      ((CsvFileLogger)JMockK.spyk(new CsvFileLogger((Context)JMockK.mockk(Context.class, true)))).onGnssMeasurementsReceived((GnssMeasurementsEvent)JMockK.mockk(GnssMeasurementsEvent.class, true));
   }

   @Test
   public void test_onGnssNavigationMessageReceived_GnssNavigationMessage_1_121() {
      ((CsvFileLogger)JMockK.spyk(new CsvFileLogger((Context)JMockK.mockk(Context.class, true)))).onGnssNavigationMessageReceived((GnssNavigationMessage)JMockK.mockk(GnssNavigationMessage.class, true));
   }

   @Test
   public void test_onGnssStatusChanged_List_Location_1_85() {
      ((CsvFileLogger)JMockK.spyk(new CsvFileLogger((Context)JMockK.mockk(Context.class, true)))).onGnssStatusChanged((List)JMockK.mockk(List.class, true), (Location)JMockK.mockk(Location.class, true));
   }

   @Test
   public void test_onLocationChanged_Location_1_69() {
      ((CsvFileLogger)JMockK.spyk(new CsvFileLogger((Context)JMockK.mockk(Context.class, true)))).onLocationChanged((Location)JMockK.mockk(Location.class, true));
   }

   @Test
   public void test_onNmeaReceived_long_String_1_137() {
      ((CsvFileLogger)JMockK.spyk(new CsvFileLogger((Context)JMockK.mockk(Context.class, true)))).onNmeaReceived(-33L, "NDFlKTh+Skd2CKXwTPrQtUN-HC1WFKzSIRuj5wf7YSd0cWqvE7HlwtUsK30oDkTlaHU8r");
   }
}
