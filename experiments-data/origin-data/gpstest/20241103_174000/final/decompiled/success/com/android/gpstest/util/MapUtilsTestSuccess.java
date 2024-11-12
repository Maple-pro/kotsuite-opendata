package com.android.gpstest.util;

import android.location.Location;
import com.google.android.gms.maps.model.LatLng;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class MapUtilsTestSuccess {
   @Test
   public void test_makeLatLng_Location_1_277() {
      LatLng var1 = MapUtils.makeLatLng((Location)JMockK.mockk(Location.class, true));
   }

   @Test
   public void test_makeLatLng_double_double_1_273() {
      LatLng var1 = MapUtils.makeLatLng(27.529283015892673, 93.1506728574366);
   }
}
