package com.android.gpstest;

import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class ForegroundOnlyLocationServiceTestFailed {
   @Test
   public void test_subscribeToLocationUpdates_1_53() {
      ((ForegroundOnlyLocationService)JMockK.spyk(new ForegroundOnlyLocationService())).subscribeToLocationUpdates();
   }

   @Test
   public void test_unsubscribeToLocationUpdates_1_61() {
      ((ForegroundOnlyLocationService)JMockK.spyk(new ForegroundOnlyLocationService())).unsubscribeToLocationUpdates();
   }
}
